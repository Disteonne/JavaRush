package level10;

import level7.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        /*
        for (int i = 0; i < 2; i++) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            list.add(bufferedReader.readLine());
        }

         */
        list.add("а");
        list.add("б");
        List<Character> alphabet = Arrays.asList('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int key=0;
        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i),key);
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            String[] str = list.get(i).split(" ");
            for (int j = 0; j < str.length; j++) {
                char[] strToChar = str[j].toCharArray();
                ArrayList<Character> charArr = new ArrayList<Character>();
                //записали в лист
                for (int s = 0; s < strToChar.length; s++) {
                    charArr.add(strToChar[s]);
                }
                /*
                for (int s=0;s<charArr.size();s++){
                    for (int k = 0; k < alphabet.size(); k++) {
                        if (alphabet.get(k).equals(charArr.get(s))) {
                            count++;
                            map.put(charArr.get(s), count++);
                            break;
                        }
                    }
                }
                */
                for (Map.Entry<Character,Integer> pair: map.entrySet()
                     ) {
                    for (int k = 0; k < alphabet.size(); k++) {
                        if (alphabet.get(k).equals(pair.getKey())) {
                            int n = pair.getValue();
                            n++;
                            map.put(pair.getKey(), n);
                        }
                    }
                }
            }


    }

        for (Map.Entry<Character,Integer> pair: map.entrySet()
             ) {
            System.out.print(pair.getKey()+" "+ pair.getValue());
        }
    }
}
