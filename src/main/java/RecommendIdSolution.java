public class RecommendIdSolution {
    public String solutionTest(String new_id) {
        String answer = "";
        RecommendId recommendId = new RecommendId();
        recommendId.setNewId(new_id);
        recommendId.replaceToLowerCase()
                    .removeNotUsedLetter()
                    .replaceContinuedDotToSingleDot()
                    .removeEndDot()
                    .putStringInEmptyString()
                    .removeOverMaxLength()
                    .removeEndDot()
                    .putStringUnderMinLength();
        return answer = recommendId.getNewId();
    }

}
