import java.util.*;
public class jagged {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int row = sc.nextInt();
        int jaggedA[][] = new int[row][];
        for(int i = 0; i < row; i++){
            System.out.println("Enter the column for the " + (i+1) + " row");
            int col = sc.nextInt();
            jaggedA[i] = new int[col];
        }
        System.out.println("Enter the elements of the jagged array: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < jaggedA[i].length; j++){
                jaggedA[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of the jagged array are : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < jaggedA[i].length; j++){
                System.out.print(jaggedA[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
