package level10;

import java.util.ArrayList;

public class Solution3 {
    public static void main(String[] args) {
        ArrayList<Integer>[] arrayLists=new ArrayList[2]; //массив.содержащи списки

        ArrayList<Integer> list11= new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list11.add(i);
        }
        ArrayList<Integer> list22= new ArrayList<Integer>();
        list22.add(44);
        list22.add(-5);
        arrayLists[0]=list11;
        arrayLists[1]=list22;

        for (int i = 0; i < arrayLists.length; i++) {
            for (int j = 0; j < arrayLists[i].size(); j++) {
                System.out.println(arrayLists[i].get(j));
            }
            System.out.println();
            //System.out.println(arrayLists[i]); <- not working
        }
    }
}
