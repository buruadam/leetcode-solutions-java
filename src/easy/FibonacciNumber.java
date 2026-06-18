package easy;

public class FibonacciNumber {
    public static int fib(int n) {
        if (n <= 1) return n;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }
}

/*  Recursion: slow, O(2^n) time complexity

    public static int fib(int n) {
      if (n <= 1) return n;
      return fib(n-1) + fib(n-2);
    }

*/
