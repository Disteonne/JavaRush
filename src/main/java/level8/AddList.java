package level8;

import level7.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AddList {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list1=new ArrayList<Integer>();
        int[] counter=new int[10];
        int count=0;
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int j=0;
            while (j<10){
                int n=Integer.parseInt(bufferedReader.readLine());
                // int n=123456;
            list1.add(n);
            while (n%10!=0){
                count++;
                n/=10;
            }
            counter[j]=count;
            j++;
            count=0;
        }
        int max=counter[0];
        for (int i = 0; i < counter.length; i++) {
            if(max<counter[i]){
                max=counter[i];
            }
        }
        System.out.println(max);

    }

}
