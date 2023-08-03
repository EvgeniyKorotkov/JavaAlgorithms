package org.example;

/**
 * Reverse a String
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World!"));
        System.out.println(reverseManual("Hello!"));
    }

    private static String reverseString(String s) {
        return new StringBuilder(s)
                .reverse()
                .toString();
    }

    private static String reverseManual(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0 ; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
