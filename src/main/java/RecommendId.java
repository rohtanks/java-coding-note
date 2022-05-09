public class RecommendId {
    private String newId;

    public String getNewId() {
        return this.newId;
    }

    public RecommendId replaceToLowerCase(String newId) {
        this.newId = newId.toLowerCase();
        return this;
    }

    public RecommendId removeNotUsedLetter(String newId) {
        this.newId = newId.replaceAll("[^a-z0-9\\-_.]*", "");
        return this;
    }

    public RecommendId replaceContinuedDotToSingleDot(String newId) {
        this.newId = newId.replaceAll("[.]+", ".");
        return this;
    }

    public RecommendId removeEndDot(String newId) {
        this.newId = newId.replaceAll("^[.]|[.]$", "");
        return this;
    }

    public RecommendId putStringInEmptyString(String newId) {
        this.newId = newId.replaceAll("\\s", "").replaceAll("^$", "a");
        return this;
    }

    public RecommendId removeOverMaxLength(String newId) {
        this.newId = newId.replaceAll("^{16,}$", "");
        return this;
    }

    public RecommendId putStringUnderMinLength(String newId) {
        if (newId.length() < 3) {
            while (newId.length() < 3) {
                newId += newId.charAt(newId.length() - 1);
            }
        }
        this.newId = newId;
        return this;
    }
}
