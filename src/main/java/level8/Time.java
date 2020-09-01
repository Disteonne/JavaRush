package level8;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Time {
    public static void main(String[] args) {
        Date date1=new Date();
        ArrayList<Integer> list1=new ArrayList<Integer>();
        LinkedList<Integer> list2=new LinkedList<Integer>();
        insert10000(list1);
        Date date2=new Date();;
        long timeDate12=date2.getTime()-date1.getTime();
        System.out.println(timeDate12);
    }
    public static void insert10000(List list){
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

    }
}
