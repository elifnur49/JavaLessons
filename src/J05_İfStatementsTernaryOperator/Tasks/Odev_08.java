package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_08 {
    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz : ");
        int sayi = scan.nextInt();


        if (sayi % 5 == 0 && sayi %2 ==0) {
            System.out.println("5'e bölünen cift sayı");
        }else if(sayi % 5 == 0 ||sayi % 2 != 0){
            System.out.println("5'e bölünen tek sayı");
        }else
            System.out.println("Tekrar deneyin");
    }

        }



