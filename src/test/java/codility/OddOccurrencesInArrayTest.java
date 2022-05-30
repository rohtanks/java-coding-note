package codility;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddOccurrencesInArrayTest {
    @Test
    void 길이가_홀수개_배열에서_짝이_없는_값_찾기() {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        int[] inputArray = new int[]{9, 3, 9, 3, 9, 7, 9};
        int[] inputArray2 = new int[]{2, 6, 9, 3, 9, 6, 9, 3, 9};

        int solution = oddOccurrencesInArray.solution(inputArray);
        int solution2 = oddOccurrencesInArray.solution(inputArray2);

        assertThat(solution).isEqualTo(7);
        assertThat(solution2).isEqualTo(2);
    }
}
