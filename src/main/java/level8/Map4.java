package level8;

import java.util.HashMap;
import java.util.Map;

public class Map4 {
    public static void main(String[] args) {
    Map<String,String> map=createMap();
    int name=getCountName(map,"Иван");
    int f=getCountF(map,"Cмирнов");
    System.out.println(name);
    System.out.println(f);
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Смирнов", "Саша");
        map.put("Белоусов", "Антон");
        map.put("Смирновив", "Иван");
        map.put("Тяшкин", "Олег");
        map.put("Абрамов", "Иван");
        map.put("Котов", "Петр");
        map.put("Любимов", "Алексей");
        return map;
    }

    public static int getCountName(Map<String, String> m, String name) {
        int counter = 0;
        for (Map.Entry<String, String> pair : m.entrySet()
        ) {
            String value = pair.getValue();
            if (name.equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    public static int getCountF(Map<String, String> m, String F) {
        int counter = 0;
        for (Map.Entry<String, String> pair : m.entrySet()
        ) {
            String key = pair.getKey();
            if (F == key) {
                counter++;
            }

        }
        return counter;
    }
}
