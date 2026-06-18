package medium;

import java.util.Random;

public class ShuffleAnArray {
    private int[] original;
    private Random rnd;

    public ShuffleAnArray(int[] nums) {
        this.original = nums.clone();
        this.rnd = new Random();
    }

    public int[] reset() {
        return original.clone();
    }

    public int[] shuffle() {
        int[] shuffled = original.clone();
        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        return shuffled;
    }
}
