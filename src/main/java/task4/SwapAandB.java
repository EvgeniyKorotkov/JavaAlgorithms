package task4;

/**
 * поменять местами a & b, не используя третью переменную.
 * (на вход методу приходит например 5 и 8,
 * вернуть или вывести в консоль нужно 8 и 5.
 */
public class SwapAandB {

    public static void main(String[] args) {
        swap(25,33);
    }

    private static void swap(int a, int b) {
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a + " and " + b);
    }
}
