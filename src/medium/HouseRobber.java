package medium;

public class HouseRobber {
    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int prev1 = 0;
        int prev2 = 0;

        for (var n : nums) {
            int temp = prev1;
            prev1 = Math.max(prev2 + n, prev1);
            prev2 = temp;
        }
        return prev1;
    }
}
