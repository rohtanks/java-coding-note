package codility;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrListLenTest {
    @Test
    void 입력배열의_길이를_반환하기() {
        ArrListLen arrListLen = new ArrListLen();
        int[] input = new int[]{1, 4, -1, 3, 2};
        int length = arrListLen.solution(input);
        assertThat(length).isEqualTo(4);
    }

}
