package task4;

/**
 * Написать метод, который будет возвращать true если поданный на вход массив int
 * содержит 3 и более последовательных числа в любом месте
 */
public class Task2 {

    public static void main(String[] args) {

        int[] array = new int[] {1,2,4,5,8};

        System.out.println(contains(array));
    }
    private static boolean contains(int[] array) {
        int counter = 0;

            for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i+1]) {
                    counter++;
                    if (counter==3) return true;
                } else counter = 0;
            }
        return false;
    }
}
