package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

            System.out.println("Введите число N число для заполнения строк: ");
            int n = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Введите число M для перестановки строк: ");
            int m= Integer.parseInt(bufferedReader.readLine());

            /*          TEST
            int n=3;
            int m=2;
            list.add("mama");
            list.add("papa");
            list.add("vava");
            */
            //заполнение списка

            for (int i = 0; i < n; i++) {
                list.add(bufferedReader.readLine());
            }


            int i=0;
            while (i<m){
                String str=list.get(0);
                list.remove(0);
                list.add(str);
                i++;
                //int counter=1;
            }

            for (int j = 0; j < list.size(); j++) {
               System.out.println(list.get(j));
            }

    }
}

