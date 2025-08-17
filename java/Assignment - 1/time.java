import java.util.*;
public class time {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds : ");
        int total_sec = sc.nextInt();
        int hours = total_sec / 3600;
        int minutes = (total_sec % 3600) / 60;
        int sec = total_sec % 60;
        System.out.println(hours+"hours" + " " + minutes +"minutes" + " " + sec + "seconds");
        sc.close();
    }
}
