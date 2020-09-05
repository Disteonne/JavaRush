package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list1L = new ArrayList<String>();
        ArrayList<Integer> list2L = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            String str = bufferedReader.readLine();
            try {

                int n = Integer.parseInt(str);
                list2L.add(n);

            } catch (NumberFormatException e) {
                list1L.add(str);
            }
        }
        Map<String,Integer> map=new HashMap<String, Integer>();
        for (int i = 0; i < 3; i++) {
            map.put(list1L.get(i),list2L.get(i));
        }
        for (Map.Entry<String,Integer> pair:map.entrySet()
             ) {
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
    }
}
