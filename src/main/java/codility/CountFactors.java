package codility;

public class CountFactors {
    public int solution(int N) {
        int count = 0;

        // 제곱근까지만 반복하며, 약수를 찾으면 *2 해주고, index가 제곱근과 같을 때는 +1 해준다
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (i == Math.sqrt(N)) count++;
                else count += 2;
            }
        }

        return count;
    }
}
