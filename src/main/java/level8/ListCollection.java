package level8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Mama");
        list.add("Papa");
        list.add("Vava");

        for (String text: list) {
            System.out.println(text);

        }
        /*
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            System.out.println(str);
        }

         */
    }
}
