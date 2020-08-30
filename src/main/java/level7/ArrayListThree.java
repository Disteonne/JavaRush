package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class ArrayListThree {
    private static String str1;
    public static void min() {

        try {

            ArrayList<String> str = new ArrayList<String>(5);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 5; i++) {
                str.add(bufferedReader.readLine());
            }
            str1=str.get(0);
            for (int i = 0; i < 5-1; i++) {
                if (str1.length() > str.get(i + 1).length()) {
                    str1 = str.get(i + 1);
                }
            }
            System.out.println(str1);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
class Test4{
    public static void main(String[] args) {
        ArrayListThree.min();
    }
}