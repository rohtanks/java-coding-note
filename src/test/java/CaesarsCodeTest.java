import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CaesarsCodeTest {
    @ParameterizedTest(name = "{index} => input{0}, distance{1}, expected{2}")
    @MethodSource(value = "parametersFor시저암호를_만든다")
    void 시저암호를_만든다(String input, int distance, String expected) {
        // Given
        CaesarsCode caesarsCode = new CaesarsCode();

        // When
        String answer = caesarsCode.solution(input, distance);

        // Then
        assertThat(answer).isEqualTo(expected);
    }

    private static Object[] parametersFor시저암호를_만든다() {
        return new Object[]{
                new Object[]{
                        "AB",
                        1,
                        "BC"
                },
                new Object[]{
                        "z",
                        1,
                        "a"
                },
                new Object[]{
                        "a B z",
                        4,
                        "e F d"
                }
        };
    }
}
