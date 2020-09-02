package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution9 {
    public static void main(String[] args) throws IOException {
        Map<String,String> map=new HashMap<String, String>();
        map.put("Иванов","Москва");
        map.put("Петров","Смоленск");
        map.put("Сизорова","Иркутск");
        map.put("Павлов","Пермь");
        map.put("Сорокина","Нижний Новгород");
        map.put("Зорина","Орехово-Зуево");
        map.put("Максакова","Санкт-Петербург");
        map.put("Куропаткина","Дзержинск");

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String str= bufferedReader.readLine();
        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
        for (Map.Entry<String,String> pair: map.entrySet()
             ) {
            if(pair.getKey().equals(str)){
                System.out.println(pair.getValue());
            }
        }
    }
}
