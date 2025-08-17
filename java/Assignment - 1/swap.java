import java.util.*;
public class swap {
    public static void main(String args[]){
        int a = 20;
        int b = 30;
        System.out.println("The orginal number is : " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The swapped number is : " + a + " " + b);
    }

}
