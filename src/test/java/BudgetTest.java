import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BudgetTest {
    Budget budget;

    @BeforeEach
    void setUp() {
        budget = new Budget();
    }

    @Test
    @DisplayName("첫 번째 input 테스트")
    void 배열의_각_원소_합이_예산보다_작을때_원소의_카운트를_구한다() {
        int[] requestInput = {1, 3, 2, 5, 4};
        int budgetInput = 9;

        int answer = budget.solution(requestInput, budgetInput);
        System.out.println(answer);

        assertThat(answer).isEqualTo(3);
    }

    @Test
    @DisplayName("두 번째 input 테스트")
    void 배열의_각_원소_합이_예산보다_작을때_원소의_카운트를_구한다2() {
        int[] requestInput = {2, 2, 3, 3};
        int budgetInput = 10;

        int answer = budget.solution(requestInput, budgetInput);
        System.out.println(answer);

        assertThat(answer).isEqualTo(4);
    }
}
