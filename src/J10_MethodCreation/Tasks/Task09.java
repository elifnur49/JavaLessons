package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task09 {
    /*
   Task->  Saati saniyeye çeviren  method create ediniz
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int time,second,hour,minute,remainingTime;
        System.out.println("enter the time :");
        time = scan.nextInt();

        hour=time/3600;

        remainingTime= time%3600;
        minute=remainingTime/60;
        second=remainingTime %60;
        System.out.println("hour = " + hour);
        System.out.println("minute = " + minute);
        System.out.println("second = " + second);
    }

}

