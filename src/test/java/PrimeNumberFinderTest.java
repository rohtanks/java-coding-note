import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeNumberFinderTest {
    @ParameterizedTest(name = "{index} => input{0}, expected{1}")
    @MethodSource
    void 소수인지_판별하기(int input, boolean expected) {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();

        // Given

        // When
        boolean answer = primeNumberFinder.isPrimeNumber(input);

        assertThat(answer).isEqualTo(expected);
    }

    @ParameterizedTest(name = "{index} => input{0}, expected{1}")
    @MethodSource
    void input까지의_정수_중_소수의_개수_구하기(int input, int expected) {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();

        int answer = primeNumberFinder.solution(input);

        assertThat(answer).isEqualTo(expected);
    }

    private static Object[] 소수인지_판별하기() {
        return new Object[]{
                new Object[]{
                        3, true
                },
                new Object[]{
                        5, true
                },
                new Object[]{
                        14, false
                },
                new Object[]{
                        524287, true
                }
        };
    }

    private static Object[] input까지의_정수_중_소수의_개수_구하기() {
        return new Object[]{
                new Object[]{
                        10, 4
                },
                new Object[]{
                        5, 3
                },
                new Object[]{
                        17, 7
                }
        };
    }
}
