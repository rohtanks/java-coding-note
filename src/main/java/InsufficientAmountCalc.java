public class InsufficientAmountCalc {
    public long solution(int price, int money, int count) {
        long moneyLong = (long) money;

        // count만큼 이용료 합계를 금액에서 빼기
        for (int i = 1; i <= count; i++) {
            moneyLong -= price * i;
        }

        return (moneyLong > 0L) ? 0L : (long) (-1 * moneyLong);
    }
}
