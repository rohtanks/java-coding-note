package codility;

public class LongestPassword {
    public String[] splitStringIntoArray(String input) {
        return input.split(" ");
    }

    public boolean validateRegExp(String input) {
        return input.matches("[a-zA-Z0-9]*");
    }

    public boolean validateEvenLetterAndOddDigit(String input) {
        boolean result = false;
        int letterLength = 0;
        int inputLength = input.length();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // 문자
                letterLength++;
            }
        }
        int digitLength = inputLength - letterLength;

        if (letterLength % 2 == 0 && digitLength % 2 != 0) {
            result = true;
        }

        return result;
    }

    public int solution(String S) {
        int result = -1;

        String[] stringArray = splitStringIntoArray(S);
        for (String split : stringArray) {
            if (validateRegExp(split) && validateEvenLetterAndOddDigit(split)) {
                int temp = split.length();
                if (temp > result) {
                    result = temp;
                }
            }
        }

        return result;
    }
}
