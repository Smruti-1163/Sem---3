import java.util.*;
class Odd extends Thread{
    int m,n;
    Odd(int m, int n){
        this.m = m;
        this.n = n;
    }
    public void run(){
        System.out.println("Odd Number : ");
        for(int i = m; i <= n; i++){
            if(i % 2 != 0){
                System.out.println(i + " ");
            }
        }
    }
}
public class Q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and n : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        Odd t = new Odd(m,n);
        try{
            t.start();
            t.join();
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Even number : ");
        for(int i = m; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i + " ");
            }
        }
    }
}
