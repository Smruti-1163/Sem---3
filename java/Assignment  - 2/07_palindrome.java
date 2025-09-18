import java.util.*;
class palindrome {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num = sc.nextInt();
    
    int temp = num;
    int rev = 0;

    while(num != 0){
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }

        if(temp == rev){
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }

        sc.close();
    }
}
