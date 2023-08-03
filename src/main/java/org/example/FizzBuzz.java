package org.example;

/**
 *  Написать функцию, которая на вход принимает 2 параметра: начало и конец диапазона.
 *  Затем эта функция перебирает в себе числа в этом диапазоне и выводит на экран по следующему принципу:
 *  Если число кратно 3, на экран выводит слово "физ", если число кратно 5,
 *  то выводится слово "баз". Если кратно и 3 и 5 одновременно - "физбаз". В остальных случаях - выводится само число.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        printFizzBuzz(1,100);
    }

    public static void printFizzBuzz(int start, int end) {

        for (int i = start; i <= end; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else System.out.println(i);
        }
    }
}
