package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListFour {
    public static void main(String[] args) {
        try {
            ArrayList<String> list=new ArrayList<String>();
            for (int i = 0; i <10; i++) {
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
                list.add(0,bufferedReader.readLine());
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(list.get(i));
            }
        }catch (IOException ex){
            System.out.println("error");
        }
    }
}
