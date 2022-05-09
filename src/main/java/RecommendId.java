public class RecommendId {
    private String newId;

    public String getNewId() {
        return this.newId;
    }

    public void setNewId(String newId) {
        this.newId = newId;
    }

    public RecommendId replaceToLowerCase() {
        this.newId = newId.toLowerCase();
        return this;
    }

    public RecommendId removeNotUsedLetter() {
        this.newId = newId.replaceAll("[^a-z0-9\\-_.]*", "");
        return this;
    }

    public RecommendId replaceContinuedDotToSingleDot() {
        this.newId = newId.replaceAll("[.]+", ".");
        return this;
    }

    public RecommendId removeEndDot() {
        this.newId = newId.replaceAll("^[.]|[.]$", "");
        return this;
    }

    public RecommendId putStringInEmptyString() {
        this.newId = newId.replaceAll("\\s", "").replaceAll("^$", "a");
        return this;
    }

    public RecommendId removeOverMaxLength() {
        if (newId.length() > 15) {
            this.newId = newId.substring(0, 15);
        }
        return this;
    }

    public RecommendId putStringUnderMinLength() {
        if (newId.length() < 3) {
            while (newId.length() < 3) {
                newId += newId.charAt(newId.length() - 1);
            }
        }
        return this;
    }
}
