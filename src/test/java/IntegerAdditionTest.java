import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegerAdditionTest {
    @Test
    void 정수_더하기_테스트() {
        IntegerAddition integerAddition = new IntegerAddition();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        assertThat(integerAddition.solution(absolutes, signs)).isEqualTo(9);
    }
}
