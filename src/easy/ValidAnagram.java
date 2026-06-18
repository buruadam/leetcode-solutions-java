package easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    /*
    Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
    */

//    public static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        for (int i = 0; i < t.length(); i++) {
//            char c = t.charAt(i);
//
//            if (!map.containsKey(c)) {
//                return false;
//            }
//
//            map.put(c, map.get(c) - 1);
//
//            if (map.get(c) < 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
