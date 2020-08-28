package level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите имя: ");
            String name = bufferedReader.readLine();
            System.out.println("Введите первое число: ");
            String number1 = bufferedReader.readLine();
            System.out.println("Введите второе число: ");
            String number2 = bufferedReader.readLine();
            int n1 = Integer.parseInt(number1); //преобразуем в целое число
            int n2 = Integer.parseInt(number2);


            System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }

    }
}

