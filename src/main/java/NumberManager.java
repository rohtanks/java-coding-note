import java.util.Arrays;
import java.util.Comparator;

public class NumberManager {
    public String getLargestNumberString(int[] numbers) {
        String[] strings = new String[numbers.length];
        // 문자열 비교를 위해 문자열로 변환
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

//        Arrays.sort(strings, (o1, o2) -> {
//            return (o2 + o1).compareTo(o1 + o2);
//        });

        // 내림차순 정렬(3, 30 -> 303이 아닌 330으로 정렬하기 위함)
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        // 000... 일 때, 0
        if (strings[0].startsWith("0")) {
            return "0";
        }

        StringBuffer sb = new StringBuffer();
        for (String s : strings) {
            sb.append(s);
        }

        return sb.toString();
    }
}
