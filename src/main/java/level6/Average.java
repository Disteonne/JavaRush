package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {
    static int even=0;
    static int odd=0;
    static int const1;
    static void output(){
    try {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferedReader.readLine());
        while (n!=0){
            const1=n%10;
            if(n%2==0){
                even++;
            }
            if(n%2!=0){
                odd++;
            }
            n=(int) (n/10);
        }
        System.out.println("Even: "+even+ " Odd: "+odd);
    }catch (IOException ex){
        System.out.println("Error");
    }
    }
}
class Test1{
    public static void main(String[] args) {
        Average.output();
    }

}