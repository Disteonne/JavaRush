package level3;

public class Sum {
    static int remainder1; //остаток от деления
    static int remainder2;
    static int remainder3;
    static int sum;
    public static int sumNumber(int number){
        if((number>999) || (number<100)){
            System.out.println("Извините,но эта программа для трехзначных чисел!");
            sum=0;
        }else{
            remainder1=number%10;
            number/=10;
            remainder2=number%10;
            number/=10;
            remainder3=number;
            sum=remainder1+remainder2+remainder3;
            //можно попробовать рекурсией
        }
        return sum;
    }
}
class  Test{
    public static void main(String[] args) {
        int summa= Sum.sumNumber(1000);
        System.out.println(summa);
    }
}