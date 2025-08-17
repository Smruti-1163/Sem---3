import java.util.*;
public class floataddition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first floating number : ");
        float n1 = sc.nextFloat();
        System.out.print("Enter the second floating number : ");
        float n2 = sc.nextFloat();
        float res = n1 + n2;
        System.out.print(res);
        sc.close();
    }
}
