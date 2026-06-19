package medium;

public class CountPrimes {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isNotPrime = new boolean[n / 2];
        int count = 1;

        for (int i = 3; i * i < n; i += 2) {
            if (!isNotPrime[i / 2]) {
                for (int j = i * i; j < n; j += 2 * i) {
                    isNotPrime[j / 2] = true;
                }
            }
        }

        for (int i = 3; i < n; i += 2) {
            if (!isNotPrime[i / 2]) {
                count++;
            }
        }
        return count;
    }
}
