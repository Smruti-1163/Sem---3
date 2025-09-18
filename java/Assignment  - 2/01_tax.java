import java.util.*;
public class tax {
    public static void main(String args[]){
        double res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income of the person : ");
        int income = sc.nextInt();
        if(income <= 1_50_000){
            System.out.println("No tax");
        } else if(income > 1_50_000 && income <= 3_00_000) {
            res = (income - 150000) * 0.1;
            System.out.println("The tax to be paid is : " + res);
        } else if(income > 3_00_000 && income <= 5_00_000){
            res = (income - 300000)*0.2 + (income - 150000) * 0.1;
            System.out.println("The tax to be paid is : " + res);
        } else {
            res = (300000 - 150000) * 0.1 + (500000 - 300000) * 0.2 + (income - 500000) * 0.3;
            System.out.println("The tax to be paid is : " + res);
        }
        sc.close();
    }
}
