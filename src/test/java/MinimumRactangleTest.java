import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumRactangleTest {
    @ParameterizedTest(name = "{index} => arr{0}, expected{1}")
    @MethodSource
    void 각원소의_0인덱스가_큰값으로_정렬(int[][] arr, int[][] expected) {
        MinimumRactangle minimumRactangle = new MinimumRactangle();
        // Given

        // When
        int[][] answer = minimumRactangle.arrangeArray(arr);

        // Then
        assertThat(answer).isEqualTo(expected);
    }

    private static Object[] 각원소의_0인덱스가_큰값으로_정렬() {
        return new Object[]{
                new Object[]{
                        new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}},
                        new int[][]{{60, 50}, {70, 30}, {60, 30}, {80, 40}}
                },
                new Object[]{
                        new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}},
                        new int[][]{{10, 7}, {12, 3}, {15, 8}, {14, 7}, {15, 5}},
                },
        };
    }

    @ParameterizedTest(name = "{index} => arr{0}, expected{1}")
    @MethodSource
    void 각원소의_w_h_인덱스별_최대값의_곱을_구한다(int[][] arr, int expected) {
        MinimumRactangle minimumRactangle = new MinimumRactangle();
        // Given

        // When
        int answer = minimumRactangle.findMaxMulti(arr);

        // Then
        assertThat(answer).isEqualTo(expected);
    }

    private static Object[] 각원소의_w_h_인덱스별_최대값의_곱을_구한다() {
        return new Object[]{
                new Object[]{
                        new int[][]{{60, 50}, {70, 30}, {60, 30}, {80, 40}},
                        4000
                },
        };
    }
}
