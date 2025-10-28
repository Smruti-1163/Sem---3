import java.lang.*;
import java.util.*;
class Account{
    String cname;
    int acc_no;
    Account(String cname, int acc_no){
        this.cname = cname;
        this.acc_no = acc_no;
    }
    void display(){
        System.out.println("Name :\t" + cname);
        System.out.println("Account No :  " + acc_no);
    }
}
class Savings_Account extends Account{
    int min_bal,saving_bal;
    Savings_Account(String cname, int acc_no,int min_bal, int saving_bal){
        super(cname,acc_no);
        this.min_bal = min_bal;
        this.saving_bal = saving_bal;
    }
    void show(){
        super.display();
        System.out.println("Minimum Balance : "+min_bal);
        System.out.println("Saving Balance :  "+saving_bal);
    } 
}
class Account_details extends Savings_Account{
    int deposit,withdraw;
    Account_details(String cname, int acc_no, int min_bal, int saving_bal){
        super(cname, acc_no, min_bal, saving_bal);
    }
    void deposit(int deposit){
        saving_bal += deposit;
        System.out.println("Saving balance : " + saving_bal);
    }
    void withdraw(int withdraw){
        if(saving_bal < min_bal){
            System.out.println("Cannot withdraw saving balance is less than minimum balance");
            return  ;
        } 
        else if(withdraw > saving_bal){
            System.out.println("Cannot withdraw less money in account");
        } else {
            saving_bal -= withdraw;
        }
        System.out.println("Saving balance : " + saving_bal);
    }
    void show1(){
        super.show();
    }
}
public class AccountDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer name : ");
        String cname  = sc.nextLine();
        System.out.println("Enter the customer account number : ");
        int acc_no = sc.nextInt();
        System.out.println("Enter the minimum balance : ");
        int min_bal = sc.nextInt();
        System.out.println("Enter the saving balance : ");
        int saving_bal = sc.nextInt();
        Account_details acc = new Account_details(cname, acc_no, min_bal, saving_bal);
        acc.show1();
        System.out.println("Enter how much you want to deposit : ");
        int deposit = sc.nextInt();
        acc.deposit(deposit);
        System.out.println("Enter how much you want to withdraw : ");
        int withdraw = sc.nextInt();
        acc.withdraw(withdraw);
    }
}
