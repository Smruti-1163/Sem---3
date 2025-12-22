import java.util.*;
import java.lang.*;
interface Calculator{
    public int add(int a, int b);
    public int subtract(int a, int b);
    public int mul(int a, int b);
    public int div(int a, int b);
    public int modulo(int a, int b);
}
class DemoCalculator implements Calculator{
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
        return a / b;
    }
    public int modulo(int a, int b){
        return a % b;
    }
}
public class CalculatorDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        DemoCalculator calc = new DemoCalculator();
        System.out.println("Addition : " + calc.add(a, b));
        System.out.println("Subtraction : " + calc.subtract(a, b));
        System.out.println("Multiplication : " + calc.mul(a, b));
        System.out.println("Division : " + calc.div(a, b));
        System.out.println("Modulo : " + calc.modulo(a, b));
        sc.close();
    }   
}

