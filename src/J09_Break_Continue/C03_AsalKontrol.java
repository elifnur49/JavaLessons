package J09_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {

        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
//asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
         int sayi= scan.nextInt();//haluk un elındekı sayı
      boolean asalMi=true;// furkanın elindekı bayrak

        for (int i = 2; i<sayi ; i++) {// suzanın girilen sayı tekrarı
          if( sayi % i == 0 ){// döngüdeki her bir tekrara girilen sayıyı tam bolme sartı
            asalMi=false;// bolen sayı bulundugu ıcın asallık false oldu
              break;
          }
        }
          if(asalMi){
                System.out.println("Girilen sayı asaldır");
            }else System.out.println("Girilen sayı asal degıldır.");
        }
    }

