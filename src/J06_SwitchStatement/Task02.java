package J06_SwitchStatement;

import java.util.Scanner;

public class Task02 {

        public static void main(String[] args) {

            // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
            //  hafta başlangıcı:pazartesi alınız
            Scanner scan = new Scanner(System.in);
            System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                    "6\nPazar: 7\nHaftanın kaçıncı gününde olduğununuzu giriniz :");
            int kacıncıGun = scan.nextInt();
            if(kacıncıGun < 1 || kacıncıGun > 7){
                System.out.println("hatalı veri girdiniz");
            }else {
                System.out.println("kac gun sonrasını öğrenmek istiyorsunuz  :");
                int kacGunSonrasi=scan.nextInt();
                int bulunanGun=(kacGunSonrasi+kacıncıGun) % 7;

                switch(bulunanGun){

            case 1:
            System.out.println("pazartesi");
            break;
            case 2:
            System.out.println("salı");
            break;
            case 3:
            System.out.println("carsamba");
            break;
            case 4:
            System.out.println("persembe");
            break;
            case 5:
            System.out.println("cuma");
            break;
            case 6:
            System.out.println("cumartesi");
            break;
            case 7:
            System.out.println("pazar");
            break;
            default:
            System.out.println("Hatalı giriş yaptınız");
        }
}
            
        }
    }