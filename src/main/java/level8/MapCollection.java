package level8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("cat", "15");
        map.put("dog", "13");
        for (Map.Entry<String, String> pair : map.entrySet()
        ) {
            String key= pair.getKey();
            String value= pair.getValue();
            System.out.println(key+ " "+ value);

        }
        /*
        Iterator<Map.Entry<String,String>> iterator= map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> pair =iterator.next();
            String key =pair.getKey();//ключ
            String value=pair.getValue();
            System.out.println(key+ " "+ value);
        }
        
         */
    }
}
