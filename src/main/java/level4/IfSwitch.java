package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfSwitch {
    static void daysOfWeek(int number){
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Необходимо было ввести число от 1 до 7!");
        }
    }
}
class Test5{
    public static void main(String[] args) {
        int n;
        try {
            System.out.println("Введите число от 1 до 7: ");
            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
            n=Integer.parseInt(bufferedReader.readLine());
            IfSwitch.daysOfWeek(n);
        }catch (IOException ex){
            System.out.println("Ошибка ввода.");
        }
    }
}