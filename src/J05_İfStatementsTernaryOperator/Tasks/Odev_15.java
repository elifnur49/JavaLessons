package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ehliyetiniz var ise E yoksa H giriniz : ");

        char ehlyt = sc.next().charAt(0);

        if (ehlyt == 'E' || ehlyt == 'e') {

            System.out.print("kac yıllık tecrübeniz var :");
            int yil = sc.nextInt();

            if (yil >= 7) {
                System.out.print("yaptıgınız km mesafeyi girniz : ");
                int km = sc.nextInt();
                if (km >= 100000) {
                    System.out.println(" kontak anahtarını almaya hak kazandınız :)");
                } else
                    System.out.println("kontak anahatarını almanız için önce " + (100000 - km) + " yola ihtiyacınız var");

            } else
                System.out.println("kontak anahatarı almanız için önce " + (7 - yil) + " yıla daha ihtiyacınız var");

        } else if (ehlyt == 'H' || ehlyt == 'h') {
            System.out.println("öncelikle ehliyet almalısınız.");
        } else
            System.out.println("Yanlış karakter girdiniz.Tekrar deneyiniz");

    }
}

 /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz


         */
