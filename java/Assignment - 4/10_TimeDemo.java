import java.util.*;
class time{
    int hour,min,seconds;
    time(){
        hour = 0;
        min = 0; 
        seconds = 0;
    }
    time(int hour,int min, int seconds){
        this.hour = hour;
        this.min = min;
        this.seconds = seconds;
    }
    void display(){
        System.out.println(this.hour + ":" + this.min + ":" + this.seconds);
    }
    void addtime(time t1, time t2){
        this.seconds = t1.seconds + t2.seconds;
        this.min = (t1.min + t2.min) + (this.seconds / 60);
        this.hour = (t1.hour + t2.hour) + (this.min / 60);

        this.seconds = this.seconds % 60;
        this.min = this.min % 60;
        this.hour = this.hour % 24;
    }
}
public class TimeDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first time in (Hour Minute and Second) : ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        time t1 = new time(h1,m1,s1);
        
        System.out.println("Enter the second time in (Hour Minute and Second) : ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        time t2 = new time(h2,m2,s2);
        System.out.println("First time : ");
        t1.display();
        System.out.println("Second time : " );
        t2.display();
        System.out.println("Sum of time");
        time t3 = new time();
        t3.addtime(t1,t2);
        t3.display();

    }
}
