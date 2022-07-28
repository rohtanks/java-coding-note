public class MinimumRactangle {
    public int[][] arrangeArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] < arr[i][1]) {
                int temp = arr[i][0];
                arr[i][0] = arr[i][1];
                arr[i][1] = temp;
            }
        }
        return arr;
    }

    public int findMaxMulti(int[][] arr) {
        int maxW = 0, maxH = 0;

        for (int i = 0; i < arr.length; i++) {
            maxW = arr[i][0] > maxW ? arr[i][0] : maxW;
            maxH = arr[i][1] > maxH ? arr[i][1] : maxH;
        }

        return maxW * maxH;
    }

    public int solution(int[][] sizes) {
        return findMaxMulti(arrangeArray(sizes));
    }
}
