package level4;

public class ToTen {
    private static int var;
    static int displayClosestToTen(int numberOne,int numberTwo){
        if( Math.abs(numberOne-10)>Math.abs(numberTwo-10)){
            var=numberTwo;
        }
        if(Math.abs(numberOne-10)<Math.abs(numberTwo-10)){
            var=numberOne;
        }
        if(Math.abs(numberOne-10)==Math.abs(numberTwo-10)){
            var=numberOne;
        }
        return var;
    }
}
class Test4{
    public static void main(String[] args) {
        System.out.println(ToTen.displayClosestToTen(8,10));
        System.out.println(ToTen.displayClosestToTen(6,6));
        System.out.println(ToTen.displayClosestToTen(-15,45));

    }
}
