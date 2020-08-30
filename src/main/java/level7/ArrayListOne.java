package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListOne {
    public static void array() {
        try {
            ArrayList<String> arrayList = new ArrayList<String>(5);
            for (int i = 0; i < 5; i++) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                arrayList.add(bufferedReader.readLine());
            }
            for (int i = 0; i < 5; i++) {
            System.out.println(arrayList.get(i));
            }

        } catch (IOException ex) {
            System.out.println("error");
        }
    }
}

class Test2{
    public static void main(String[] args) {
        ArrayListOne.array();
    }
}