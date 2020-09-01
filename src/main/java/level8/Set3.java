package level8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set3 {
    public static void main(String[] args) {
    Set<Integer> sett=new HashSet<Integer>();
    sett=createSet(sett);

    sett=removeAllNumbersGreaterThan10(sett);
        for (Integer i:sett
             ) {
            System.out.println(i);

        }


    }
    public static Set<Integer> createSet(Set<Integer> set){
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }
    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set){
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.addAll(set); //добавили в list все элементы set
        int count=0;
        for (int i=0;i<list.size();i++){
            int n=list.get(i);
            if(n>10){
                list.remove(i);
                i--;
                //count=1;
            }
            //count=0;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Set<Integer>set1=new HashSet<Integer>(); //or set.clear();
        set1.addAll(list);
        return set1;
        /*
        Iterator<Integer> integerIterator=set.iterator();
        while (integerIterator.hasNext()){
            if(integerIterator.next()>10){
                set.remove(integerIterator.next());
            }
        }
                                                        НЕ РАБОТАЕТ
         */
        /*
        for (Integer i: set
             ) {
            if(i>10){
                set.remove(i);
            }
        }
         */
    }
}
