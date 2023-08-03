package task4;

import java.util.*;

public class Toma {

    public static void main(String[] args) {
        System.out.println(abc( "cda", "abc", "def", "abc"));
        System.out.println(abc2("cda", "abc", "def", "abc"));
    }

    public static List<String> abc(String ... args) {
       return new ArrayList<>(List.of(args))
               .stream()
               .distinct()
               .sorted(String::compareTo)
               .toList();
    }

    public static List<String> abc2(String ... strings) {
        List<String> str = new ArrayList<>(List.of(strings));
        Collections.sort(str);
        Set<String> str2 = new LinkedHashSet<>(str);
        return new ArrayList<>(str2);
    }
}
