package level5;

public class Solution {
    public static void main(String[] args) {
    Woman woman1=new Woman("Kate",15,"Sep street");
    Woman woman2=new Woman("Sara",23,"Okt street");
    Man man1=new Man("Igor",21,"Moscow");
    Man man2=new Man("Egor",16,"NN");


    }
    public  static  class Woman{
        private String name;
        private int age;
        private String address;

        Woman(String name,int age,String address){
            this.name=name;
            this.age=age;
            this.address=address;
            System.out.println(name+" "+age+" "+address);
        }
    }
    public  static  class Man{
        private String name;
        private int age;
        private String address;

        Man(String name,int age,String address){
            this.name=name;
            this.age=age;
            this.address=address;
            System.out.println(name+" "+age+" "+address);
        }
    }
}
