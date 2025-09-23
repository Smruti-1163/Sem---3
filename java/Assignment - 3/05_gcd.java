public class gcd {
    public static void main(String args[]){
        if(args.length != 2){
            System.out.println("Error");
        } else {
            int a,b;
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            while(a <= b){
                if(a > b){
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("The gcd of two number is : " + b);
        }
    }   
}
