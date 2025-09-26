import java.util.*;
class std{
    int regno;
    double cgpa;
    String sname,branch;
    void getdata(){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student name: ");
        sname = sc.nextLine();
        System.out.println("Enter the Student branch: ");
        branch = sc.nextLine();
        System.out.println("Enter the Student registration number: ");
        regno = sc.nextInt();
        System.out.println("Enter the Student cgpa: ");
        cgpa = sc.nextDouble();
    }
    void putdata(){
        System.out.println("Name    : " + sname);
        System.out.println("Branch  : " + branch);
        System.out.println("Reg_no  : " + regno);
        System.out.println("CGPA    : " + cgpa);
        System.out.println("*****************");
    }
}
public class Student_details {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many student details you want to take input: ");
        int size = sc.nextInt();
        std arr[] = new std[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter the details of "+(i+1)+" Student");
            arr[i] = new std();
            arr[i].getdata();
        }
        System.out.println("The details of the students are : ");
        for(int i = 0; i < size; i++){
            arr[i].putdata();
        }
        int index = 1;
        double maxcgpa = arr[0].cgpa;
        for(int i = 1; i < size; i++){
            if(arr[i].cgpa > maxcgpa){
                maxcgpa = arr[i].cgpa;
                index++;
            }
        }
        System.out.println("Student " + index + " " + "has the maximum cgpa : " + maxcgpa);
        sc.close();
    }
}
