import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class StrangeCharacterMakerTest {
    @Test
    void 공백으로_단어_분리하기() {
        // Given
        StrangeCharacterMaker strangeCharacterMaker = new StrangeCharacterMaker();

        String input = "try hello  world";
        List<String> expected = Arrays.stream(new String[]{"try", "hello", "world"}).collect(Collectors.toList());

        // When
        List<String> output = strangeCharacterMaker.separateBySpace(input);
        output.stream().forEach(i -> {
            System.out.println(i);
            System.out.println(i.length());
        });

        // Then
        assertThat(output).containsAll(expected);
    }

    @Test
    void 짝수인덱스_대문자_홀수인덱스_소문자_치환() {
        // Given
        StrangeCharacterMaker strangeCharacterMaker = new StrangeCharacterMaker();

        String input = "try";
        String expected = "TrY";

        // When
        String output = strangeCharacterMaker.makeStrangeCharacter(input);

        // Then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void solutionTest() {
        // Given
        StrangeCharacterMaker strangeCharacterMaker = new StrangeCharacterMaker();

        String input = "try hello  world";
        String expected = "TrY HeLlO WoRlD";

        // When
        String output = strangeCharacterMaker.solution(input);

        // Then
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void solution2Test() {
        // Given
        StrangeCharacterMaker strangeCharacterMaker = new StrangeCharacterMaker();

        String input = "try hello  world";
        String expected = "TrY HeLlO  WoRlD";

        // When
        String output = strangeCharacterMaker.solution2(input);
        System.out.println(output);
        // Then
        assertThat(output).isEqualTo(expected);
    }
}
