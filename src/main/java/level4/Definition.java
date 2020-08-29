package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Definition {
    static void outputNumber(int number){
        if(number<0 || number>999)
            System.out.println();
        else {
            if(number>=0 && number<10){
                if(number%2==0)
                    System.out.println("Четное однозначное число.");
                else if(number%2!=0)
                    System.out.println("Нечетное однозначное число");
            }
            else if(number>=10 && number<=99){
                if(number%2==0)
                    System.out.println("Четное 2хзначное число.");
                else if(number%2!=0)
                    System.out.println("Нечетное 2хзначное число");
            }
            else if(number>99 && number<=999){
                if(number%2==0)
                    System.out.println("Четное 3хзначное число.");
                else if(number%2!=0)
                    System.out.println("Нечетное 3хзначное число");
            }
        }
    }
}
class Test9{
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            Definition.outputNumber(Integer.parseInt(bufferedReader.readLine()));
        }catch (IOException ex){
            System.out.println("Ошибка ввода");
        }

    }
}