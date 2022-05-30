package codility;

import java.util.*;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int value : A) {
            if (set.contains(value)) {
                set.remove(value);
            } else {
                set.add(value);
            }
        }
        return set.stream().iterator().next();
    }
}
