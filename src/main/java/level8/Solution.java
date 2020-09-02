package level8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Cat> s= new HashSet<Cat>();
        s=createCats();
        ArrayList<Cat> list=new ArrayList<Cat>();
        list.addAll(s);
        //s.addAll(list);
        list.remove(0);
        s.clear();
        //list.addAll(s);
        s.addAll(list);
        printCats(s);

        /*
        Iterator<Cat> iterator=s.iterator();
        Cat catRem=iterator.next();
        s.remove(catRem);

         */

    }
    public static class Cat{

    }
    public static Set<Cat> createCats(){
        Set<Cat> set=new HashSet<Cat>();
        for (int i = 0; i < 3; i++) {
            //Cat cat=new Cat();
            set.add(new Cat());
        }
        return set;
    }

    public static void printCats(Set<Cat> set){
        for (Cat c:set
             ) {
            System.out.println(c);

        }
    }
}
