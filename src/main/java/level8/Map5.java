package level8;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Map5 {
    public static void main(String[] args) throws ParseException {
        Map<String,Date> mmm=new HashMap<String, Date>();
        mmm=createMap();
        removeAllSummerPeople(mmm);
        for (Map.Entry<String,Date> pair:mmm.entrySet()
             ) {
            String key=pair.getKey();
            Date value=pair.getValue();
            System.out.println(key+" "+value);
        }

    }
    public static Map<String, Date> createMap() throws ParseException {
        Map<String,Date> m= new HashMap<String, Date>();
        DateFormat dateFormat=new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        m.put("Мария", dateFormat.parse("JULY 1 2015"));
        m.put("Маргарита", dateFormat.parse("OCTOBER 1 2000"));
        m.put("София", dateFormat.parse("JUNE 1 2001"));
        m.put("Александра", dateFormat.parse("AUGUST 1 1976"));
        m.put("Анастасия", dateFormat.parse("SEPTEMBER 1 2005"));
        return m;
    }

    public static void removeAllSummerPeople(Map<String,Date> map){

    Iterator<Map.Entry<String,Date>> iterator= map.entrySet().iterator();
    while (iterator.hasNext()){
        Map.Entry<String,Date> pair=iterator.next();
        if(pair.getValue().getMonth()== Calendar.JULY || pair.getValue().getMonth()==Calendar.JUNE
                || pair.getValue().getMonth()==Calendar.AUGUST){
            iterator.remove();
        }
    }
    /*
        for (Map.Entry<String,Date> pair:map.entrySet()
             ) {
            if(pair.getValue().getMonth()== Calendar.JULY || pair.getValue().getMonth()==Calendar.JUNE
            || pair.getValue().getMonth()==Calendar.AUGUST){
                map.remove(pair.getKey());
            }
        }

     */
    }
}
