package task4;

import java.util.Arrays;

/**
 * Необходимо вернуть максимальное число из массива
 */
public class MaxNumber {
    public static void main(String[] args) {

        int[] array = new int[] {2,1111,22,15,113,21};
        System.out.println(maxNumber(array));
    }

    private static int maxNumber(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
