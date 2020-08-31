package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList12 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list=new ArrayList<>();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String str=bufferedReader.readLine();
            if(str.equals("")){
                break;
            }
            list.add(str.toUpperCase());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
