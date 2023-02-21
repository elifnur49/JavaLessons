package J08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int rakToplami = 0;

        for (int i = sayi; i > 0; i = i / 10) {
            rakToplami+=i%10;
        }
        System.out.println("Rakamlar toplami = " + rakToplami);
    }


    }

