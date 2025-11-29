import java.lang.*;
import java.util.Scanner;
public class Q1
 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Enter two numbers : " );
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int res = n1/n2;
                System.out.println(res);
                break;
            }
            catch(ArithmeticException ob){
                System.out.println("Cannot divide by zero");
            }
        }
        sc.close();
    }
}
