package easy;

import java.util.*;

public class InterSectionOfTwoArrays2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (var n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer> resultList = new ArrayList<>();
        for (var n : nums2) {
            if (map.containsKey(n) && map.get(n) > 0) {
                resultList.add(n);
                map.put(n, map.get(n) - 1);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    // Rendezett tömbökön
    public static int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> resultList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                resultList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }
        return result;
    }
}
