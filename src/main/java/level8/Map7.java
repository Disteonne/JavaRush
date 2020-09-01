package level8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map7 {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<String, Integer>();
        map=createMap();
        removeItem(map);
        for (Map.Entry<String,Integer> pair: map.entrySet()
             ) {
            System.out.println(pair.getKey()+" "+pair.getValue());

        }
    }
    public static Map<String,Integer> createMap(){
        Map<String,Integer> m= new HashMap<String, Integer>();
        m.put("Сидоров",589);
        m.put("Смирнова",899);
        m.put("Кудрявцева",355);
        m.put("Лебедев",501);
        m.put("Сизорова",135);
        m.put("Соколова",499);
        return m;
    }
    public static void removeItem(Map<String,Integer> m){
        Iterator<Map.Entry<String,Integer>> iterator=m.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> pair= iterator.next();
            if(pair.getValue()<500){
                iterator.remove();
            }
        }
    }
}
