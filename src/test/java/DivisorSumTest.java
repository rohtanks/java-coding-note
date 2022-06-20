import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class DivisorSumTest {
    @ParameterizedTest(name = "{index} => input={0}, expected={1}")
//    @CsvSource(value = {"12, 28", "5, 6", "0, 0"})
    @MethodSource("parametersFor약수의_개수_even_true_odd_false_구하기")
    void 약수의_개수_even_true_odd_false_구하기(int input, int expected) {
        DivisorSum divisorSum = new DivisorSum();

        int answer = divisorSum.solution(input);

        assertThat(answer).isEqualTo(expected);
    }

    private static Object[] parametersFor약수의_개수_even_true_odd_false_구하기() {
        return new Object[] {
                new Object[] {12, 28}
                , new Object[] {5, 6}
                , new Object[] {0, 0}
        };
    }
}
