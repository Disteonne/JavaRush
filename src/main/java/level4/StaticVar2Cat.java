package level4;

public class StaticVar2Cat {
    private static int counter=0;
    StaticVar2Cat(){
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
class Test2{
    public static void main(String[] args) {
        StaticVar2Cat cat1= new StaticVar2Cat();
        StaticVar2Cat cat2= new StaticVar2Cat();
        System.out.println(StaticVar2Cat.getCounter());
    }
}