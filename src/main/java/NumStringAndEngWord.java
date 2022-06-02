import java.util.HashMap;
import java.util.Map;

public class NumStringAndEngWord {

    private static final Map<String, String> wordMap = new HashMap<>(){{
        put("zero", "0");
        put("one", "1");
        put("two", "2");
        put("three", "3");
        put("four", "4");
        put("five", "5");
        put("six", "6");
        put("seven", "7");
        put("eight", "8");
        put("nine", "9");
    }};

    public static Map<String, String> getWordMap() {
        return wordMap;
    }

    public String changeEngWordToNumString(String mixedWords) {
        for (String key : wordMap.keySet()) {
            if (mixedWords.contains(key)) {
                mixedWords = mixedWords.replace(key, wordMap.get(key));
            }
        }

        return mixedWords;
    }

    public int solution(String s) {
        return Integer.parseInt(changeEngWordToNumString(s));
    }
}
