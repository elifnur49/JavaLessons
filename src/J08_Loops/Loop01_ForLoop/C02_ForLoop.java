package J08_Loops.Loop01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
       //Task-> girilen sayıdan 100 'e kadar  4 un katı olan tamsayıları prınt eden code create edınız

        Scanner sc=new Scanner(System.in);
        System.out.println(" bir pozitif tam sayı giriniz:");
        int sayi= sc.nextInt();

      if(sayi>100){
          System.out.println("100'den küçük bir sayı olmalı");
       }else{
         for(int i=sayi;i<100;i++){
               if(i%4==0){
                 System.out.println(i+"");
               }
               System.out.println(i+"icin selam yazdı");
           }



    }
}
    }

