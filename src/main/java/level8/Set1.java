package level8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public class Set1 {
    public static void main(String[] args) {
        Set<String> set= new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        Iterator<String> iterator= set.iterator();
        while (iterator.hasNext()){
            //String str= iterator.next();
            System.out.println(iterator.next());
        }

        /*
        for (String str: set
             ) {
            System.out.println(str);
        }

         */
    }
}
