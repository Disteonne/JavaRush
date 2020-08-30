package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatFamily {
    private String name;
    private CatFamily mother;
    private CatFamily father;
    private String info;

    CatFamily(String name,CatFamily mother,CatFamily father){
        this.name=name;
        this.mother=mother;
        this.father= father;
    }
    CatFamily(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public String toString() {

        if ((mother == null) && (father == null)) {
            return "The cats name is " + name + " ,no father,no mather";
        } else if (mother == null) {
            return "The cats name is " + name + " ,no mather,father  is " + father.name;
        } else if (father == null) {
            return "The cats name is " + name + " ,no father, mother is " + mother.name;
        } else {
            return "The cats name is " + name + " , mother is " + mother.name + " , father is " + father.name;
        }
    }
}
class Test3 {
    public static void main(String[] args) {
        String str1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            str1 = bufferedReader.readLine();
            CatFamily grandfather = new CatFamily(str1);
            str1 = bufferedReader.readLine();
            CatFamily grandmother = new CatFamily(str1);
            str1 = bufferedReader.readLine();
            CatFamily mother = new CatFamily(str1, null, grandfather);
            str1 = bufferedReader.readLine();
            CatFamily father = new CatFamily(str1, grandmother, null);
            str1 = bufferedReader.readLine();
            CatFamily daughter = new CatFamily(str1, mother, father);
            str1 = bufferedReader.readLine();
            CatFamily son = new CatFamily(str1, mother, father);

            System.out.println(grandfather);
            System.out.println(grandmother);
            System.out.println(father);
            System.out.println(mother);
            System.out.println(daughter);
            System.out.println(son);

        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }
}