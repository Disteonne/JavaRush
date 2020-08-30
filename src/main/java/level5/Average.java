package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {
    public static void main(String[] args) {
        int num;
        double sum=0;
        int counter=0;
        try {
            while (true) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                num= Integer.parseInt(bufferedReader.readLine());
                if(num==-1){
                    break;
                }
                sum+=num;
                counter++;
            }
        }catch (IOException ex){
            System.out.println("Ошибка ввода");
        }
        sum/=counter;
        System.out.println(+sum);
    }
}
