package J08_Loops.Loop02_whileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz

        Scanner sc = new Scanner(System.in);

        int toplam=0, sayac=0;
        while (toplam<=333){

            System.out.print(" bir sayi girisin : ");
            toplam+=sc.nextInt();
            sayac++;

        }
        System.out.println("yeter  "+sayac+" kadar sayi girdin. Toplamları : "+toplam);




    }
}
