package codility;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // 10, 85, 30
        int result = (Y - X) / D;
        int dedicate = (Y - X) % D;
        if (dedicate == 0)
            return result;
        else
            return result + 1;
    }
}
