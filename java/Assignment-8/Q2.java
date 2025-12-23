import java.util.*;
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread running ... ");
    }
}
public class Q2  {
    public static void main(String args[]){
        MyThread t = new MyThread();
        t.setName("My worker Thread");
        t.start();
        System.out.println("Thread name : " + t.getName());
        System.out.println("Thread Id : " + t.getId());
        System.out.println(" Is Thread alive : " + t.isAlive());
    }
}
