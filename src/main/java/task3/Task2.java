package task3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Вернуть лист стрингов, в котором слова начинаются на букву "I"
 */
public class Task2 {
    public static void main(String[] args) {
       List<String> list = List.of("Irina", "Marina", "Inna", "Olga");
        System.out.println(getList(list)); // 1
        System.out.println(getList2(list)); // 2
        System.out.println(getList3(list)); // 3
    }

    private static List<String> getList(List<String> list) {
        return new ArrayList<>(list).stream()
                    .filter(e -> e.substring(0,1).contains("I"))
                    .collect(Collectors.toList());
    }

    private static List<String> getList2(List<String> list) {
        List<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (s.substring(0,1).contains("I"))
                list2.add(s);
        }
        return list2;
    }

    private static List<String> getList3(List<String> list) {
        List<String> list2 = new ArrayList<>();
        list.forEach(x -> {
                    if(x.substring(0,1).contains("I"))
                        list2.add(x);
                });
        return list2;
    }
}
