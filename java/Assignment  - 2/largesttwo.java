import java.util.*;
public class largesttwo {
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        int largest = (a > b) ? a : b;
        System.out.print("Largest : " + largest);
        sc.close();
    }
}
