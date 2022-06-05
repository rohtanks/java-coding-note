public class DivisorAddition {
    public boolean isEvenDivisorCount(int input) {
        if (input == 1)
            return false;

        int divisorCount = 2;   // 1과 자기자신은 기본 약수
        for (int i = 2; i <= input / 2; i++) {
            if (input % i == 0)
                divisorCount++;
        }
        System.out.println("약수의 개수: " + divisorCount);
        return divisorCount % 2 == 0 ? true : false;
    }

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (isEvenDivisorCount(i))
                answer += i;
            else
                answer -= i;
        }

        return answer;
    }
}
