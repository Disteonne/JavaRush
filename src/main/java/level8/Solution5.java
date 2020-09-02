package level8;

import javax.swing.event.HyperlinkEvent;
import java.util.ArrayList;

public class Solution5 {
    public static void main(String[] args) {
        Human child1=new Human("Кирилл",true,21);
        Human child2=new Human("Настя",false,18);
        Human child3=new Human("Костя",true,27);
        ArrayList<Human> child=new ArrayList<Human>();
        child.add(child1);
        child.add(child2);
        child.add(child3);
        Human mother =new Human("Оксана",false,61,child);
        Human father = new Human("Олег",true,65,child);
        Human grandfather1=new Human("Илья",true,84,mother);
        Human grandfather2=new Human("Константин",true,78,mother);
        Human grandmother1=new Human("Елизавета",false,81,father);
        Human grandmother2=new Human("Любовь",false,75,father);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
    }
}

class Human{
    private String name;
    private boolean sex;
    private int age;
    private ArrayList<Human> children;
    private Human child;

    Human(String name,boolean sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    Human(String name,boolean sex,int age,Human child){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.child=child;
    }


    Human(String name,boolean sex,int age,ArrayList<Human> children){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.children=children;
        /*
        this.mother=mother;
        this.father=father;

         */
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", children=" + children +
                ", child=" + child +
                '}';
    }
}
