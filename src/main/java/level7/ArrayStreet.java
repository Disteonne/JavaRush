package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayStreet {
    private static int[] street = new int[15];
    private static int sum1 = 0;//четные индексы
    private static int sum2 = 0;//нечетные

    public static void streetInd() {
        try {
            for (int i = 0; i < 15; i++) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                street[i] = Integer.parseInt(bufferedReader.readLine());
                if (i % 2 == 0) {
                    sum2 += street[i];
                } else
                    sum1 = +street[i];
                bufferedReader.close();
            }
                if (sum1 > sum2) {
                    System.out.println("В нечетных домах жителей больше");
                } else
                    System.out.println("В четных домах жителей больше");

        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}

class Test1 {
    public static void main(String[] args) {
        ArrayStreet.streetInd();
    }
}