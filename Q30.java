import java.util.Scanner;
public class Q30 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
    int row,col;
    int i,j,sum=0;
    System.out.println("Enter the no. of rows");
    row = sc.nextInt();
    System.out.println("Enter the no. of cols");
    col = sc.nextInt();

    int mat[][] = new int[row][col];

    System.out.println("Enter the elements of the matrix");
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                mat[i][j]=sc.nextInt();
            }
        }

    System.out.println("The elements are");
    for(i=0; i<row; i++){
        for(j=0; j<col; j++){
            System.out.println(mat[i][j]+"\t");
    }
    System.out.print("");
    }
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            if(i==j){
                sum = sum + mat[i][j];
            }
        }
    }
    System.out.println("Sum of diagonal is "+sum);
    }
}