package level8;

import java.util.HashSet;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set=createSet(set);
        for (String str:set
             ) {
            System.out.println(str);
        }
    }
    public static Set<String> createSet(Set set){
         //Set<String> set=new HashSet<String>();
        set.add("Лягушка");
        set.add("Ложка");
        set.add("Лапа");
        set.add("Локоть");
        set.add("Лоза");
        set.add("Лира");
        set.add("Ландыш");
        set.add("Лань");
        return set;
    }
}
