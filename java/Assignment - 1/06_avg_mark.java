import java.util.*;
public class avg_mark {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of three diff. subjects : ");
        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();
        float avg = (sub1 + sub2 + sub3)/3;
        System.out.println("The average of the of three subjects is : " + avg);
        sc.close();
    }
}
