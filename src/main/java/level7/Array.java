package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public static void main(String[] args) {
        String[] str=new String[10];
        int[] length1=new int[10];
        try {
            for(int i=0;i<10;i++){
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
                str[i]= bufferedReader.readLine();
            }
            for (int i = 0; i < 10; i++) {
                length1[i]=str[i].length();
                System.out.println(length1[i]);
            }
        }catch (IOException ex){
            System.out.println("Error");
        }
    }
}
