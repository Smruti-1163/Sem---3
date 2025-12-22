import java.util.*;
class complx{
    int real, imag;
    void initialise(int real, int imag){
        Scanner sc = new Scanner(System.in);
        this.real = real;
        this.imag = imag;
    }
    void show(){
        System.out.println(real + " + " + imag + "i");
    }
    void add(complx c1, complx c2){
        this.real = c1.real + c2.real;
        this.imag = c1.imag + c2.imag;
        System.out.println(this.real + " + " + this.imag + "i");
    }
}
public class Complex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        complx ob1 = new complx();
        complx ob2 = new complx();
        complx ob3 = new complx();
        int real1,real2,imag1,imag2; 
        System.out.println("Enter the real and imaginary part: ");
        real1 = sc.nextInt();
        imag1 = sc.nextInt();
        ob1.initialise(real1,imag1);
        ob1.show();
        System.out.println("Enter the real and imaginary part: ");
        real2 = sc.nextInt();
        imag2 = sc.nextInt();
        ob2.initialise(real2,imag2);
        ob2.show();
        System.out.println("The addition of the two complex number is: ");
        ob3.add(ob1,ob2);
    }  
}

