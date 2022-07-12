import java.util.ArrayList;

public class MockTest {

    private static final int[] MAN1 = {1, 2, 3, 4, 5};
    private static final int[] MAN2 = {2, 1, 2, 3, 2, 4, 2, 5};
    private static final int[] MAN3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public int[] solution(int[] answers) {
        int score1 = 0, score2 = 0, score3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == MAN1[i % MAN1.length]) score1++;
            if (answers[i] == MAN2[i % MAN2.length]) score2++;
            if (answers[i] == MAN3[i % MAN3.length]) score3++;
        }

        // 최고 득점자 점수
        int max = Math.max(score1, Math.max(score2, score3));

        // 결과 list
        ArrayList<Integer> list = new ArrayList<>();
        if (max == score1) list.add(1);
        if (max == score2) list.add(2);
        if (max == score3) list.add(3);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
