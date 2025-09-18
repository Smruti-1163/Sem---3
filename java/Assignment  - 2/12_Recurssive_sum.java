import java.util.*;
public class Recurssive_sum {
    public static int SumofNaturals(int num){
        if(num == 0){
            return 0;
        } else {
            return num + SumofNaturals(num - 1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int res = SumofNaturals(num);
        System.out.print("The res is : " + res);
        sc.close();
    }
}
