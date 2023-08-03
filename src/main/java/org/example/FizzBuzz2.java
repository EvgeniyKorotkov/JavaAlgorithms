package org.example;

import java.util.ArrayList;

import java.util.List;

/**
 *  Написать функцию, которая на вход принимает 2 параметра: начало и конец диапазона.
 *  Затем эта функция перебирает в себе числа в этом диапазоне и выводит на экран по следующемму принципу.
 *  Если число кратно 3, на экран выводит слово "физ", если число кратно 5,
 *  то выводится слово "баз". Если кратно и 3 и 5 одновременно - "физбаз". В остальных случаях - выводится само число.
 */
public class FizzBuzz2 {
    public static void main(String[] args) {

        fizzBuzz(3, 55);
    }

    public static void fizzBuzz(int start, int end) {

        List<Integer> list = new ArrayList<>();

        for (int i = start; i <= end ; i++) {
            list.add(i);
        }

        list.stream().map(number -> number % 3 == 0 ? getFizzMsg(number) : getBuzzMsg(number))
                .forEach(System.out::println);
    }

    private static String getFizzMsg(int number) {
        return number % 5 == 0 ? "fizzbuz" : "fizz";
    }

    private static String getBuzzMsg(int number) {
        return number % 5 == 0 ? "Buzz" : String.valueOf(number);
    }
}

