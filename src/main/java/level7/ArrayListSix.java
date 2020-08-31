package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListSix {
    private static String min;
    private static String max;
    public static void str() {
        try {
            ArrayList<String> list = new ArrayList<String>();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 10; i++) {
                list.add(bufferedReader.readLine());
            }

            min= list.get(0);
            max=list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if(min.length()>list.get(i).length()){
                    min=list.get(i);
                }
                if(max.length()<list.get(i).length()){
                    max=list.get(i);
                }
            }
            System.out.println(min);
            System.out.println(max);
            bufferedReader.close();

        }catch (IOException ex){
            System.out.println("error");
        }
    }
}
class Test6{
    public static void main(String[] args) {
        ArrayListSix.str();
    }
}