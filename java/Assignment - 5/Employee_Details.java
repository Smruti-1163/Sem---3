import java.util.*;
class Person{
    String name;
    Person(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Name : " + name);
    }
}
class employee extends Person{
    private int empid;
    employee(String name, int empid){
        super(name);
        this.empid = empid;
    }
    void show(){
        super.display();
        System.out.println("Employee Id : " + empid);
    }
}
class HourlyEmployee extends employee{
    private int hourlyRate,hoursWorked,res;
    HourlyEmployee(String name, int empid, int hourlyrate, int hoursWorked){
        super(name,empid);
        this.hourlyRate = hourlyrate;
        this.hoursWorked = hoursWorked;
    }
    void show1(){
        super.show();
        System.out.println("Hourly Rate : " + hourlyRate);
        System.out.println("Hours Worked : " + hoursWorked);
    }
    void getGrossPay(){
        res = hourlyRate * hoursWorked;
        System.out.println("Gross Pay : " + res);
    }
}
public class Employee_Details {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name empid hourly rate and hours worked : ");
        String name = sc.nextLine();
        int empid = sc.nextInt();
        int hourlyRate = sc.nextInt();
        int hoursWorked = sc.nextInt();
        HourlyEmployee emp = new HourlyEmployee(name, empid, hourlyRate, hoursWorked);
        emp.show1();
        emp.getGrossPay();
    }
}
