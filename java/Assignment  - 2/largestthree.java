import java.util.*;
public class largestthree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers to get the largest one : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = (a > b) ? a : b;
        int largest = (res > c) ? res : c;
        System.out.print("The largest is : " + largest);
        sc.close();
    }
}