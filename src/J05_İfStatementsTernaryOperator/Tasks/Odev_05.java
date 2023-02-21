package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_05 {
    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */
// TASK-> girilen bir pozitif tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi= scan.nextInt();
        if(sayi > 99 &&sayi<1000){
            System.out.println(" "+sayi+" Sayısı 3 basamaklı bir sayıdır.");
        }else if(sayi > 9 &&sayi<100){
            System.out.println(" "+sayi+" Sayısı 2 basamaklı bir sayıdır");
        }else
            System.out.println("Sayi 3 veya 2 basamaklı degildir.");
}
}

