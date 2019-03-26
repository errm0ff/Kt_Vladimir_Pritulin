
/**
 *
 * @author Vladimir Pritulin
 */
public class zadanie2 {  //Выводит все числа

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int twoDm[][]= new int[10][2];
        int i,j,k=1;

        for(i=0;i<10;i++) {
            for(j=0;j<2;j++) {
                twoDm[i][j]=k;
                k++;
            }
        }

        for(int[] row : twoDm) {
            printRow(row);
        }
    }
}