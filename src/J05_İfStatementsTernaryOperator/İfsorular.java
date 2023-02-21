package J05_İfStatementsTernaryOperator;

import java.util.Scanner;

public class İfsorular {
    public static void main(String[] args) {
        // Not: soruları çözerken else öğrenmedik kullanmayın
        // Task 1: kişinin yaşını ekrandan okurun 40 ve üstü ise kemal yaştır yazdırın
        // Task 2: Verilen bir sayının pozitif olup olmadığını kontrol edin
        //      pozitif ise ekrana "sayı xx pozitiftir diye yazdırın
        // Task 32: verilen bir sayı 0 dan püyükse poztiftir yazdırın
        //      sıfırdan küçükse nehatiftir yazdırın, sıfırsa bişey yapmayın

        // Task 01:
        Scanner scan = new Scanner(System.in);
            System.out.println("Kişinin yaşını giriniz :");
            int yas = scan.nextInt();

            if (yas >= 40) {
                System.out.println(" " +yas +" kemal yaştır");
            }if(yas <
                40){
            System.out.println(" " +yas+ " kemal yas degildir.");


    //  task 02:

        System.out.println("Bir sayı giriniz :");
        int sayi= scan.nextInt();

        if(sayi>0){
            System.out.println("Sayı  "+sayi+ " pozitiftir.");



   // task 03:
        System.out.println("Bir sayı giriniz :");
            int sayi1 =scan.nextInt();
            if(sayi1>0){
                System.out.println("Sayı  pozitiftir.");
            }if(sayi1<0){
        System.out.println("Sayı negatiftir");
        }


    }
    }

}

}



