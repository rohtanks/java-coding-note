package codility;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestPasswordTest {
    @Test
    void 문자열_공백으로_자르기_테스트() {
        String input = "test 5 a0A pass007 ?xy1";
        LongestPassword longestPassword = new LongestPassword();
        assertThat(longestPassword.splitStringIntoArray(input)).hasSize(5).contains(input.split(" "));
    }

    @ParameterizedTest
    @CsvSource(value = {"test:true", "5:true", "a0A:true", "pass007:true", "?xy1:false"}, delimiter = ':')
    void 문자열_영대소문자_숫자_구성_유효성_확인하기_테스트(String input, boolean expected) {
        LongestPassword longestPassword = new LongestPassword();
        boolean isValid = longestPassword.validateRegExp(input);
        assertThat(isValid).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"test:false", "5:true", "a0A1:false", "pass007:true", "?xy1:false"}, delimiter = ':')
    void 문자열_짝수문자_홀수숫자_유효성_확인하기_테스트(String input, boolean expected) {
        LongestPassword longestPassword = new LongestPassword();
        boolean isValid = longestPassword.validateEvenLetterAndOddDigit(input);
        assertThat(isValid).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"I am0 a boy:3", "You aren3 a03 girl077:7", "test1 tt1 tt040 te010:5", "I test you:-1"}, delimiter = ':')
    void 문자열_가장_긴_문자열_길이_구하기_테스트(String input, int expected) {
        LongestPassword longestPassword = new LongestPassword();
        int count = longestPassword.solution(input);
        assertThat(count).isEqualTo(expected);
    }
}
