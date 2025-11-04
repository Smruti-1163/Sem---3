import java.lang.*;
import java.util.*;
abstract class Shape{
    abstract int RectangleArea(int a, int b);
    abstract int SquareArea(int a);
    abstract int CircleArea(int a);
}
class Area extends Shape{
    int RectangleArea(int a, int b){
        return a * b;
    }
    int SquareArea(int a){
        return (int)Math.pow(a,2);
    }
    int CircleArea(int a){
        return (int)(3.14 * Math.pow(a,2));
    }
}
public class ShapeDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Shape s = new Area();
        System.out.println("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of Rectangle : " + s.RectangleArea(a, b));
        System.out.println("Area of Square : " + s.SquareArea(a));
        System.out.println("Area of Circle : " + s.CircleArea(a));
        sc.close();
    }
}
