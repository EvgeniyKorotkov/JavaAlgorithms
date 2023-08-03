package task2;

/**
 * посчитать сколько раз встречается символ в слове
 */
public class Task41 {
    public static void main(String[] args) {
        System.out.println(howManyTimes("hello", 'o'));
    }

    private static int howManyTimes(String string, char symbol) {
        int counter = 0;

        char[] array = string.toCharArray();
        for (char c : array) {
            if (c == symbol) {
                counter++;
            }
        }
        return counter;
    }
}
