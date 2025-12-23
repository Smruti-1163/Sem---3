import java.util.*;
class mulodd extends Thread{
    int[] arr1,arr2,res1;
    mulodd(int a[], int b[], int c[]){
        arr1 = a; 
        arr2 = b; 
        res1 = c;
    }
    public void run(){
        System.out.println("Odd Multiplication : ");
        for(int i = 0; i < arr1.length; i++){
            if((arr1[i] % 2 != 0) && arr2[i] % 2 != 0){
                res1[i] = arr1[i] * arr2[i];
            }
        }
        for(int i = 0 ; i < arr1.length; i++){
            System.out.println(res1[i]);
        }
    }
}
class muleven extends Thread{
    int[] arr1,arr2,res2;
    muleven(int a[], int b[], int c[]){
        arr1 = a; 
        arr2 = b; 
        res2 = c;
    }
    public void run(){
        System.out.println("Even Multiplication : ");
        for(int i = 0; i <= arr1.length - 1; i++){
            if((arr1[i] % 2 == 0) && arr2[i] % 2 == 0){
                res2[i] = arr1[i] * arr2[i];
            }
        }
        for(int i = 0 ; i < arr1.length; i++){
            System.out.println(res2[i]);
        }
    }
}
public class Q9 {
    public static void main(String args[]) throws InterruptedException{
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int res1[] = new int[n];
        int res2[] = new int[n];

        System.out.println("Enter the elements of 1st array : ");
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array : ");
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }
        mulodd t1 = new mulodd(arr1,arr2,res1);
        muleven t2 = new muleven(arr1,arr2,res2);
        
        
            t1.start();
            t1.join();
            t2.start();
            t2.join();
       
    }
}
