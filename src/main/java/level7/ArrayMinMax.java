package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayMinMax {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
            }
            int min=list.get(0);
            int max=list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if(min>list.get(i)){
                    min=list.get(i);
                }
                if(max<list.get(i)){
                    max=list.get(i);
                }
            }
            System.out.println(min);
            System.out.println(max);
            bufferedReader.close();
        }catch (IOException ex){
            ex.getStackTrace();
        }
    }
}
