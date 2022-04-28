import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Slf4j
public class ExamFullSearch {

    static String[] participant;
    static String[] completion;

    static int[] answers;

    @BeforeAll
    public static void preSet() {
        participant = new String[]{"kiki", "ahram", "jungbu", "mimi", "jungbu"};
        completion = new String[]{"kiki", "mimi", "jungbu", "ahram"};
        answers = new int[]{1,2,3,4,5};

    }

    @Test
    public void testSolution1() {
        int[] result = solutionHashLevel1(answers);
        Assertions.assertEquals(1, result);
    }

    private int[] solutionHashLevel1(int[] answers) {
        String answer = "";

        Map<String, Integer> hashMap = new HashMap();
        for (String part : participant) {
            hashMap.put(part, hashMap.getOrDefault(part, 0) + 1);
        }

        for (String comp : completion) {
            hashMap.put(comp, hashMap.get(comp) - 1);
        }

        for (Iterator<Map.Entry<String, Integer>> it = hashMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() != 0)
                answer = entry.getKey();

        }

        return new int[]{};
    }


    @Test
    public void testSolution2() {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solutions = new int[]{5, 6, 3};
        int[] returnArray = solutionSortingLevel1(array, commands);
        log.info("returnArray - {}", returnArray);

        Assertions.assertArrayEquals(solutions, returnArray);
    }

    private int[] solutionSortingLevel1(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int n = commands[i][2] - 1;

            int[] split = Arrays.copyOfRange(array, start, end);

            Arrays.sort(split);

            answer[i] = split[n];
        }

        return answer;
    }
}
