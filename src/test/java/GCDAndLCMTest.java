import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class GCDAndLCMTest {
    // GCD = Greatest Common Divisor
    // LCM = Least Common Multiple

    @ParameterizedTest(name = "{index} => inputA{0}, inputB{1}, expected2}")
    @MethodSource(value = "parametersFor최대공약수_구하기")
    void 최대공약수_구하기(int inputA, int inputB, int expected) {
        // Given
        GCDAndLCM gcdAndLcm = new GCDAndLCM();

        // When
        int output = gcdAndLcm.getGcd(inputA, inputB);

        // Then
        assertThat(output).isEqualTo(expected);
    }

    private static Object[] parametersFor최대공약수_구하기() {
        return new Object[]{
                new Object[]{
                        3,
                        12,
                        3
                },
                new Object[]{
                        2,
                        5,
                        1
                }
        };
    }

    @ParameterizedTest(name = "{index} => inputA{0}, inputB{1}, expected2}")
    @MethodSource(value = "parametersFor최소공배수_구하기")
    void 최소공배수_구하기(int inputA, int inputB, int expected) {
        // Given
        GCDAndLCM gcdAndLcm = new GCDAndLCM();

        // When
        int output = gcdAndLcm.getLcm(inputA, inputB);

        // Then
        assertThat(output).isEqualTo(expected);
    }

    private static Object[] parametersFor최소공배수_구하기() {
        return new Object[]{
                new Object[]{
                        3,
                        12,
                        12
                },
                new Object[]{
                        2,
                        5,
                        10
                }
        };
    }

    @ParameterizedTest(name = "{index} => inputA{0}, inputB{1}, expected2}")
    @MethodSource(value = "parametersFor최대공약수_최소공배수_구하기")
    void 최대공약수_최소공배수_구하기(int inputA, int inputB, int[] expected) {
        // Given
        GCDAndLCM gcdAndLcm = new GCDAndLCM();

        // When
        int[] output = gcdAndLcm.solution(inputA, inputB);

        // Then
        assertThat(output).isEqualTo(expected);
    }

    private static Object[] parametersFor최대공약수_최소공배수_구하기() {
        return new Object[]{
                new Object[]{
                        3,
                        12,
                        new int[]{3, 12}
                },
                new Object[]{
                        2,
                        5,
                        new int[]{1, 10}
                }
        };
    }
}
