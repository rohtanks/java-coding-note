import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int total = 0;

        for (int i = 0; i < d.length; i++) {
            total += d[i];

            if (total > budget)
                return i;
        }

        return d.length;
    }
}
