import java.util.*;
import java.lang.Math;
class point{
    double xco,yco;
    point(){
        this.xco = 0;
        this.yco = 0;
    }
    point(double xco,double yco){
        this.xco = xco;
        this.yco = yco;
    }
    double distance_bet_points(point c1, point c2){
        double val =  Math.sqrt(Math.pow((c1.xco - c2.xco),2) + Math.pow((c1.yco - c2.yco),2));
        return val;
    }   
}
public class pointDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x1,x2,y1,y2;
        System.out.println("Enter the value of 'x1' and 'y1' : ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        point ob1 = new point(x1,y1);
        System.out.println("Enter the value of 'x2' and 'y2' : ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        point ob2 = new point(x2,y2);
        point ob3 = new point();
        double res = ob3.distance_bet_points(ob1, ob2);
        System.out.print("The distance between two points is : " + res);
    }
}