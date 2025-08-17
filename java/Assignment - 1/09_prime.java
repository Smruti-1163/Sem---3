import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not : ");
        int num = sc.nextInt();
        int i,ch= 0;
        if(num <=1){
            System.out.println("Not prime");
        } else {
            for(i = 2; i < num; i++){
                if(num % i == 0){
                    ch++;
                }
            }
        }
        if(ch == 0){
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
