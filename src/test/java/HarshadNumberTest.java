import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

public class HarshadNumberTest {
    @ParameterizedTest
    @CsvSource(value = {"10:true", "12:true", "11:false", "13:false"}, delimiter = ':')
    @DisplayName("입력한 정수가 하샤드 수인지 여부 boolean 확인")
    void 하샤드_수인지_여부_확인하기(int input, boolean expected) {
        HarshadNumber harshadNumber = new HarshadNumber();

        boolean answer = harshadNumber.solution(input);

        System.out.println(answer);
        assertThat(answer).isEqualTo(expected);
    }
}
