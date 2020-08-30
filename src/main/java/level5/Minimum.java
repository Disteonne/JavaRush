package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minimum {
    private static int[] minMax=new int[5];
    private static int min;
    static void min(){
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            for(int i=0;i<minMax.length;i++){
                minMax[i]=Integer.parseInt(bufferedReader.readLine());
            }
            min=minMax[0];
            for(int i=0;i<minMax.length;i++){
                if(min>minMax[i]){
                    min=minMax[i];
                }
            }
            System.out.println(+min);
        }catch (IOException ex){
            System.out.println("Error");
        }

    }
}

class Test3{
    public static void main(String[] args) {
        Minimum.min();
    }
}