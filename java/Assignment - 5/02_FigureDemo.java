import java.util.*;
class Figure{
    double dim1,dim2;
    Figure(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    double area(){
        return dim1 * dim2;
    }
}
class Triangle extends Figure{
    Triangle(double base, double height){
        super(base,height);
    }
    double area(){
        return 0.5*dim1*dim2;
    }
}
class Rectangle extends Figure{
    Rectangle(double length, double breadth){
        super(length,breadth);
    }
    double area(){
        return dim1*dim2;
    }
}
class square extends Figure{
    square(double a){
        super(a,a);
    }
    double area(){
        return dim1*dim1;
    }
}
public class FigureDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Figure fig;
        int res;
        System.out.println("Enter the length and breadth of the rectangle : ");
        double len = sc.nextDouble();
        double breadth = sc.nextDouble();
        fig = new Rectangle(len,breadth);
        System.out.println("Area of rectangle : " + fig.area());
        System.out.println("Enter the base and height of the rectangle : ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        fig = new Triangle(base, height);
        System.out.println("Area of triangle : " + fig.area());
        System.out.println("Enter the side of the square : ");
        double side = sc.nextDouble();
        fig = new square(side);
        System.out.println("Area of square : " + fig.area());
    }
}
