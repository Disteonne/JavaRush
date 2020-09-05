package level10;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList=new ArrayList<String>();
        /*
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            arrayList.add(bufferedReader.readLine());
        }
        */

        arrayList.add("котик");
        arrayList.add("мама");
        arrayList.add("папа");
        arrayList.add("котик");
        arrayList.add("котик");
        arrayList.add("котик");
        arrayList.add("роза");
        arrayList.add("папа");
        arrayList.add("котик");
        arrayList.add("роза");
        arrayList.add("роза");
        arrayList.add("роза");
        arrayList.add("мама");
        arrayList.add("мама");
        arrayList.add("котик");
        arrayList.add("котик");
        arrayList.add("роза");
        arrayList.add("роза");
        arrayList.add("котик");
        arrayList.add("котик");


        int count=0;
        //int[] counter=new int[20];//массив значени совпад
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(0);
        }
        int size=0;
        for (int i = 0; i < arrayList.size(); i++) {
            count=0;
            for (int j = 0; j < arrayList.size(); j++) {
                if(arrayList.get(i)==arrayList.get(j)){
                    count++;
                    //counter[i]=count;
                    list.set(i,count);
                    if(i!=j)
                    arrayList.set(j," ");
                }
            }
        }
        //int size=list.size();
        Map<String,Integer> map=new HashMap<String, Integer>();
        for (int i = 0; i < 20; i++) {
            map.put(arrayList.get(i),list.get(i));
        }

        for (Map.Entry<String,Integer> pair: map.entrySet()
             ) {
            System.out.println(pair.getKey()+" "+pair.getValue());

        }
    }
}
