import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class DivisorFinderTest {
    @ParameterizedTest
    @CsvSource(value = {"10:3", "12:11", "30:29"}, delimiter = ':')
    void 나머지가_1이_되는_가장_작은_수_찾기(int input, int expected) {
        // Given
        DivisorFinder divisorFinder = new DivisorFinder();

//        int input = 10;

        // When
        int answer = divisorFinder.solution(input);

        // Then
        assertThat(answer).isEqualTo(expected);

    }
}
