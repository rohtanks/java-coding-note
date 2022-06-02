import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeNumberMakerTest {
    @Test
    void 소수가_아닌_숫자_판별() {
        PrimeNumberMaker primeNumberMaker = new PrimeNumberMaker();
        // Given
        int input = 8;

        // When
        boolean isPrimeNumber = primeNumberMaker.isPrimeNumber(input);

        // Then
        assertThat(isPrimeNumber).isFalse();
    }

    @Test
    void 소수인_숫자_판별() {
        PrimeNumberMaker primeNumberMaker = new PrimeNumberMaker();
        // Given
        int input = 3;

        // When
        boolean isPrimeNumber = primeNumberMaker.isPrimeNumber(input);

        // Then
        assertThat(isPrimeNumber).isTrue();
    }

    @Test
    void 배열의_숫자_3개의_합이_소수인_조합_갯수_구하기() {
        PrimeNumberMaker primeNumberMaker = new PrimeNumberMaker();
        // Given
        int[] inputArray = new int[]{1, 2, 3, 4};

        // When
        int answer = primeNumberMaker.solution(inputArray);

        // Then
        assertThat(answer).isEqualTo(1);
    }
}
