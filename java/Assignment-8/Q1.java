import java.util.*;
public class Q1 {
    public static void main(String args[]){
        Thread t = Thread.currentThread();

        System.out.println("Thread Class : " + t.getClass());
        System.out.println("Thread name : " + t.getName());
        System.out.println("Thread Priority : " + t.getPriority());
        System.out.println("Thread group : " + t.getThreadGroup().getName());
    }
}
