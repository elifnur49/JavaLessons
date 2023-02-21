package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Ehliyet_sorusu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ehliyetiniz var ise E yoksa H giriniz : ");
        char ehlyt = input.nextLine().charAt(0);
        if (ehlyt == 'E' || ehlyt == 'e') { //ehliyet var olma sartı
            System.out.print("kac yıllık tecrübeniz var :");
            int yil = input.nextInt();
            if (yil >= 7) { // tecrübe yıl 7 ve ustu sartı
                System.out.print("kac km tecrübeniz var :");
                int km = input.nextInt();
                if (km >= 100000) {
                    System.out.println(" kontak anahtarını almaya hak kazandınız :)");
                } else
                    System.out.println("kontak anahatarını almanız için önce " + (100000 - km) + " yola ihtiyacınız var");

            } else System.out.println("agam kontak alman icin " + (7 - yil) + " yıl eksiğin var");
        } else if (ehlyt == 'E' || ehlyt == 'e') { // ehliyet olmama sartı
            System.out.println("Alamazsın anagdarı mı MAYK:( alırım anahtarını");
        } else System.out.println("Agam gelmıyım oraya dogru harf gir");
    }
}
