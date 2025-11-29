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
            System.out.println("Invalid deposit amount.");
        }
        balance += amt;
        System.out.println(name + " deposited " + amt + ". New balance: " + balance);
    }

    void withdraw(double amt) throws MinimumBalanceException {
        if (amt <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        if ((balance - amt) < 500) {
            throw new MinimumBalanceException("Withdrawal denied . Minimum balance of 500 must be maintained.");
        }
        balance -= amt;
        System.out.println(name + " withdrew " + amt + ". Remaining balance: " + balance);
    }

    void transfer(Account from, Account to, double amt) throws MinimumBalanceException {
        if (amt <= 0) {
            System.out.println("Invalid transfer amount.");
        }

        if ((from.balance - amt) < 500) {
            throw new MinimumBalanceException("Transfer denied. Minimum balance of 500 must be maintained after transfer.");
        }

        from.balance -= amt;
        to.balance += amt;

        System.out.println("Transfer successful " + amt + " transferred from " + from.name + " to " + to.name);
        System.out.println(from.name + " new balance: " + from.balance);
        System.out.println(to.name + " new balance: " + to.balance);
    }

    void display() {
        System.out.println("Account Holder Name : " + name);
        System.out.println("Account Number       : " + acc_no);
        System.out.println("Balance              : " + balance);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name acc_no and balance of Account 1 : ");
        String name1 = sc.nextLine();
        int acc_no1 = sc.nextInt();
        int balance1 = sc.nextInt();
        sc.nextLine();
        Account acc1 = new Account(name1,acc_no1,balance1);

        System.out.println("Enter the name acc_no and balance of Account 2 : ");
        String name2 = sc.nextLine();
        int acc_no2 = sc.nextInt();
        int balance2 = sc.nextInt();
        Account acc2 = new Account(name2,acc_no2,balance2);

        try {
            System.out.println("Enter how much you want to deposit : ");
            int depo = sc.nextInt();
            acc1.deposit(depo);
            System.out.println("Enter how much you want to withdraw : ");
            int with_d = sc.nextInt();
            acc1.withdraw(with_d);
            System.out.println("Enter how much you want to transfer: ");
            int t = sc.nextInt();
            acc1.transfer(acc1, acc2, t);
        } 
        catch (MinimumBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nFinal Account Details");
        acc1.display();
        acc2.display();
    }
}
