package codility;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountFactorsTest {
    @Test
    void 주어진_정수의_약수의_개수_구하기() {
        CountFactors countFactors = new CountFactors();

        // Given
        int input = 24;

        // When
        int answer = countFactors.solution(input);

        // Then
//        System.out.println(answer);
        assertThat(answer).isEqualTo(8);
    }
}
