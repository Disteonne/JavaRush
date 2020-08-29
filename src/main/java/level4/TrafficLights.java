package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLights {
    private static double minute;

    static void color( double hour){
        minute= hour*60; //transl in minute

        minute=minute%60;//убираем целую часть и оставляем остаток
        //к примеру: 2.45->45(минут)

        minute=minute%5;//разбиваем на периоличность в 5 минут
        if(minute<3){
            System.out.println("Горит зеленый");
            //System.out.println(minute);
        }
        else if(minute>=3 && minute<=4) {
            System.out.println("Горит оранжевый");
            //System.out.println(minute);
        }
        else if(minute<=5 && minute>4){
            System.out.println("Горит красный.Стоять!");
            //System.out.println(minute);
        }
    }
}
class Test7{
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            double n=Double.parseDouble(bufferedReader.readLine());
            TrafficLights.color(n);
        }catch (IOException ex){
            System.out.println("Ошибка ввода");
        }
    }
}