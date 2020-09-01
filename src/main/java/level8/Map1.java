package level8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<String, String>();
        map.put("арбуз-","ягода");
        map.put("банан-","фрукт");
        map.put("вишня-","ягода");
        map.put("груша-","фрукт");
        map.put("ежевика-","куст");

        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> pair= iterator.next();
            String key= pair.getKey();
            String value= pair.getValue();
            System.out.println(key+ " "+value);
        }

        /*
        for (Map.Entry<String,String> pair: map.entrySet()
             ) {
            String key= pair.getKey();
            String value= pair.getValue();
            System.out.println(key+ " "+value);
        }
         */



    }
}
