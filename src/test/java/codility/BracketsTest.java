package codility;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class BracketsTest {
    @ParameterizedTest
    @CsvSource(value = {"{[()()]}:1", "([)()]:0", "{{{{{{{{{{{{{{}}}}}}}}}}}}}}:1"}, delimiter = ':')
    void 스택을_사용해_괄호가_정상적으로_중첩됐는지_확인(String input, int expected) {
        Brackets brackets = new Brackets();

        int answer = brackets.solution(input);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    void Empty_String_테스트() {
        Brackets brackets = new Brackets();

        int answer = brackets.solution("");

        assertThat(answer).isEqualTo(1);
    }
}
