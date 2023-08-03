package task4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

    Map<String, List<Integer>> mapContainer = new HashMap<>();

    public void addToMap(String name, List<Integer> list) {

        if (mapContainer.containsKey(name)) {
           List<Integer> newList = mapContainer.get(name);
            newList.addAll(list);
           mapContainer.put(name,newList);
        } else mapContainer.put(name,list);
    }
    public  List<Integer> getMap(String name) {
        return mapContainer.get(name);
    }

    public static void main(String[] args) {
        MapTest map = new MapTest();

        map.addToMap("lazarev", new ArrayList<>(List.of(1,2,3)));

        System.out.println(map.getMap("lazarev"));

        map.addToMap("lazarev", new ArrayList<>(List.of(4,5,6)));
        System.out.println(map.getMap("lazarev"));
        System.out.println(map.mapContainer);

    }
}
