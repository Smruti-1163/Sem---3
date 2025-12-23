import java.util.*;
class square extends Thread{
    int n;
    square(int n){
        this.n = n;
    }
    public void run(){
        int res = (int)Math.pow(n,2);
        System.out.println("The square of a number is : " + res);
    }
}
public class Q6 {
    public static void main (String args[])throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int n = sc.nextInt();
        square t = new square(n);
        t.start();
        t.join();
        int sum = 0; 
        while(n > 0){
            int temp = n % 10;
            sum += temp;
            n /= 10;
        }
        System.out.println("The sum of digits : " + sum);
    }   
}
