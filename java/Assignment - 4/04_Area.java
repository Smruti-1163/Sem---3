import java.util.*;
class Area1{
    double length,breadth;
    void setdim(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double getArea(){
        return length*breadth;
    }
}
public class Area {
    public static void main(String arsg[]){
        Scanner sc = new Scanner(System.in);
        Area1 ob1 = new Area1();
        int length,breadth;
        System.out.println("Enter the length and breadth of the rectangle: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        ob1.setdim(length,breadth);
        double area = ob1.getArea();
        System.out.println("The area of the rectangle is : " + area);
    }
}
