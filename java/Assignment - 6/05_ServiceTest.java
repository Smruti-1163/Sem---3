interface Servicing{
    public void ServiceTime();
}
class car implements Servicing{
    public void ServiceTime(){
        System.out.println("Servicing time of Car : " + "24 Hours"); 
    }
}
class bike implements Servicing{
    public void ServiceTime(){
        System.out.println("Servicing time of Bike : " + "6 Hours");
    }
}
public class ServiceTest {
    public static void main(String args[]){
        Servicing s;
        s = new car();
        s.ServiceTime();
        s  = new bike();
        s.ServiceTime();
    }
}
