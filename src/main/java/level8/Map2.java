package level8;

import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<String, String>();
        map.put("Sam", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        printKeys(map);
    }
    public static void printKeys(Map<String,String> m){
        for (Map.Entry<String,String> pair: m.entrySet()
             ) {
            //String key=pair.getKey();
            //System.out.println(key);
            String value=pair.getValue();
            System.out.println(value);
        }
    }
}
