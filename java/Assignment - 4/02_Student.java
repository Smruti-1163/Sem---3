import java.util.*;
class std{
    String name,branch;
    int roll_no;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name branch and rollno of the student: ");
        name = sc.nextLine();
        branch = sc.nextLine();
        roll_no = sc.nextInt();
        sc.close();
    }
    void display(){
        System.out.print("Name: " + name + " " + "Roll No: " + roll_no + " " + "Branch: " + branch);
    }
}
public class Student {
    public static void main(String args[]){
        std ob = new std();
        ob.input();
        ob.display();
    }
}
