import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberSpliterTest {
    @ParameterizedTest(name = "{index} => input{0}, expected{1}")
    @MethodSource(value = "parameters")
    void 첫번째(long input, int[] expected) {
        NumberSpliter numberSpliter = new NumberSpliter();
        // When
        int[] answer = numberSpliter.solution(input);

        // Then
        assertThat(answer).isEqualTo(expected);
    }

    private static Object[] parameters() {
        return new Object[]{
                new Object[]{
                        12345,
                        new int[]{5, 4, 3, 2, 1}
                }
        };
    }
}
