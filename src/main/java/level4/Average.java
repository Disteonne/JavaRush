package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {
    static int max;
    static int min;
    static void aver(int[] num){
        min=num[0];
        max=num[0];
        for(int i=0;i<2;i++){
            if(max<num[i+1]){
                max= num[i];
            }
            else if(min>num[i]){
                min=num[i];
            }
        }
        for(int i=0;i<3;i++) {
            if (num[i] != min && num[i] != max) {
                System.out.println(num[i]);
            }
        }
    }
}

class Test14{
    public static void main(String[] args) {
        int[] num=new int[3];
        try {
            System.out.println("Введите 3 числа: ");
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            for(int i=0;i<num.length;i++){
                num[i]=Integer.parseInt(bufferedReader.readLine());
            }
            Average.aver(num);
        }catch (IOException ex){
            System.out.println("Ошибка ввода");
        }
    }
}