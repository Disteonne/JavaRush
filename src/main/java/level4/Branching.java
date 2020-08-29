package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Branching {

    static void getNumber(int number){
        if(number<5){
            System.out.println("Число меньше 5.");
        }
        if(number>5){
            System.out.println("Число больше 5.");
        }
        if(number==5){
            System.out.println("Число раавно 5.");
        }
    }

}
class Test3{
    public static void main(String[] args) {
        int n;
        System.out.println("Введите число: ");
        try {
            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
            n=Integer.parseInt(bufferedReader.readLine());
            Branching.getNumber(n);
        }catch (IOException ex){
            System.out.println("Ошибка ввода");
        }
    }
}
