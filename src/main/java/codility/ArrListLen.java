package codility;

public class ArrListLen {
    public int solution(int[] A) {
        int result = 0;
        int nextIndex = 0;
        while (nextIndex >= 0) {
            nextIndex = A[nextIndex];
            result++;
        }

        return result;
    }
}
