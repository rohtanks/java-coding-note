public class PrimeNumberFinder {
    public boolean isPrimeNumber(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int solution(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) {
                count++;
            }
        }

        return count;
    }
}
