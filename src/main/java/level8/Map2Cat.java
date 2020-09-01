package level8;

import java.util.HashMap;
import java.util.Map;

public class Map2Cat {
    public static void main(String[] args) {
    String[] name={"Шарик","Бобик","Мурзик","Васька","Лиса"};
        Map<String,Cat> map=addCatsToMap(name);
        for (Map.Entry<String,Cat> pair: map.entrySet()
             ) {
            System.out.print(pair.getKey()+" \t");
            System.out.print(pair.getValue());
            System.out.println();

        }
    }

    public static class Cat{
        String name;
        Cat(String name){
            this.name=name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    public static Map<String,Cat> addCatsToMap(String[] names){
        Map<String,Cat> map= new HashMap<String, Cat>();
        for (String str: names
             ) {
            map.put(str,new Cat(str));
        }
        return map;
    }


}
