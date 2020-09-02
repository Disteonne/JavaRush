package level8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution7 {
    public static void main(String[] args) throws  ParseException{
        String date="FEBRUARY 1 2013";
        System.out.println(isDateOdd(date));

    }
    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat dateFormat=new SimpleDateFormat("MMMM D YYYY", Locale.ENGLISH);
        Date d= dateFormat.parse(date);
        if(d.getDay()%2==0){
            return true;
        }
        return false;
    }
}
