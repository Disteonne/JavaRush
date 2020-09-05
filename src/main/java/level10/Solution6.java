package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution6 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> algorithm= new ArrayList<Integer>();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 30; i++) {
            algorithm.add(Integer.parseInt(bufferedReader.readLine()));
        }
        Collections.sort(algorithm);
        System.out.println(algorithm.get(9));
        System.out.println(algorithm.get(10));
    }
}
