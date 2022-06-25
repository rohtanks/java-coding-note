package codility;

import java.util.*;

public class Distinct {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        Arrays.stream(A).forEach(i -> set.add(i));

        return set.size();
    }
}
