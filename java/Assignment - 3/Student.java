public class Student {
    public static void main(String args[]){
        String sic = args[0];
        String name = args[1],branch = args[2];
        double sum = 0;
        for(int i = 3; i < 9; i++){
            sum = sum + Double.parseDouble(args[i]);
        }
        double average = sum/6;
        System.out.print(name + " "  + sic + " " + branch + " " + " " + average);
    }
}
