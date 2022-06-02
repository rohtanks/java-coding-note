public class PrimeNumberMaker {
    public boolean isPrimeNumber(int input) {
        // 자기 자신을 제외한 절반을 넘는 숫자에서 나눴을 때 0이되는 숫자는 있을 수 없음
        for (int i = 2; i <= input / 2; i++) {
            if (input % i == 0)
                return false;
        }
        return true;
    }

    public int solution(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum % 2 != 0)
                        if (isPrimeNumber(sum))
                            count++;
                }
            }
        }
        return count;
    }
}
