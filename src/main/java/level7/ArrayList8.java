package level7;

import java.util.ArrayList;

public class ArrayList8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        /*
        list.add("котик");
        list.add("масек");
        list.add("лобач");
        list.add("вкс");
        list.add("сабдвач");
        list.add("ворона");
        list.add("любимка");
        list.add("универ");
        list.add("лира");
         */
        list.add("abc");
        list.add("парад");
        list.add("поезд");
        list.add("лев");
        list.add("рулетка");
        list.add("клоп");
        list.add("ракета");
        list.add("семафор");
        list.add("лань");


        fix(list);


         /*
        list.add("лобач");
        list.add("любимка");
        list.add("лenj");
        fix(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

         */

    }

    static void fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            char[] symbol = new char[list.get(i).length()];
            symbol = list.get(i).toCharArray();
            for (int j = 0; j < symbol.length; j++) {
                if (symbol[j] == 'р' && symbol[j] == 'л')
                    continue;
            }
            for (int j = 0; j < symbol.length; j++) {
                if (symbol[j] == 'р') {
                    list.remove(i);
                    i--;
                    //countIfOne++;
                    break;
                }
            }
            for (int j = 0; j < symbol.length; j++) {
                if (symbol[j] == 'л') {
                    list.add(i, str);
                    i = i + 2;
                    break;
                }
            }

        }

    /*          2й вариант
    static void fix(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("л")) {
                list.add(i, list.get(i));
                i += 2;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р")){
                list.remove(list.get(i));
                i--;
            }

        }
     */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }


    }
}