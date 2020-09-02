package level8;

import level7.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) throws IOException {
    ArrayList<Integer> list1=createList();
    int min=getMinimum(list1);
    System.out.println(min);
    }
    public static ArrayList<Integer> createList() throws IOException {
        ArrayList<Integer> list=new ArrayList<Integer>();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        bufferedReader.close();
        return list;
    }
    public static int getMinimum(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        //Collections.min(list);
        return min;
    }
}

