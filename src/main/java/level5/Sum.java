package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    static void summa(){
        try {
            while (true) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String str1 = bufferedReader.readLine();
                if (str1.equals("сумма")) {
                    break;
                }
            }

        }catch (IOException ex){
            System.out.println("Error");
        }
    }
}

class Test2{
    public static void main(String[] args) {
        Sum.summa();
    }
}
