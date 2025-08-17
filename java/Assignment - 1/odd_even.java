import java.util.*;
public class odd_even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.print("Even number");
        } else {
            System.out.print("Odd number");
        }
        sc.close();
    }
}
