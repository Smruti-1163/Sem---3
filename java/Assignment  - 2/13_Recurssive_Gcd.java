import java.util.*;
public class Recurssive_Gcd {
    public static int Gcd(int a, int b){
        if(b == 0){
            return a;
        } else {
            return Gcd(b,a % b);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = Gcd(a,b);
        System.out.print("Gcd of two numbers  " + a + " " + b + " " + " is " + gcd);
        sc.close();
    }
}
