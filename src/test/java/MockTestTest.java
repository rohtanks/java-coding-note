import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class MockTestTest {
    @ParameterizedTest(name = "{index} => arr{0}, expected{1}")
    @MethodSource(value = "parameters")
    void 정답_많이_맞힌_순으로_수포자_번호_응답(int[] arr, int[] expected) {
        // Given
        MockTest mockTest = new MockTest();

        // When
        int[] answer = mockTest.solution(arr);

        // Then
        assertArrayEquals(answer, expected);
    }

    private static Object[] parameters() {
        return new Object[]{
                new Object[]{
                        new int[]{1, 2, 3, 4, 5},
                        new int[]{1}
                },
                new Object[]{
                        new int[]{1,3,2,4,2},
                        new int[]{1,2,3}
                }
        };
    }
}
