import java.util.*;
class Palindrome extends Thread{
    int n;
    Palindrome(int n){
        this.n = n;
    }
    public void run(){
        int temp = n,rev = 0; 
        while(temp > 0){
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if(rev == n){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
public class Q4 {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        Palindrome t = new Palindrome(n);
        t.start();
        int count = 0; 
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count > 0){
            System.out.println("Composite number ");
        } else {
            System.out.println("Prime number");
        }
    }
}
