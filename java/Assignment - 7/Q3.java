import java.util.*;
public interface Q3 {
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
            System.out.println("Enter an index 0 t0 " + size + " " + "get the element : ");
            int index = sc.nextInt();
            if(index > size){
                throw new ArrayIndexOutOfBoundsException("Error : Invalid Index");
            } else {
                System.out.println(arr[index]);
            }
        } 
        catch(ArrayIndexOutOfBoundsException ob){
            System.out.println(ob.getMessage());
        }
    }
}
