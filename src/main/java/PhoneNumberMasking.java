public class PhoneNumberMasking {
    public String solution(String phone_number) {
        char[] numberArray = phone_number.toCharArray();
        if (numberArray.length <= 4)
            return phone_number;

        for (int i = (numberArray.length - 1) - 4; i >= 0; i--) {
            numberArray[i] = '*';
        }

        return new String(numberArray);
    }
}
