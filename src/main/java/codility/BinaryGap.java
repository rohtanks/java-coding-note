package codility;

public class BinaryGap {
    public String getBinaryExp(int input) {
        return Integer.toBinaryString(input);
    }

    public int getMaxBinaryGap(int input) {
        String binaryExp = Integer.toBinaryString(input);
        int max = 0;
        int gapCount = 0;
        for (char c : binaryExp.toCharArray()) {
            if (c == '0') {
                gapCount++;
            } else {
                max = max > gapCount ? max : gapCount;
                gapCount = 0;
            }
        }
        return max;
    }
}
