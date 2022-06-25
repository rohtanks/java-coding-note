package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class DistinctTest {

    @ParameterizedTest(name = "{index} => input={0}, expected={1}")
    @MethodSource("parametersFor배열에서_고유한_정수의_개수를_구한다")
    void 배열에서_고유한_정수의_개수를_구한다(int[] input, int expected) {
        Distinct distinct = new Distinct();
        // Given
//        int[] input = {2, 1, 1, 2, 3, 1};

        // When
        int answer = distinct.solution(input);

        // Then
        assertThat(answer).isEqualTo(expected);
    }

    private static Object[] parametersFor배열에서_고유한_정수의_개수를_구한다() {
        return new Object[]{
                new Object[]{
                        new int[]{1, 2, 3, 4, 5},
                        5
                },
                new Object[]{
                        new int[]{2, 9, 3, 2, 2, 3, 1},
                        4
                }
        };
    }
}
