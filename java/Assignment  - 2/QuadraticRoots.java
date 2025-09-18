import java.util.*;
public class QuadraticRoots {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficients of 'a','b' and 'c' : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b*b - 4*a*c;

        if(d < 0){
            System.out.println("The roots are real and imaginary");
            double real = -b/(2*a);
            double imag = Math.sqrt(d) / (2*a);
            System.out.println("The real root is : " + real);
            System.out.println("The imaginary root is : " + imag);
        } else if(d == 0){
            System.out.println("Roots are real and equal");
            double roots = -b/(2*a);
            System.out.println("The real and equal roots are : " + roots);
        } else {
            System.out.println("Roots are real and different");
            double root1 = (-b + Math.sqrt(d)) / (2*a);
            double root2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("The real and different roots are : " + root1 + " " + root2);
        }
        sc.close();
    }
}
