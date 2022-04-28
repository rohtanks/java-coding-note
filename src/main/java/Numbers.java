import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public int solution(int[] numbers) {
        int answer = -1;
        int allSum = 0;
        int existingSum = 0;
        List<Integer> allList = new ArrayList<>(9 - 0 + 1);
        for (int i = 0; i <= 9; i++) {
            allList.add(i);
            allSum += i;
        }

        for (int value : numbers) {
            for (int i = 0; i < allList.size(); i++) {
                if (value == allList.get(i)) {
                    existingSum += value;
                    allList.remove(i);
                }
            }
        }
        answer = allSum - existingSum;
        return answer;
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();

        numbers.solution(new int[]{0, 1, 3});
    }

    public int solution_good(int[] numbers) {
        int answer = 45;
        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}
