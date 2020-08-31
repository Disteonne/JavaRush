package level7;

public class Human {
    private String name;
    private boolean sex;
    private int age;
    Human mother;
    Human father;

    Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    Human(String name, boolean sex, int age, Human mother, Human father) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public String toString() {
        String str = "Name " + name + " ,age " + age;
        str += "sex " + (sex == false ? " мужской" : " женский");
        if (mother == null) {
            str += "father " + father;
        } else if (father == null) {
            str += "mother " + mother;
        }
        return str;
    }
}

class Test10 {
    public static void main(String[] args) {
        Human grandfather = new Human("Геннадий", false, 70);
        Human grandmother = new Human("Анастасия", true, 68);
        Human father = new Human("Олег", false, 43, grandmother, null);
        Human mother = new Human("Екатерина", true, 40, null, grandfather);
        Human daughter = new Human("Соня", true, 21, mother, father);
        Human daughter1 = new Human("Александра", true, 15, mother, father);
        Human daughter2 = new Human("Елизавета", true, 21, mother, father);


        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(daughter);
    }
}