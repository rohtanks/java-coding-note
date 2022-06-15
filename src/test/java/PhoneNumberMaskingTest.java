import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneNumberMaskingTest {
    @ParameterizedTest
    @DisplayName("뒷 4자리 제외한 문자열 *로 마스킹 처리하기")
    @CsvSource(value = {"01033334444:*******4444", "027778888:*****8888"}, delimiter = ':')
    void 폰번호_문자열_마스킹_처리하기(String input, String expected) {
        PhoneNumberMasking phoneNumberMasking = new PhoneNumberMasking();

        // Given

        // When
        String output = phoneNumberMasking.solution(input);

        // Then
        System.out.println(output);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    @DisplayName("입력 문자열이 4자리일 때 본 문자열 반환하기")
    void 잘못된_입력값_마스킹_처리하기() {
        PhoneNumberMasking phoneNumberMasking = new PhoneNumberMasking();

        String input = "5555";

        assertThat(phoneNumberMasking.solution(input)).isEqualTo("5555");
    }
}
