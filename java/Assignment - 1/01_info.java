import java.util.Scanner;
public class info {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your branch : ");
        String branch = sc.nextLine();
        System.out.println("Enter your college name : ");
        String clg_name = sc.nextLine();
        System.out.println("Enter your roll no : ");
        int roll_no = sc.nextInt();
        System.out.print(name + "\n" + branch + "\n" + roll_no + "\n" + clg_name);
        sc.close();
    }
}

