import java.util.*;
public class Grade {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks  of the student : ");
        float marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("O grade");
        } else if(marks >= 80 && marks < 90) {
            System.out.println("E grade");
        } else if(marks >= 70 && marks < 80){
           System.out.println("A grade");
        } else if(marks >= 60 && marks < 70) {
            System.out.println("B grade");
        } else if(marks >= 50 && marks < 60){
            System.out.println("C grade");
        } else {
            System.out.println("F grade");
        }
        sc.close();
    }
}


