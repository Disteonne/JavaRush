package level6;

public class Solution {
    public static void main(String[] args) {
        int counter=0;
        while (counter<50000){
            Cat cat=new Cat();
            cat=null;
            Dog dog=new Dog();
            dog=null;
            counter++;
           counter++;
        }
    }
}

class Cat{
    @Override
    public void finalize() throws Throwable{
        //super.finalize();
        System.out.println("Объект cat уничтожен.");
    }
}
class Dog{
    @Override
    public void finalize() throws Throwable{
        //super.finalize();
        System.out.println("Объект dog уничтожен.");
    }
}