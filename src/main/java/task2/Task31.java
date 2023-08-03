package task2;

/**
 * Без массива
 */
public class Task31 {

    public static void main(String[] args) {

        System.out.println(getCounter("HelLlLllLl", 'l'));
    }

    private static int getCounter(String string, char symbol) {
        String str = string.toLowerCase();
        int counter = 0;

        for (int i = 0; i <= str.length()-1; i++) {

            if (str.charAt(i) == symbol) {
                counter++;
            }
        }
        return counter;
    }
}
