package task3;

import java.util.Arrays;

/**
 * разделить строку на подстроки с помощью символа
 */
public class Task1 {

    public static void main(String[] args) {

        test("hello-world", '-');
    }

    private static void test(String string, char symbol) {

        String[] str = string.split(String.valueOf(symbol));

        for (String s : str) {
            System.out.print(s+ " ");
        }
    }
}

