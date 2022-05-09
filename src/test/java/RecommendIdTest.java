import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecommendIdTest {

    private RecommendId recommendId;

    @BeforeEach
    void setUp() {
        this.recommendId = new RecommendId();
    }


    @Test
    @DisplayName("모든 대문자를 소문자로 치환")
    void first_단계_검증() {
        assertThat(recommendId.replaceToLowerCase("ABC")).isEqualTo("abc");
        assertThat(recommendId.replaceToLowerCase("ABcDeF")).isEqualTo("abcdef");
    }

    @Test
    @DisplayName("알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거")
    void second_단계_검증() {
        assertThat(recommendId.removeNotUsedLetter("ABC")).isEqualTo("");
        System.out.println(recommendId.removeNotUsedLetter("ABCabc.!d"));
        assertThat(recommendId.removeNotUsedLetter("ABCabc.!d")).isEqualTo("abc.d");
    }

    @Test
    @DisplayName("마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환")
    void third_단계_검증() {
        assertThat(recommendId.replaceContinuedDotToSingleDot("AB..C")).isEqualTo("AB.C");
        System.out.println(recommendId.replaceContinuedDotToSingleDot("AB..C"));
        assertThat(recommendId.replaceContinuedDotToSingleDot("ab.c!...d")).isEqualTo("ab.c!.d");
        System.out.println(recommendId.replaceContinuedDotToSingleDot("ab.c!...d"));
    }

    @Test
    @DisplayName("마침표(.)가 처음이나 끝에 위치한다면 제거")
    void fourth_단계_검증() {
        assertThat(recommendId.removeEndDot(".ABcd")).isEqualTo("ABcd");
        System.out.println(recommendId.removeEndDot(".ABcd"));
        assertThat(recommendId.removeEndDot("abcd.")).isEqualTo("abcd");
        System.out.println(recommendId.removeEndDot("abcd."));
        assertThat(recommendId.removeEndDot(".abc..deF.")).isEqualTo("abc..deF");
        System.out.println(recommendId.removeEndDot(".abc..deF."));
    }

    @Test
    @DisplayName("빈 문자열이라면, new_id에 \"a\"를 대입")
    void fifth_단계_검증() {
        System.out.println(recommendId.putStringInEmptyString(""));
        assertThat(recommendId.putStringInEmptyString("")).isEqualTo("a");
        System.out.println(recommendId.putStringInEmptyString(" "));
        assertThat(recommendId.putStringInEmptyString(" ")).isEqualTo("a");
        System.out.println(recommendId.putStringInEmptyString(".abc..deF."));
        assertThat(recommendId.putStringInEmptyString(".abc..deF.")).isEqualTo(".abc..deF.");
    }

    @Test
    @DisplayName("길이가 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거")
    void sixth_단계_검증() {
        System.out.println(recommendId.removeOverMaxLength("1234567890abcde"));
        assertThat(recommendId.removeOverMaxLength("1234567890abcde")).isEqualTo("1234567890abcde");
        System.out.println(recommendId.removeOverMaxLength("1234567890abcdef"));
        assertThat(recommendId.removeOverMaxLength("1234567890abcde")).isEqualTo("1234567890abcde");
    }

    @Test
    @DisplayName("길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임")
    void seventh_단계_검증() {
        System.out.println(recommendId.putStringUnderMinLength("Ab"));
        assertThat(recommendId.putStringUnderMinLength("Ab")).isEqualTo("Abb");
        System.out.println(recommendId.putStringUnderMinLength("AbC"));
        assertThat(recommendId.putStringUnderMinLength("AbC")).isEqualTo("AbC");
    }
}
