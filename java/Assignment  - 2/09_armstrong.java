public class armstrong {
    public static void main(String args[]){
        int i;
        for(i = 0; i <= 10000; i++){
            int sum = 0,digit = 0,temp = i,t = i;
            while(t > 0){
                digit++;
                t = t / 10;
            }

            while(temp > 0){
               int d = temp % 10;
               sum += Math.pow(d,digit);
               temp /= 10;
            }

            if(sum == i){
                System.out.print(i + " ");
            }   

        }
    }
}
