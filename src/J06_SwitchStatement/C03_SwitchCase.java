package J06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

        // Task-> Girilen ay numarasına göre kac gun cektıgını prınt eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir ay numarası giriniz ");
        int ayNum= scan.nextInt();
        switch (ayNum){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ay 31 gündür");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ay 30 gündür");
                break;
            case 2:
                System.out.println("girilen ay 28 gündür");
                System.out.println("artık yıllarda 29 gündür");

                break;
            default: // switch'te hic bir case  calısmazsa devreye girer.switch blokta yeri önemli degildir.
                System.out.println("Sayınız gecersiz.1-12 arası bir sayı giriniz.");
        }
    }
    }
/*
System.out.print("yılınızı giriniz : ");
        int yil = sc.nextInt();
        if (yil % 4 == 0) {
            System.out.println(" subat ayı 29 gün içerir ");
        } else System.out.println(" subat ayı 28 gün içerir");
        break;
 */

/*
 if (year % 4 == 0 && year % 100!= 0 || year%400 == 0) {
                    System.out.println("29 gun");
                } else { System.out.println("28 gun");}

System.out.println(yil % 4 == 0 ? " girilen ay 29 gun" : "girilen ay 28 gundur");// ternary metodu
        */