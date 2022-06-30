import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NumberDescOrder {
    public long solution(long n) {
        // 각 자릿수 List 만들기
        List<Long> digitList = new ArrayList<>();
        while (n > 0) {
            digitList.add(n % 10);
            n /= 10;
        }

        digitList.sort(Comparator.reverseOrder());

        StringBuffer sb = new StringBuffer();
        for (Long digit : digitList) {
            sb.append(digit);
        }

        return Long.parseLong(sb.toString());
    }
}
