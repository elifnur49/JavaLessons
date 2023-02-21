package J08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        /*
        task->  0 ile 100 arasındaki hem 5'e, hem de 4'e tam bölünebilen  sayıları print eden code create edinz.

        */
        System.out.println("   1.yol   ");
        for(int i=1;i<=100;i++){
            if(i%4==0 && i%5==0){
                System.out.println(i+" ");
            }
        }
          System.out.println("  2.yol   ");
        for (int i = 1; i <=100; i++) {
            if(i%20==0){
                System.out.println(i+" ");
            }
        }

       }
    }
