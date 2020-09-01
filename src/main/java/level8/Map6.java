package level8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map6 {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<String, String>();
        map=create();
        removeTheFirstName(map,"Олег");
        for (Map.Entry<String,String> pair: map.entrySet()
             ) {
            System.out.println(pair.getKey()+" "+pair.getValue());

        }

    }
    public static Map<String,String> create(){
        Map<String,String> map= new HashMap<String, String>();
        map.put("Сидоров","Олег");
        map.put("Маликов","Максим");
        map.put("Иванов","Аркадий");
        map.put("Егнатьев","Олег");
        map.put("Ефреев","Дмитрий");
        return map;
    }

    public static void removeTheFirstName(Map<String,String> m,String name){
        Iterator<Map.Entry<String,String>> iterator=m.entrySet().iterator();
        ArrayList<String> list= new ArrayList<String>();
        while (iterator.hasNext()){
            Map.Entry<String,String> pair= iterator.next();
            if(pair.getValue().equals(name)){
                iterator.remove();
            }
            //list.add(pair.getValue());
        }
        /*
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(list.get(i+1))){
                list.remove(i);
                list.remove(i+1);
                i-=2;
            }
        }
         */
        //m.clear();
    }
}
