package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListTwo {
    private static String str1;
    private static int maxIndex;
    private static int counter;

    public static void maxArr() {
        try {

            ArrayList<String> max = new ArrayList<String>(5);
            for (int i = 0; i < 5; i++) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                max.add(bufferedReader.readLine());
            }
            str1=max.get(0);
            for (int i = 0; i < 5 - 1; i++) {
                if (str1.length() < max.get(i + 1).length()) {
                    str1 = max.get(i + 1);
                    //maxIndex = i + 1;
                }
            }
            System.out.println("");
            for (int i = 0; i < 5; i++) {
                if(str1.length()==max.get(i).length()){
                    System.out.println(max.get(i));
                }
            }
            //System.out.println(str1);

        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }
}
class Test3{
    public static void main(String[] args) {
        ArrayListTwo.maxArr();
    }
}