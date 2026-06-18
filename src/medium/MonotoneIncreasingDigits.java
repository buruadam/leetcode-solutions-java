package medium;

public class MonotoneIncreasingDigits {
    public static int monotoneIncreasingDigits(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int marker = digits.length;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i - 1] > digits[i]) {
                marker = i;
                digits[i - 1]--;
            }
        }
        for (int i = marker; i < digits.length; i++) {
            digits[i] = '9';
        }
        return Integer.parseInt(new String(digits));
    }
}
