import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class KthNumberTest {
    @Test
    void 숫자배열을_i번째부터_j번째까지_자르기() {
        KthNumber kthNumber = new KthNumber();
        int[] inputArray = {1, 5, 2, 6, 3, 7, 4};
        int start = 2, end = 5;

        int[] outputArray = kthNumber.cutArray(inputArray, start, end);
        Arrays.stream(outputArray).forEach(i -> System.out.println(i));
        assertThat(outputArray).isEqualTo(new int[]{5, 2, 6, 3});
    }

    @Test
    void 숫자배열을_오름차순으로_정렬하고_k번째수_구하기() {
        KthNumber kthNumber = new KthNumber();
        int[] inputArray = {5, 2, 6, 3};
        int kth = 3;

        int output = kthNumber.sortAndGet(inputArray, 3);
        assertThat(output).isEqualTo(5);
    }

    @Test
    void solution_구하기() {
        KthNumber kthNumber = new KthNumber();
        int[] inputArray = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] output = kthNumber.solution(inputArray, commands);

        Arrays.stream(output).forEach(i -> {
            System.out.println(i);
        });

        assertThat(output).isEqualTo(new int[]{5, 6, 3});
    }
}
