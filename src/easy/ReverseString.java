package easy;

import java.util.Stack;

public class ReverseString {
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

//        Stack<Character> stack = new Stack<>();
//        for (var c : s) {
//            stack.push(c);
//        }
//        for (int i = 0; i < s.length; i++) {
//            s[i] = stack.pop();
//        }
    }
}
