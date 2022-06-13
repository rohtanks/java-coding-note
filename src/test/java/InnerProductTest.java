import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InnerProductTest {
    @Test
    void 두_배열의_각_인덱스별_곱의_Sum을_구한다() {
        InnerProduct innerProduct = new InnerProduct();

        int[] firstInput = {1, 2, 3, 4};
        int[] secondInput = {-3, -1, 0, 2};

        int answer = innerProduct.solution(firstInput, secondInput);

        assertThat(answer).isEqualTo(3);
    }

    @Test
    void 두_배열의_각_인덱스별_곱의_Sum을_구한다2() {
        InnerProduct innerProduct = new InnerProduct();

        int[] firstInput = {-1, 0, 1};
        int[] secondInput = {1, 0, -1};

        int answer = innerProduct.solution(firstInput, secondInput);

        assertThat(answer).isEqualTo(-2);
    }
}
