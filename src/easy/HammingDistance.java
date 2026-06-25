package easy;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
//        One line solution in Java
//        return Integer.bitCount(x ^ y);

        int xor = x ^ y;
        int count = 0;
        while (xor != 0) {
            xor = xor & (xor - 1);
            count++;
        }
        return count;
    }
}
