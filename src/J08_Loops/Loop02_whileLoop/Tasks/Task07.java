package J08_Loops.Loop02_whileLoop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 7 sayının en buyugunu print eden code create ediniz

        Scanner sc = new Scanner(System.in);

        int bykSayi = 0;
        int kckSayi = 0;

        int sayac = 1;

        while (sayac <= 7) {

            System.out.print(sayac + ". sayi giriniz : ");


            bykSayi = Math.max(sc.nextInt(), bykSayi);
            sayac++;
        }
        System.out.println("bykSayi = " + bykSayi);


    }
}
