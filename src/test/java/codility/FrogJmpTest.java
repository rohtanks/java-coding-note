package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogJmpTest {

    FrogJmp frogJmp;

    @BeforeEach
    void setUp() {
        frogJmp = new FrogJmp();
    }

    @Test
    void 최소_점프_횟수_찾기() {

        int answer = frogJmp.solution(10, 85, 30);

        assertThat(answer).isEqualTo(3);
        assertThat(frogJmp.solution(5, 65, 5)).isEqualTo(12);
    }

    @Test
    void 점프_횟수_0_테스트() {
        assertThat(frogJmp.solution(20, 20, 30)).isEqualTo(0);
    }
}
