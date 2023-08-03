package task4;

import java.util.*;

/**
 * На вход подается список(лист стрингов).
 * Написать метод, который удалит дубликаты и вернет новый список.
 */
public class ListWithoutDuplicates {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(List.of("red","red", "blue", "red", "black"));

        System.out.println(getList(lst));
        System.out.println(getList2(lst));
        System.out.println(getList3(lst));
    }
    // первый способ
    private static List<String> getList(List<String> list) {
        List<String> listWithoutDuplicates = new ArrayList<>();
        Set<String> uniqueValues = new HashSet<>();

        for (String l : list) {
            if (uniqueValues.add(l)) {
                listWithoutDuplicates.add(l);
            }
        }
        return listWithoutDuplicates;
    }
    // второй способ
    private static List<String> getList2(List<String> list) {
        Set<String> strings = new HashSet<>(list);
        return new ArrayList<>(strings);
    }
    // третий способ
    private static List<String> getList3(List<String> list) {
        return list.stream().distinct().toList();
    }

}
