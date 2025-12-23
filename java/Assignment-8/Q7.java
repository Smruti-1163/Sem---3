import java.util.*;

//import javax.sql.rowset.spi.SyncResolver;
//import javax.swing.plaf.synth.SynthPasswordFieldUI;
class Mul extends Thread{
    int n;
    Mul(int n){
        this.n  = n;
    }
    public void run(){
        System.out.println("Multiplication Table : ");
        for(int i = 1; i <= n; i++){
            System.out.println(n + " "+"*" +" "+ i + " " + "=" + " "+(n*i));
        }
    }
}
class fact extends Thread{
    int n;
    fact(int n){
        this.n = n;
    }
    public void run(){
        System.out.println("Factorial : ");
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println("Factorial : " + fact);
    }
}
public class Q7 {
    public static void main(String args[]) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        Mul t1 = new Mul(n);
        fact t2 = new fact(n);
        try{
            t1.start();
            t1.join();

            t2.start();
            t2.join();
        } catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
