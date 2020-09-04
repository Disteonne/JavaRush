package level9;

import level7.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    private static Object NumberFormatException;

    public static void main(String[] args) {
        try {
            int i=0;
            ArrayList<Integer> indexN=new ArrayList<Integer>();
            ArrayList<Integer> indexS=new ArrayList<Integer>();
            String[] strInput=new String[7];
            ArrayList<Integer> n=new ArrayList<Integer>();
            ArrayList<String> s=new ArrayList<String>();
            //  ВВОД
            while (i<7) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                strInput[i] = bufferedReader.readLine();
                i++;
            }
            //РАЗБИВАЕМ НА ЧИСЛА И СТРОКИ.ФИКСИРУЯ ИНДЕКСЫ
            for (int j = 0; j < strInput.length; j++) {
                try {
                    int a = Integer.parseInt(strInput[j]);
                    n.add(a);
                    indexN.add(j);
                } catch (NumberFormatException ex) {
                    s.add(strInput[j]);
                    indexS.add(j);
                }
            }
            //СОРТИРУЕМ ЧИСЛА ПО УБЫВАНИЮ
            Collections.sort(n,Collections.<Integer>reverseOrder());
            //СОРТИРУЕМ СЛОВА ПО ВОЗВРАСТАНИЮ
            Collections.sort(s);

            //          ВЫВОД
            for (int j = 0; j < strInput.length; j++) {
                for (int k = 0; k <indexN.size() ; k++) {
                    if (indexN.get(k) == j) { //0,3,4,5
                        System.out.println(n.get(k));
                        break;
                    }
                     //else ;
                }
                for (int k = 0; k < indexS.size(); k++) {
                    if (indexS.get(k) == j) { //1,2,6
                        System.out.println(s.get(k));
                        break;
                    }
                   // else ;
                }

            }

            /*                  TEST
            for (int j = 0; j < n.size(); j++) {
                System.out.print(n.get(j)+" \t");
            }
            System.out.println();
            for (int j = 0; j < s.size(); j++) {
                System.out.print(s.get(j)+"\t");
            }
            System.out.println();

            for (int j = 0; j < indexN.size(); j++) {
                System.out.println(indexN.get(j));
            }

             */
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
