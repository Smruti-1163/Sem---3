package org.shapes;
public class Square {
    public double side;
    public Square(double side){
        this.side = side;
    }
    public double area() {
        return Math.pow(side,2);
    }
    public double perimeter() {
        return 4 * side;
    }
}

package org.shapes;
public class Circle {
    public double r;
    public Circle(double r){
        this.r = r;
    }
    public double area() {
        return 3.14 * Math.pow(r,2);
    }
    public double perimeter() {
        return 2 * 3.14 * r;
    }
}

package org.shapes;
public class Triangle {
    double a,b,c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }  
    public double perimeter(){
        return a + b + c;
    }
    public double area() {
        double s = perimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}

 
import org.shapes.Square;
import org.shapes.Circle;
import org.shapes.Triangle;
import java.util.*;
public class TestShapes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Choose shape : 1-Square 2-Circle 3-Triangle 4-Exit Program");
            int ch = sc.nextInt();
            switch(ch) {
                case 1: 
                    System.out.println("Enter the side of the square : ");
                    double side = sc.nextDouble();
                    Square s = new Square(side);
                    System.out.println("Area of Square : " + s.area());
                    System.out.println("Perimeter of Square : " + s.perimeter());
                    break;
                case 2:
                    System.out.println("Enter the radius of the circle : ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    System.out.println("Area of Square : " + c.area());
                    System.out.println("Perimeter of Square : " + c.perimeter());
                    break;
                case 3:
                    System.out.println("Enter the length of the three sides : ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    double cc = sc.nextDouble();
                    Triangle t = new Triangle(a,b,cc);
                    System.out.println("Area of Square : " + t.perimeter());
                    System.out.println("Perimeter of Square : " + t.area());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
