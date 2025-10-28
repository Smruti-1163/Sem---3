import java.util.*;
class Point2D{
    int x,y;
    Point2D(){
        x = 0;
        y = 0;
    }
    Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("Coordinates :" + x + " " + y);
    }
}
class Point3D extends Point2D{
    int z;
    Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    void show(){
        System.out.println("Coordinates :" + x + " " + y + " " + z);
    }
}
public class Point3D_Demo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Point2D p2D = new Point2D();
        p2D.display();
        System.out.println("Enter the coordinates of Point 2D : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Point2D pd = new Point2D(x,y);
        pd.display();
        System.out.println("Enter the coordinates of the Point 3D : ");
        int z = sc.nextInt();
        Point3D p = new Point3D(x, y, z);  
        p.show();
        }
}
