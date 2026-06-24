package easy;

import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> ROMAN_MAP = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public static int romanToInt(String s) {
        int result = ROMAN_MAP.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            int currentVal = ROMAN_MAP.get(s.charAt(i));
            int nextVal = ROMAN_MAP.get(s.charAt(i + 1));

            if (currentVal < nextVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }
        return result;
    }
}
