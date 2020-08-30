package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListFive {
    public static void del(){
        try {
            ArrayList<String> list=new ArrayList<String>(5);
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 5; i++) {
                list.add(bufferedReader.readLine());
            }
            int i=0;
            while (i<13){
                String str=list.get(4);
                list.remove(4);
                list.add(0,str);
                i++;
                //list.add(0,list.remove(list.size()-1));
            }

            for (int j = 0; j < list.size(); j++) {
                System.out.println(list.get(j));
            }
        }catch (IOException ex){
            System.out.println("error");
        }
    }
}
class Test5{
    public static void main(String[] args) {
        ArrayListFive.del();
    }
}