import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.LongStream;

import static org.assertj.core.api.Assertions.assertThat;

public class SpacedNumbersTest {
    @Test
    @DisplayName("2 부터 시작하고, 2 간격의 5개 배열 생성하기")
    void 간격2가_있는_5개_배열_만들기() {
        SpacedNumbers spacedNumbers = new SpacedNumbers();

        int x = 2;
        int n = 5;
        long[] expected = {2, 4, 6, 8, 10};

        long[] answer = spacedNumbers.solution(x, n);

        assertThat(answer).containsExactly(expected);
    }

    @Test
    @DisplayName("4 부터 시작하고, 4 간격의 3개 배열 생성하기")
    void 간격4가_있는_3개_배열_만들기() {
        SpacedNumbers spacedNumbers = new SpacedNumbers();

        int x = 4;
        int n = 3;
        long[] expected = {4, 8, 12};

        long[] answer = spacedNumbers.solution(x, n);
        Arrays.stream(answer).forEach(l -> System.out.println(l));

        assertThat(answer).containsExactly(expected);
    }
}
