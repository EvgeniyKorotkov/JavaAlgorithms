package task2;

/**
 * С помощью массива, заполняя массив через цикл
 */
public class Task21 {

    public static void main(String[] args) {

        System.out.println(getCounter("HelLo", 'l'));
    }

    private static int getCounter(String string, char symbol) {
        String str = string.toLowerCase();
        char[] array = new char[str.length()];
        int counter = 0;

        for (int i = 0; i <= str.length()-1; i++) {

            array[i] = str.charAt(i);
        }

        for (char c : array) {
            if (c == symbol) {
                counter++;
            }
        }

        return counter;
    }
}
