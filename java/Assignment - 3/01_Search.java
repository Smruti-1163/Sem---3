import java.util.*;
public class Search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search in the array: ");
        int key = sc.nextInt();
        int ch = 0,temp = 0;
        for(int i = 0; i < size; i++){
            if(key == arr[i]){
                ch = i;
                temp++;
            }
        }
        if(temp > 0){
            System.out.println("The element is present in index : " + (ch + 1));
        } else {
            System.out.println("Element is not present in the array");
        }
        sc.close();
    }  
}

