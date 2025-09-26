import java.util.*;
class complex{
    int real, imag;
    complex(){
        real = 0;
        imag = 0;
    }
    complex(int real, int imag){
        this.real = real;
        this.imag = imag;
    }
    void display(){
        System.out.println(real + " + " + imag + "i");
    }
    void add(complex c1, complex c2){
        this.real = c1.real + c2.real;
        this.imag = c1.imag + c2.imag;
        System.out.println(this.real + " + " + this.imag + "i");
    }
}
public class Complex2Demo {
    public static void main(String args[]){
        int real1,real2,imag1,imag2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the '1st' complex number : ");
        real1 = sc.nextInt();
        imag1 = sc.nextInt();
        complex ob1 = new complex(real1,imag1);
        ob1.display();
        System.out.println("Ente the '2nd' complex number : ");
        real2 = sc.nextInt();
        imag2 = sc.nextInt();
        complex ob2 = new complex(real2,imag2);
        ob1.display();
        System.out.println("The addition of the two complex number is : ");
        complex ob3 = new complex();
        ob3.add(ob1,ob2);
        
    }   
}
