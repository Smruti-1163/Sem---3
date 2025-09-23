import java.util.*;
public class add_matrix {
    public static void input(int row1, int col1, int matrix1[][]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col1; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
    }
    public static void add(int row1, int col1, int matrix1[][], int row2, int col2, int matrix2[][]){
        int res[][] = new int[row1][col1];
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col1; j++){
                    res[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The addition of the matrix is : ");
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col1; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column of 1st matrix : ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int matrix1[][] = new int[row1][col1];
        System.out.println("Enter row and column of 2nd matrix : ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int matrix2[][] = new int[row2][col2];
        if(row1 == row2 && col1 == col2){
            System.out.println("Enter the elements of the 1st matrix: ");
            input(row1,col1,matrix1);
            System.out.println("Enter the elements of the 2nd matrix: ");
            input(row2,col2,matrix2);
        } else {
            System.out.println("Invalid dimension");
        }
        add(row1,col1,matrix1,row2,col2,matrix2);
        sc.close();
    }
}
