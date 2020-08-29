package level4;

public class OutputFor {
    static void out(int iNumber,int jNumber){
        for(int i=0;i<iNumber;i++){
            for (int j=0;j<jNumber;j++){
                System.out.print("8"+"\t");
            }
            System.out.println();
        }
    }
}

class Test13{
    public static void main(String[] args) {
        OutputFor.out(2,4);
    }
}