import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StrangeCharacterMaker {
    public List<String> separateBySpace(String input) {

        return Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
    }

    public String makeStrangeCharacter(String input) {
        String[] strings = input.split("");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
            sb.append((i % 2 == 0) ?
                    strings[i].toUpperCase() : strings[i].toLowerCase());
        }

        return sb.toString();
    }

    public String solution(String s) {
        return separateBySpace(s).stream()
                .map(s1 -> makeStrangeCharacter(s1))
                .collect(Collectors.joining(" "));
    }

    public String solution2(String s) {
        String[] strings = s.split("");
        int innerIndex = 0;
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (strings[i].matches("\\s")) {
                innerIndex = 0;
                sb.append(" ");
            } else if (innerIndex % 2 == 0) {
                innerIndex++;
                sb.append(strings[i].toUpperCase());
            } else {
                innerIndex++;
                sb.append(strings[i].toLowerCase());
            }
        }
        return sb.toString();
    }
}
