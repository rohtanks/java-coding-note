import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringManagerTest {

    StringManager stringManager;

    @BeforeEach
    void setUp() {
        stringManager = new StringManager();
    }

    @Test
    void 문자열의_길이가_4또는6인지_확인() {
        // Given
        String input = "a234";

        // When
        boolean output = stringManager.isRightLength(input);

        // Then
        assertThat(output).isTrue();
    }

    @Test
    void 문자열이_숫자형인지_확인() {
        // Given
        String input = "a234";

        // When
        boolean output = stringManager.isNumerical(input);

        // Then
        assertThat(output).isFalse();
    }

    @Test
    void 길이가_4또는6이고_숫자형인지_확인() {
        // Given
        String input = "a234";

        // When
        boolean output = stringManager.solution(input);

        // Then
        assertThat(output).isFalse();
    }

    @Test
    void 문자열_내림차순으로_정렬() {
        // Given
        String input = "Zbcdefg";

        // When
        String output = stringManager.reverseSort(input);

        // Then
        assertThat(output).isEqualTo("gfedcbZ");
    }
}
