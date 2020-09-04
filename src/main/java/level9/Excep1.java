package level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Excep1 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String date = bufferedReader.readLine();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
            DateFormat dateFormat1=new SimpleDateFormat("MMM dd , yyyy", Locale.ENGLISH);
            Date date1=dateFormat.parse(date);
            String res=dateFormat1.format(date1);
            System.out.println(res.toUpperCase());

        } catch (IOException e) {
            System.out.println("error");
        } catch (ParseException e) {
            System.out.println("error1");
        }
    }
}
