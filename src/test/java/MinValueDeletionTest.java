import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MinValueDeletionTest {
    @ParameterizedTest(name = "{index} => input{0}, expected{1}")
    @MethodSource
    void delete_min_value(int[] input, int[] expected) {
        MinValueDeletion minValueDeletion = new MinValueDeletion();
        // When
        int[] answer = minValueDeletion.solution(input);

        // Then
        assertThat(answer).isEqualTo(expected);
    }

    private static Object[] delete_min_value() {
        return new Object[]{
                new Object[]{
                        new int[]{4, 3, 2, 1},
                        new int[]{4, 3, 2}
                },
                new Object[]{
                        new int[]{10},
                        new int[]{-1}
                },
                new Object[]{
                        new int[]{9, 6, 5, 4, 8, 3, 1},
                        new int[]{9, 6, 5, 4, 8, 3}
                },
                new Object[]{
                        new int[]{5, 1, 4, 3, 2},
                        new int[]{5, 4, 3, 2}
                }
        };
    }
}
