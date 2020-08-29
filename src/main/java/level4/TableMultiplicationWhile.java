package level4;

public class TableMultiplicationWhile {
    static void multiplic(){
        int i=1;
        while (i<11){
            int j=1;
            while (j<11){
                System.out.print(i*j+ "\t");
                j++;
            }
            System.out.println();
            i++;
            //System.out.println(+i);

        }
    }
}

class Test11{
    public static void main(String[] args) {
        TableMultiplicationWhile.multiplic();
    }
}