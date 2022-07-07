import java.util.ArrayList;
import java.util.List;

public class NumberSpliter {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();

        while (n > 0L) {
            list.add((int) (n % 10));
            n /= 10;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
