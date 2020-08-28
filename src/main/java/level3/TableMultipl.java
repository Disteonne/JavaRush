package level3;

public class TableMultipl {

    public static void main(String[] args) {

        int [][] a= new int[10][10];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=(i+1)*(j+1);
            }
        }

      //  System.out.println(a[2][2]);

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(+a[i][j]+ " \t");
            }
            System.out.println();
        }

    }
}
