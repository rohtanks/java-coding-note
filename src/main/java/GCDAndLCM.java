public class GCDAndLCM {
    public int getGcd(int n, int m) {
        // 유클리드 호제법
        /*
        a와 b가 있고, a를 b로 나눈 나머지 r이 있다. 여기서 a와 b의 최대공약수는 b와 r의 최대공약수와 같다
         */
        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }

        return n;
    }

    public int getLcm(int n, int m) {
        // 최소공배수
        /*
        n * m / 최대공약수
         */
        return n * m / getGcd(n, m);
    }

    public int[] solution(int n, int m) {
        return new int[]{getGcd(n, m), getLcm(n, m)};
    }
}
