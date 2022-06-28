public class MinValueDeletion {
    public int[] solution(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return new int[]{-1};
        }

        // 가장 작은 값 찾기
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = min > arr[i] ? arr[i] : min;
        }

        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                continue;
            }
            answer[index] = arr[i];
            index++;
        }

        return answer;
    }
}
