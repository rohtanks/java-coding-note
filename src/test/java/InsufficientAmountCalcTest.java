import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class InsufficientAmountCalcTest {
    @ParameterizedTest(name = "{index} => price{0}, money{1}, count{2}, expected{3}")
    @MethodSource(value = "parameters")
    void 부족한_금액_계산하기(int price, int money, int count, long expected) {
        InsufficientAmountCalc insufficientAmountCalc = new InsufficientAmountCalc();

        // When
        long answer = insufficientAmountCalc.solution(price, money, count);

        // Then
        System.out.println(answer);
        assertThat(answer).isEqualTo(expected);
    }

    private static Object[] parameters() {
        return new Object[]{
                new Object[]{
                        3,
                        20,
                        4,
                        10L
                },
                new Object[]{
                        3,
                        20,
                        1,
                        0L
                }
        };
    }
}
