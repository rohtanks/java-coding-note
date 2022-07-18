public class StringManager {
    public boolean isRightLength(String input) {
        if (input.length() == 4 || input.length() == 6)
            return true;
        else
            return false;
    }

    public boolean isNumerical(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean solution(String s) {
        return isRightLength(s) && isNumerical(s);
    }
}
