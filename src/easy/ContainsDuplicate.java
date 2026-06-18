package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (var n : nums) {
            if (!numSet.add(n)) {
                return true;
            }
        }
        return false;
    }
}
