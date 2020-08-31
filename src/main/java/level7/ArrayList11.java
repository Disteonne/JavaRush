package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList11 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list= new ArrayList<String>();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        //int i=0;
        while (true){
            String str= bufferedReader.readLine();
            if(str.equals("end"))
                break;
            list.add(str);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        bufferedReader.close();
    }
}
