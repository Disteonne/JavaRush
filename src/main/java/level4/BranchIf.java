package level4;

import level3.Sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BranchIf {
    static void year(int year){
        if(year%400==0)
            System.out.println("Високосный год.В году 366 дней");
        else if(year%100==0)
            System.out.println("В году 365 дней.");
        else if (year%4==0)
            System.out.println("Високосный год!В году 366 дней");
        else
            System.out.println("В году 365 дней");
    }
}
class Test6{
    public static void main(String[] args) {
        try {
            System.out.println("Введите год: ");
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            int n= Integer.parseInt(bufferedReader.readLine());
            BranchIf.year(n);
        }catch (IOException ex){
            System.out.println("Ошибка ввода.");
        }
    }
}