package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 2; i++) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            list.add(bufferedReader.readLine());
        }


        //list.add("алия милая");
        //list.add("баранчик");
        List<Character> alphabet = Arrays.asList('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
        //ввели строку  и делим ее на массив строк
        int count = 0;
        //int[] counter=new int[alphabet.size()]; //массив для счета букв
        LinkedList<Integer> counter = new LinkedList<Integer>();
        for (int i = 0; i < 33; i++) {
            counter.add(0);
        }

        //for (int i = 0; i < 2; i++) { //два раза вводим строки

            for (int j = 0; j < list.size(); j++) {
                String[] listToStrArr = list.get(j).split(" ");
                for (int k = 0; k < listToStrArr.length; k++) {
                    char[] strToCharArr = listToStrArr[k].toCharArray();

                    for (int l = 0; l < strToCharArr.length; l++) {
                        for (int m = 0; m < alphabet.size(); m++) {
                            if (alphabet.get(m) == strToCharArr[l]) {
                                int tmp = counter.get(m);
                                tmp++;
                                counter.set(m, tmp);
                                break;
                            }
                        }
                    }
                }
            }
     //   }
            /*
            Map<Character,Integer> map=new HashMap<Character, Integer>();
            for (int j = 0; j < 33; j++) {
                map.put(alphabet.get(j),counter.get(j));
            }
            for (Map.Entry<Character,Integer> pair: map.entrySet()
                 ) {
                System.out.println(pair.getKey()+" "+pair.getValue());
            }
        //Collections.sort(alphabet);
            */


        for (int j = 0; j < alphabet.size(); j++) {
            System.out.print(alphabet.get(j)+" \t");
        }
        System.out.println();
            for (int j = 0; j < counter.size(); j++) {
                System.out.print(counter.get(j)+"\t");
            }




        }
    }

