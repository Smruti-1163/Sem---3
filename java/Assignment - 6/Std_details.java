package Btech;
public class Student {
    String name;
    int rollno,m1,m2,m3;
    public Student(String name, int rollno, int m1, int m2, int m3){
        this.name = name;
        this.rollno = rollno;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Roll no : " + rollno);
        System.out.println("Marks 1 : " + m1);
        System.out.println("Marks 2 : " + m2);
        System.out.println("Marks 3 : " + m3);
    }
}


import Btech.Student;
import java.util.*;
public class Std_details {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Student : " );
        String name = sc.nextLine();
        System.out.println("Enter the roll no of the Student : ");
        int rollno = sc.nextInt();
        System.out.println("Enter marks of three subjects : ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        Student s = new Student(name,rollno,m1,m2,m3);
        s.display();
        int total_marks = m1 + m2 + m3;
        System.out.println("Total Marks : " + total_marks);
        double percentage = total_marks/3.0;
        System.out.println("Percentage : " + percentage + "%");
    }
}
