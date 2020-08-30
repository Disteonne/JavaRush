package level5;

public class Cat {
    public int age;
    public int weight;
    public int force;
    private boolean b;

    public boolean fight(Cat anotherCat) {
        int counter = 0;
        /*
        if(this.age> anotherCat.age){
            counter++;
        }
        else if(this.weight> anotherCat.weight){
            counter++;
        }
        else if(this.force> anotherCat.force){
            counter++;
        }
        else if(counter>=2){
            //System.out.println("Мы победили");
            b=true;
        }
        else if(counter<=1 && counter>=0 ){
            //System.out.println("Мы проиграли");
            b=false;
        }
        return b;
         */
        int age1 = this.age > anotherCat.age ? 1 : 0;
        int force1 = this.force > anotherCat.force ? 1 : 0;
        int weight1 = this.weight > anotherCat.weight ? 1 : 0;
        counter=age1+force1+weight1;



        return (counter>=2 ? true:false);
    }
}
class Test1{
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.age=23;
        cat1.weight=40;
        cat1.force=50;

        Cat cat2=new Cat();
        cat2.age=4;
        cat2.weight=20;
        cat2.force=50;
        System.out.println(cat1.fight(cat2));
    }
}