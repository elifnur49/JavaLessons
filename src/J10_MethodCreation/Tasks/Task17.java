package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541

         */
        int sayi, reverse = 0;

        System.out.println("Bir tam sayı girin :");
        Scanner in = new Scanner(System.in);
        sayi = in.nextInt();

        while(sayi != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + sayi%10;
            sayi = sayi/10;
        }

        System.out.println("Ters çevrilen tam sayı " + reverse);

        System.out.println("   ***    ");
        System.out.print("Bir sayi giriniz: ");
        int say = in.nextInt();

        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while(say > 0) {

            System.out.print(say % 10);
            say /= 10;

    }
    }
    }


