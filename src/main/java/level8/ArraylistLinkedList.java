package level8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<Integer>();
        LinkedList<Integer> list2=new LinkedList<Integer>();

        insert10000(list2);
        get10000(list2);
        set10000(list2);
        remove10000(list2);

    }

    public static void insert10000(List list){
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

    }
    public static void get10000(List list){
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }
    public static void set10000(List list){
        for (int i = 0; i < 10000; i++) {
            list.set(i,list);
        }
    }
    public static void remove10000(List list){
        for (int i = 0; i < 10000; i++) {
            list.remove(list);
        }
    }
}
