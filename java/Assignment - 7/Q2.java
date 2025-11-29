import java.util.*;
public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter to numbers : ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x - y == 0){
                throw new ArithmeticException("Cannot divide by zero");
            } else {
                int res = x/(x-y);
                System.out.println(res);
            }
        }
        catch(ArithmeticException ob){
            System.out.println(ob.getMessage());
        }
    }
}
