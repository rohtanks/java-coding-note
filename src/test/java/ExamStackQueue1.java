import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@Slf4j
public class ExamStackQueue1 {

    static int[] progresses;
    static int[] speeds;

    @BeforeAll
    public static void preSet() {
        progresses = new int[]{93, 30, 55};
        speeds = new int[]{1, 30, 5};
    }

    @Test
    public void testSolution1() {
        System.out.println();
    }

    public int[] solution1(int[] progresses, int[] speeds) {
        int[] answer = {};
        return answer;
    }
}
