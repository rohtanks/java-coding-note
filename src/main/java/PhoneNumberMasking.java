public class PhoneNumberMasking {
    public String solution(String phone_number) {
        if (phone_number.length() <= 4)
            return phone_number;

        // 정규표현식 전방탐색으로 구현 방식 변경
        // 뒤에서 4자리를 제외한 임의의 문자 한개를 *로 변경
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}
