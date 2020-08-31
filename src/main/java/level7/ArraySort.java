package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySort {
    public static void main(String[] args) throws IOException {

        int[] arr = new int[5];
        int tmp;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        boolean b=true;
        while (b){
            b=false;
            for (int i =0; i < arr.length-1; i++) {
                if (arr[i] < arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    b=true;
                }
            }
        }

        for (int i =0; i< arr.length; i++) {
            System.out.println(+arr[i]);
        }
    }
}
