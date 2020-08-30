package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm {
    public static void main(String[] args) {

            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(bufferedReader.readLine()); //кол-во чисел ввода
                int[] array=new int[n];
                    for(int i=0;i<n;i++) {
                        array[i] = Integer.parseInt(bufferedReader.readLine());
                    }
                    int max=array[0];
                    for(int i=0;i<n;i++){
                        if(max<array[i]){
                            max=array[i];
                        }
                    }
                    System.out.println(+max);
            }catch (IOException ex){
                ex.getStackTrace();
            }

    }
}
