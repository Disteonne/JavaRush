package level4;

import java.beans.IntrospectionException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appraisals {
    private static int counter=0;
    private static int[] appraisal= new int[3];
    static void appraisalsCounter() throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<3;i++){
            appraisal[i]= Integer.parseInt(bufferedReader.readLine());
            if(appraisal[i]>0){
                counter++;
            }

        }
        System.out.println(counter);
    }
}
class Test10 {
    public static void main(String[] args) {
        try {
            Appraisals.appraisalsCounter();
        } catch (IOException ex) {
            System.out.println("Ошибка ввода");
        }
    }
}