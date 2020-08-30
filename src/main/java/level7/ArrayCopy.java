package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayCopy {
    public static void copy() throws IOException {
        ArrayList<String> list=new ArrayList<String>();
        /*BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            list.add(bufferedReader.readLine());
        }

         */
        list.add("cat");
        list.add("dog");
        list.add("sam");
        for (int i = 0; i < list.size(); i++) {
            list.add(i+1,list.get(i));
            i+=1;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
class Test8 {
    public static void main(String[] args) {
        try {
            ArrayCopy.copy();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}