public class RecommendId {
    public boolean isValid(String newId) {
//        if (newId == null || (newId.length() < 3 || newId.length() > 15))
//            return false;
        if (newId.matches("^[a-z0-9-_]{1}[a-z0-9-_.]{2,14}$"))
            return true;

        return false;
    }

    public String replaceToLowerCase(String newId) {
        return newId.toLowerCase();
    }

    public String removeNotUsedLetter(String newId) {
        return newId.replaceAll("[^a-z0-9\\-_.]*", "");
    }

    public String replaceContinuedDotToSingleDot(String newId) {
        return newId.replaceAll("[.]+", ".");
    }

    public String removeEndDot(String newId) {
        return newId.replaceAll("^[.]|[.]$", "");
    }

    public String putStringInEmptyString(String newId) {
        return newId.replaceAll("\\s", "").replaceAll("^$", "a");
    }

    public String removeOverMaxLength(String newId) {
        return newId.replaceAll("^{16,}$", "");
    }

    public String putStringUnderMinLength(String newId) {
        if (newId.length() < 3) {
            while (newId.length() < 3) {
                newId += newId.charAt(newId.length() - 1);
            }
        }
        return newId;
    }
}
