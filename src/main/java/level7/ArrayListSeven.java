package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListSeven {
    public static void sort() throws IOException {
        //ArrayList<Integer> list = new ArrayList<Integer>(10);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bufferedReader.readLine());
            //list.add(n);
            //System.out.println(list.get(i));
            if (n % 3 == 0) {
                list3.add(n);
            }
            if (n % 2 == 0)
                list2.add(n);
            if ((n % 2 !=0) && (n % 3 != 0))
                list1.add(n);
            bufferedReader.close();
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + "\t");
            System.out.println("!(На 2 и на 3)");
        }

        System.out.println();
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i)+"\t");
            System.out.println("на 2");
        }

        System.out.println();
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i)+"\t");
            System.out.println("на 3");
        }

    }
}

class Test7 {
    public static void main(String[] args) {
        try {
            ArrayListSeven.sort();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}