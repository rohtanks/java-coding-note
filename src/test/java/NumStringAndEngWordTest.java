import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class NumStringAndEngWordTest {
    @Test
    void 영단어를_값으로_갖는_Map_생성_확인() {
        Map<String, String> map = NumStringAndEngWord.getWordMap();

        assertThat(map).isNotNull();
        assertThat(map.get("zero")).isEqualTo("0");
    }

    @Test
    void 문자열에서_매칭되는_영단어_키값으로_치환하기() {
        NumStringAndEngWord numStringAndEngWord = new NumStringAndEngWord();
        String input = "one4seveneight";

        String output = numStringAndEngWord.changeEngWordToNumString(input);

        assertThat(output).isEqualTo("1478");
    }

    @Test
    void 문자열을_정수로_변환하기() {
        NumStringAndEngWord numStringAndEngWord = new NumStringAndEngWord();
        String input = "one4seveneight";

        int output = numStringAndEngWord.solution(input);

        assertThat(output).isEqualTo(1478);
    }
}
