package medium;

import java.util.ArrayList;
import java.util.List;

public class CanMakePalindromeFromSubstring {
    public static List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int n = s.length();
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int bit = 1 << (s.charAt(i) - 'a');
            prefix[i + 1] = prefix[i] ^ bit;
        }

        List<Boolean> result = new ArrayList<>();

        for (var query : queries) {
            int left = query[0];
            int right = query[1];
            int ki = query[2];

            int mask = prefix[right + 1] ^ prefix[left];
            int oddCount = Integer.bitCount(mask);

            if (oddCount <= 1 || ki >= oddCount / 2) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
