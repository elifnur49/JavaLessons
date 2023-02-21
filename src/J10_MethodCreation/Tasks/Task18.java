package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task18 {

       /* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/

    public static void main(String[] args) {
        int a,b;
        double c;
       Scanner scan=new Scanner(System.in);
        System.out.println("1. kenarı gırınız:");
        a=scan.nextInt();
        System.out.println("2. kenarı gırınız :");
        b=scan.nextInt();

       c=Math.sqrt((a*a)+(b*b));

        System.out.println("hipotenus:"+c );

    }
    }

