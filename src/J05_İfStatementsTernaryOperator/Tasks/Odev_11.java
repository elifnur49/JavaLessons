package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_11 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Lütfen bir yıl giriniz : ");
                int yil = sc.nextInt();

                if ((yil % 4 == 0)  &&  (yil % 100 != 0) || (yil % 400 == 0) ){
                        System.out.println("Girdiğiniz yil ARTIK YIL'dır");
                }else {
                        System.out.println("Girdiğinz yıl artık yıl değildir.");
                }
}
        }
   /* Task->
           girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
         */