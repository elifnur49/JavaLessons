package J08_Loops.Loop02_whileLoop.Tasks;

import java.util.Scanner;

public class Task11 {

        public static void main(String[] args) {
            // task-> istenilen kadar tamsayının toplamını print eden code create ediniz

            Scanner sc = new Scanner(System.in);
            System.out.print("toplamak ıstedıgınız  kadar sayı giriniz:");

            int sayi = sc.nextInt();
            int toplam = 0;

            for(int i = 1; i <= sayi; ++i)
            {
                toplam += i;
            }
            System.out.println("Sayıların Toplamı = " + toplam);
        }
}




