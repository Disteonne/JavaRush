package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String str= bufferedReader.readLine();
        //String str="hello world";

        String[] s= str.split(" ");
        for (int i = 0; i < s.length; i++) {
            char[] chars = s[i].toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            for (int j = 0; j < chars.length; j++) {
                System.out.print(chars[j]);
            }
            System.out.print("\t");
        }
        /*
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

         */
    }

}
