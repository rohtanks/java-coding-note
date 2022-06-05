import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class DivisorAdditionTest {
    @ParameterizedTest
    @CsvSource(value = {"5:true", "4:false", "16:false", "15:true", "9:false", "2:true", "1:false"}, delimiter = ':')
    void 약수의_개수_even_true_odd_false_구하기(int input, boolean expected) {
        DivisorAddition divisorAddition = new DivisorAddition();

        boolean answer = divisorAddition.isEvenDivisorCount(input);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    void 주어진_범위에서_약수의_개수가_짝수면_더하고_홀수면_빼기() {
        DivisorAddition divisorAddition = new DivisorAddition();

        int left = 13;
        int right = 17;

        int answer = divisorAddition.solution(left, right);

        assertThat(answer).isEqualTo(43);
        assertThat(divisorAddition.solution(24, 27)).isEqualTo(52);
    }
}
