import java.util.*;
class InvalidInputException extends Exception{
    InvalidInputException(String message){
        super(message);
    }
}

class Q7 {
    public static void main(String args[]) {
        double feet, inch, cm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter measurements:");
        try {
            feet = sc.nextDouble();
            inch = sc.nextDouble();
            if (feet < 0 || inch < 0)
                throw new InvalidInputException("cannot be negative");
            cm = 12 * feet + inch * (12 / 10);
            System.out.println("Result in  :" + cm + "cm");
        }
        catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}