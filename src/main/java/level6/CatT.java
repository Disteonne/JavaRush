package level6;

import java.util.ArrayList;

public class CatT {
    public static ArrayList<Cat> cats= new ArrayList<Cat>(10);

    public static void main(String[] args) {
        int i=0;
        while (i<10){
            Cat cat=new Cat();
            cats.add(cat);
            i++;
        }
        printCatsS();
    }

    static void printCatsS(){
        for(int i=0;i<10;i++){
            System.out.println(cats.get(i));
        }

    }
}
