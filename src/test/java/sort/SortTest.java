package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class SortTest {
    @Test
    void 정수_배열_오름차순_선택_정렬() {
        int[] input = new int[]{8, 1, 6, 9, 5, 2, 4, 3, 0, 7};
        int[] compare = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Sort sort = new Sort();
        int[] sortedArray = sort.selectionSortInteger(input);
        for (int i : sortedArray) {
            System.out.println(i);
        }

        assertThat(Arrays.equals(sortedArray, compare)).isTrue();
    }
}
