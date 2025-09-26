import java.util.*;
class Box{
    int length, width, depth;
    Box(int length,int width,int depth){
        this.length = length;
        this.width = width;
        this.depth = depth;
    }
    int volume(){
        return length*width*depth;
    }
}
public class BoxDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length breadth and depth of the box: ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int depth = sc.nextInt();
        Box ob1 = new Box(length,width,depth);
        int volume = ob1.volume();
        System.out.println("The voulume of the box is : " + volume);
    }
}
