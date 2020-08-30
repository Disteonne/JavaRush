package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    static String readString() throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String str1=bufferedReader.readLine();
        return str1;
    }
    static int readInt() throws  IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(bufferedReader.readLine());
        return n1;
    }
    static double readDouble() throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        double d1= Double.parseDouble(bufferedReader.readLine());
        return d1;
    }
    static boolean readBoolean() throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        boolean b1=Boolean.parseBoolean(bufferedReader.readLine());
        return b1;
    }
}

class Test2 {
    public static void main(String[] args) {
        int n1;
        double d1;
        boolean b1;
        String str1;
        try {
            str1 = ConsoleReader.readString();
            System.out.println(str1+" -Строка.");

            n1 = ConsoleReader.readInt();
            System.out.println(+n1+" -Число.");

            d1 = ConsoleReader.readDouble();
            System.out.println(+d1+" -dЧисло.");

            b1 = ConsoleReader.readBoolean();
            System.out.println(b1+" -Boolean");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}