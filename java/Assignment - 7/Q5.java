import java.util.*;
import java.util.*;
class MinimumBalanceException extends Exception {
    MinimumBalanceException(String message) {
        super(message);
    }
}
class Account {
    String name;
    int acc_no;
    double balance; 

    Account(String name, int acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void deposit(double amt) {
        if (amt <= 0) {
            System.out.println("Invalid Deposit Amount");
        }
        balance += amt;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    void withdraw(double amt) throws MinimumBalanceException {
        if (amt <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } 
        else if ((balance - amt) < 500) {
            throw new MinimumBalanceException(
                "Withdrawal denied. Minimum balance of 500 must be maintained.");
        } 
        else {
            balance -= amt;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    public void display() {
        System.out.println("Account Holder Name : " + name);
        System.out.println("Account Number       : " + acc_no);
        System.out.println("Balance              : " + balance);
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name account number and balance : ");
        String name = sc.nextLine();
        int acc_no = sc.nextInt();
        int balance = sc.nextInt();
        Account acc = new Account(name,acc_no,balance);
        System.out.println("Enter how much you want to deposit : ");
        int depo = sc.nextInt();
        acc.deposit(depo);

        try {
            System.out.println("Enter how much you want to withdraw : ");
            int with_d = sc.nextInt();
            acc.withdraw(with_d);
        } 
        catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
        
        acc.display();
    }
}
