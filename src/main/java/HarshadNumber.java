public class HarshadNumber {
    public boolean solution(int x) {
        // 각 자릿수의 합
        int digitSum = 0;
        // x 저장할 임시 변수
        int temp = x;

        while (x > 0) {
            digitSum += x % 10;
            x /= 10;
        }

        return temp % digitSum == 0;
    }
}
