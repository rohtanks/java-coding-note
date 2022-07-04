import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class EvenOddTest {

    @ParameterizedTest(name = "{index} => input{0}, expected{1}")
    @CsvSource(value = {"3:Odd", "4:Even", "0:Even"}, delimiter = ':')
    void n번째_문자기준으로_오름차순_정렬(int input, String expected) {
        // Given
        EvenOdd evenOdd = new EvenOdd();

        // When
        String output = evenOdd.solution(input);

        // Then
        assertThat(output).isEqualTo(expected);
    }
}
