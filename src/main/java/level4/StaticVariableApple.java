package level4;

public class StaticVariableApple {
    private static int sum=0;
    private int price;
    private String name;
    private  static int counter=0;
    StaticVariableApple(int price, String name){
        this.price=price;
        this.name=name;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    static void sum(StaticVariableApple apple){
        sum+= apple.price;
    }

    public static int getSum() {
        return sum;
    }
}
class Test{
    public static void main(String[] args) {
        StaticVariableApple apple1= new StaticVariableApple(125, "Apple 1");
        StaticVariableApple apple2= new StaticVariableApple(170,"Apple 2");
        StaticVariableApple apple3= new StaticVariableApple(164, "Apple 3");
        StaticVariableApple.sum(apple1);
        StaticVariableApple.sum(apple2);
        StaticVariableApple.sum(apple3);
        int count=StaticVariableApple.getCounter();

        System.out.println(StaticVariableApple.getSum());
        System.out.println(+count);

    }
}
