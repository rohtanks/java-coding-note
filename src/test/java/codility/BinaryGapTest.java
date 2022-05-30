package codility;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryGapTest {
    @Test
    void 입력값의_이진표현을_나타내기_테스트() {
        BinaryGap binaryGap = new BinaryGap();
        int input = 1041;
        String binaryExp = binaryGap.getBinaryExp(input);
        assertThat(binaryExp).isEqualTo("10000010001");
    }

    @Test
    void 입력값의_이진간격을_나타내기_테스트() {
        BinaryGap binaryGap = new BinaryGap();
        int input = 1041;
        int maxBinaryGap = binaryGap.getMaxBinaryGap(input);
        assertThat(maxBinaryGap).isEqualTo(5);
    }
}
