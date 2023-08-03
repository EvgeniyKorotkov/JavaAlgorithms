package BubbleSort;

/**
 * сортировка пузырьком
 */
public class Bubble {
    public static void main(String[] args) {

        int[] array = {55,23,12,33,22,10,5,68,1,20};

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int t = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = t;
                    isSorted = false;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
