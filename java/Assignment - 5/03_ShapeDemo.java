import java.lang.*;
class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
    void erase(){
        System.out.println("Erasing shape");
    }
}
class circle extends Shape{
   void draw(){
        System.out.println("Drawing Circle");
    }
    void erase(){
        System.out.println("Erasing Circle");
    }
}
class triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }
    void erase(){
        System.out.println("Erasing Triangle");
    }
}
class square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Square");
    }
}
public class ShapeDemo {
    public static void main(String args[]){
        Shape s;
        s = new circle();
        s.draw();
        s.erase();

        s = new triangle();
        s.draw();
        s.erase();

        s = new square();
        s.draw();
        s.erase();
    }
}
