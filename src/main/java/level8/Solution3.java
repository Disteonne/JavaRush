package level8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution3 {
    public static void main(String[] args) {
        Map<String,String> m=createMap();
        for (Map.Entry<String,String> pair:m.entrySet()
             ) {
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
        /*
        Iterator<Map.Entry<String,String>> iterator=m.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> pair=iterator.next();
            System.out.println(pair.getKey()+" "+pair.getValue());
        }

         */
    }
    public static Map<String,String> createMap(){
        Map<String,String> map =new HashMap<String, String>();
        map.put("Петров","Иван");
        map.put("Петров","Иван");
        map.put("Петров","Иван");
        map.put("Петров","Иван");
        map.put("Петров","Иван");
        map.put("Петров","Иван");
        map.put("Петров","Иван");
        map.put("Петров","Иван");
        map.put("Петров","Иван");
        map.put("Петров","Иван");
        return map;
    }
}
