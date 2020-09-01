package level8;

import java.util.HashMap;
import java.util.Map;

public class Map3 {
    public static void main(String[] args) {
        Map<String,Object> map= new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        print(map);
    }
    public static void print(Map<String,Object> m){
        for (Map.Entry<String,Object> pair:m.entrySet()
             ) {
            String key=pair.getKey();
            Object value=pair.getValue();
            System.out.println(key+" "+value);
        }
    }
}
