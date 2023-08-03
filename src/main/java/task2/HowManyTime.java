package task2;

/**
 * На вход приходят строка и символ.
 * Посчитать, сколько раз данный символ встречается в строке.
 */

public class HowManyTime {

    public static void main(String[] args) {

        System.out.println(getCounter("HelloLL", 'l'));

    }

    public static long getCounter(String string, char symbol) {
        return string
                .toLowerCase()
                .chars()
                .filter(x -> x == symbol).count();
        }
    }

