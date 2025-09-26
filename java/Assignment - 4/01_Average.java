import java.util.*;
class Avg{
    int a,b,c,avg;
    void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a b and c : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        avg = (a+b+c)/3;
        System.out.println("The average of the three number is : " + avg);
        sc.close();
    }
}
public class Average {
    public static void main(String args[]){
        Avg ob = new Avg();
        ob.calc();
    }
}
 
