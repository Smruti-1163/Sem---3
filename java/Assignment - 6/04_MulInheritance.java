interface A{
    abstract void draw();
}
interface B{
    abstract void erase();
}
class C implements A,B{
    public void draw(){
        System.out.println("Drawing a shape");
    }
    public void erase(){
        System.out.println("Erasing a shape");
    }
}
public class MulInheritance {
    public static void main(String args[]){
        C c = new C();
        c.draw();
        c.erase();
    }
}
