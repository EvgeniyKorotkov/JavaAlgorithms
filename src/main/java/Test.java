
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Netten"));
    }
    private static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
