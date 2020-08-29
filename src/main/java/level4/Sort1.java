package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sort1 {
    private static int[] number=new int[3];
    private int n;
    static int min=number[0];
    static int max=number[0];
    static int temp;
   static void input() throws IOException {
       System.out.println("Введите три числа: ");
       BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
       for(int i=0;i<3;i++){
           number[i]=Integer.parseInt(bufferedReader.readLine());
       }

   }
   static void sort() {
       int n=2;
       //boolean b=true;
       while (n>0) {
           //b=false;
           for (int i = 0; i < 2; i++) {

               if (number[i + 1] > number[i]) {
                   temp=number[i];
                   number[i] = number[i + 1];
                   number[i + 1] = temp;
                   //b=true;
                   n--;
               }

           }
       }
   }

   static void print(){
       for(int i=0;i<3;i++){
           System.out.println(number[i]);
       }
   }
}
class Test8 {
    public static void main(String[] args) {
        try {
            Sort1.input();
            Sort1.sort();
            Sort1.print();
        } catch (IOException ex) {
            System.out.println("Ошибка ввода");
        }
    }
}