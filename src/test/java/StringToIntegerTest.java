import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringToIntegerTest {
    @ParameterizedTest
    @CsvSource(value = {"1609:1609", "-1234:-1234", "+1233:1233"}, delimiter = ':')
    void 문자열을_숫자로_변환(String input, int expected) {
        // Given
        StringToInteger stringToInteger = new StringToInteger();

        // When
        int output = stringToInteger.solution(input);

        // Then
        assertThat(output).isEqualTo(expected);
    }
}
