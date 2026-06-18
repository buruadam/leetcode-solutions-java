package easy;

import java.util.HashSet;
import java.util.Set;

public class InterSectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (var n : nums1) {
            set1.add(n);
        }
        Set<Integer> intersectSet = new HashSet<>();
        for (var n : nums2) {
            if (set1.contains(n)) {
                intersectSet.add(n);
            }
        }
        int[] result = new int[intersectSet.size()];
        int index = 0;
        for (var n : intersectSet) {
            result[index++] = n;
        }
        return result;
    }
}
