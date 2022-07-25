import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberManagerTest {
    @ParameterizedTest(name = "{index} => arr{0}, expected{1}")
    @MethodSource
    void 가장_큰_수_문자열_만들기(int[] arr, String expected) {
        NumberManager numberManager = new NumberManager();
        // Given

        // When
        String answer = numberManager.getLargestNumberString(arr);

        // Then
        assertThat(answer).isEqualTo(expected);
    }

    private static Object[] 가장_큰_수_문자열_만들기() {
        return new Object[]{
                new Object[]{
                        new int[]{6, 10, 2},
                        "6210"
                },
                new Object[]{
                        new int[]{3, 30, 34, 5, 9},
                        "9534330"
                },
                new Object[]{
                        new int[]{0, 0, 0, 0},
                        "0"
                }
        };
    }
}
