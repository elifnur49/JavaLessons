package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_16 {

    public static void main(String[] args) {
        /* Task->
         Girilen bir sayı için

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("tamsayı gir:");
        Byte sayi= scan.nextByte();
        if (sayi > 0) {
            if (sayi > 10) {
                System.out.println("Büyüksün");
            } else {
                System.out.println("Normalsin");
            }
        } else {
            if (sayi > -10) {
                System.out.println("Negatifsin");
            } else {
                System.out.println("Cok negatifsin");
            }
        }

        }
        }



