import java.util.*;
public class Q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        try{
            System.out.println("Enter a valid index to extract the element from the array : ");
            int index = sc.nextInt();
            System.out.println("Enter a number to divide : ");
            int a = sc.nextInt();
            if(index > size){
                throw new ArrayIndexOutOfBoundsException("Error: Invalid Index");
            } else if(a == 0) {
                throw new ArithmeticException("Cannot divide by Zero");
            } else {
                int res = arr[index]/a;
                System.out.println(res);
            }
        }
        catch(ArrayIndexOutOfBoundsException ob){
            System.out.println(ob.getMessage());
        }
        catch(ArithmeticException ob){
            System.out.println(ob.getMessage());
        }
        sc.close();
    }
}
