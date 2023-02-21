package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_03 {
    public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */

        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz : ");
        int yil = oku.nextInt();
        if (yil <=0) {
            System.out.println("Yanlıs girdiniz.Lütfen tekrar deneyiniz :");
        } else {
            if (yil % 1000 == 0) {
                System.out.println("milenyum");
            } else if (yil % 100 == 0) {
                System.out.println("yüzyıl");
            } else if (yil % 10 == 0) {
                System.out.println("onyıl");
            }
}
        System.out.println(" code gayet BAŞARILI :) ");
    }
}