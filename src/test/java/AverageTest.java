import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class AverageTest {
    @ParameterizedTest(name = "{index} => input{0}, expected{1}")
    @MethodSource
    void 배열의_평균값_구하기(int[] input, double expected) {
        Average average = new Average();
        // When
        double answer = average.solution(input);

        // Then
        assertThat(answer).isEqualTo(expected);
    }

    @ParameterizedTest(name = "{index} => input{0}, expected{1}")
    @MethodSource(value = "배열의_평균값_구하기")
    void 배열의_평균값_구하기_without_라이브러리(int[] input, double expected) {
        Average average = new Average();
        // When
        double answer = average.solution2(input);

        // Then
        assertThat(answer).isEqualTo(expected);
    }

    private static Object[] 배열의_평균값_구하기() {
        return new Object[]{
                new Object[]{
                        new int[]{1, 2, 3, 4},
                        2.5
                },
                new Object[]{
                        new int[]{5, 5},
                        5
                }
        };
    }
}
