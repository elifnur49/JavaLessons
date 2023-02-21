package J08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.
        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner sc = new Scanner(System.in);
        System.out.print(" bir tamsayi giriniz :");
        int sayi = sc.nextInt();
        int kareToplam = 0 ;
        for (int i = 1; i <=sayi; i++) {
            kareToplam += i*i;
        }
        System.out.println("Kareler toplam : " + kareToplam);
    }



    }

