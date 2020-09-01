package level8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> stringSet=new HashSet<String>();
        stringSet.add("Mama");
        stringSet.add("Papa");
        stringSet.add("Vava");

        Iterator<String> iterator=stringSet.iterator(); //итератор для set
        while (iterator.hasNext()){ // проверка есть ли еще элементы
            String text=iterator.next(); //получение текущего элемента
            System.out.println(text);
        }
    }
}
