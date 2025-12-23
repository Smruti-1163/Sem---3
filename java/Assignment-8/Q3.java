import java.util.*;
class Armstrong implements Runnable{
    public int n; 
    Armstrong(int n){
        this.n = n;
    }
    public void run(){
        int digits = 0,digit,temp = n,sum = 0;
        while(temp > 0){
            digits++;
            temp /= 10;
        }
        temp = n;
        while(temp > 0){
            digit = temp % 10;
            sum += Math.pow(digit,digits);
            temp /= 10;
        }
        if(sum == n){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not a armstrong");
        }
    }
}
public class Q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        Thread t = new Thread(new Armstrong(n));
        //Armstrong t = new Armstrong(n);
        t.start();
        sc.close();
    }
}