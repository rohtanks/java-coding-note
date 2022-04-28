import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class NumbersTest {
    private int[] inputs;

    @BeforeEach
    void setUp() {
        inputs = new int[]{1,2,3,4,6,7,8,0};
    }

    @Test
    void 없는_숫자_더하기() {
        Numbers numbers = new Numbers();
        assertThat(numbers.solution(inputs)).isEqualTo(14);
    }

    @Test
    void 없는_숫자_더하기_GOOD() {
        Numbers numbers = new Numbers();
        assertThat(numbers.solution_good(inputs)).isEqualTo(14);
    }
}
