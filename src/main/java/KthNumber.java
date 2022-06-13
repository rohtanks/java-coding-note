import java.util.Arrays;

public class KthNumber {
    public int[] cutArray(int[] inputArray, int start, int end) {
        return Arrays.copyOfRange(inputArray, start - 1, end);
    }

    public int sortAndGet(int[] inputArray, int k) {
        Arrays.sort(inputArray);
        return inputArray[k - 1];
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0;

        for (int[] command : commands) {
            answer[i] = sortAndGet(cutArray(array, command[0], command[1]), command[2]);
            i++;
        }

        return answer;
    }
}
