import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberDescOrderTest {
    @ParameterizedTest(name = "{index} => input{0}, expected{1}")
    @MethodSource
    void 정수의_각_자릿수를_내림차순으로_정렬하기(long input, long expected) {
        NumberDescOrder numberDescOrder = new NumberDescOrder();

        // Given
//        long input = 118372l;

        // When
        long answer = numberDescOrder.solution(input);

        // Then
        assertThat(answer).isEqualTo(expected);
    }

    private static Object[] 정수의_각_자릿수를_내림차순으로_정렬하기() {
        return new Object[]{
                new Object[]{
                        118372l,
                        873211l
                },
                new Object[]{
                        8000000000l,
                        8000000000l
                },
                new Object[]{
                        1112234569l,
                        9654322111l
                }
        };
    }
}
