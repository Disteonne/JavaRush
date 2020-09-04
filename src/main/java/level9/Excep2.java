package level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Excep2 {
    public static void main(String[] args) {
        //try {
            //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Character> vowel = new ArrayList<Character>(); //гласные
            ArrayList<Character> consonant = new ArrayList<Character>(); //согласные + символы
            //String str = bufferedReader.readLine();
            String str="мама рара.";
            String[] splitStr = str.split(" ");
            char[] v = {'а', 'о', 'и', 'е', 'ё', 'э', 'ы', 'у', 'ю', 'я'};
            for (int i = 0; i < splitStr.length; i++) {
                char[] chStr = splitStr[i].toCharArray();
                for (int j = 0; j < chStr.length; j++) {
                    for (int k = 0; k < v.length; k++) {
                        if (chStr[j] == v[k]) {
                            vowel.add(chStr[j]);
                            break;
                        } else {
                            consonant.add(chStr[j]);
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < vowel.size(); i++) {
                System.out.print(vowel.get(i) + " \t");
            }
            System.out.println();
            for (int i = 0; i < consonant.size(); i++) {
                System.out.print(consonant.get(i) + " \t");
            }
         /*} catch (IOException e) {
            e.getStackTrace();
        }

          */
    }

}
