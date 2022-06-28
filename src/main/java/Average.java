import java.util.Arrays;

public class Average {
    public double solution(int[] arr) {
        // 퍼포먼스가 떨어짐
        return Arrays.stream(arr).average().orElse(0);
    }

    public double solution2(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double) sum / arr.length;
    }
}
