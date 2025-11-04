package Btech.arithmetic;
public class MyMath {
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b; 
    }
    public int mul(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    public int modulo(int a, int b){
        return a % b;
    }
}


import Btech.arithmetic.MyMath;
import java.util.*;
public class ArithmeticDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        MyMath m = new MyMath();
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition : " + m.add(a, b));
        System.out.println("Subtraction : " + m.subtract(a, b));
        System.out.println("Multiplication : " + m.mul(a, b));
        System.out.println("Division : " + m.div(a, b));
        System.out.println("Modulo : " + m.modulo(a, b));
        sc.close();
    }
}
