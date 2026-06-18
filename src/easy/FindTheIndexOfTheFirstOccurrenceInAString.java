package easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
