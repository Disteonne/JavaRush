package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList13 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String str=bufferedReader.readLine();
            if(str.equals("")){
                break;
            }
            list.add(str);
        }

        for (int i = 0; i <list.size(); i++) {
            if(list.get(i).length()%2==0){
                list1.add(list.get(i));
                list1.add(list.get(i));
            }
            else if(list.get(i).length()%2!=0){
                list1.add(list.get(i));
                list1.add(list.get(i));
                list1.add(list.get(i));
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        bufferedReader.close();
    }
}
