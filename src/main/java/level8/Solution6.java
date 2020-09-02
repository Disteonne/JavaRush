package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution6 {
    public static void main(String[] args) throws IOException {


        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }


        /*
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(88);
        list.add(-25);
        list.add(90);
        list.add(13);
        list.add(76);
        list.add(23);
        list.add(-55);
        list.add(49);
        list.add(51);
        list.add(100);
        */

        /*
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

         */

        //можно просто отсортировать массив и вывести последние/первые 5 эл-в

        int count = 0;
        while (count < 5) {

            int max = list.get(0);
            for (int i = 0; i < list.size(); i++) {

                if (max < list.get(i)) {
                    max = list.get(i);
                }
            }
            int index = list.indexOf(max);
            System.out.println(max);
            list.remove(index);

            System.out.println();
            count++;
        }
    }
}

