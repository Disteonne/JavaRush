package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
public class Solution10 {
    public static void main(String[] args) throws IOException {
        /*
        String[] str= new String[20];
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < str.length; i++) {
            str[i]= bufferedReader.readLine();
        }
         */
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> str=new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            str.add(bufferedReader.readLine());
        }
        Collections.sort(str);
        for (int i = 0; i < 3; i++) {
            System.out.println(str.get(i));
        }

    }

}
