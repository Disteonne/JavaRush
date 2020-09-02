package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution8 {
    public static void main(String[] args) throws IOException {
        Map<Integer,String> date=new HashMap<Integer,String>();
        date.put(1,"January");
        date.put(2,"February");
        date.put(3,"March");
        date.put(4,"April");
        date.put(5,"May");
        date.put(6,"June");
        date.put(7,"July");
        date.put(8,"August");
        date.put(9,"September");
        date.put(10,"October");
        date.put(11,"November");
        date.put(12,"December");

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String month= bufferedReader.readLine();
        Iterator<Map.Entry<Integer,String>> iterator=date.entrySet().iterator();
        //int number=Integer.parseInt(bufferedReader.readLine());
        for (Map.Entry<Integer,String> pair:date.entrySet()
             ) {
            if(pair.getValue().equals(month)){
                System.out.println(pair.getKey());
            }
        }
    }
}
