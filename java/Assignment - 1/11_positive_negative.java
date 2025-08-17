import java.util.*;
public class positive_negative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Positive numeber");
        } else {
            System.out.println("Negative number");
        }
    }
}
