package Odevler;

import java.util.Scanner;

public class AydınBey_cozum {
    public static void main(String[] args) {


        System.out.println("Lütfen hesaplamak istediğiniz şekli giriniz:\n üçgen\nkare\ndikdörtgen");
        Scanner input=new Scanner(System.in);
        String sekil=input.nextLine();
        switch(sekil){
            case("üçgen"):
                ucgenHesap();
                break;
            case("dikdörtgen"):
                dikdortgenhesap();
                break;
            case("kare"):
                kareHesap();
                break;
            default:
                System.out.println("Lütfen geçerli bir değer giriniz!");
        }
    }

    private static void kareHesap() {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen kenarını giriniz: ");
        int sayi1= input.nextInt();
        System.out.println("Lütfen alan hesabı için 1 çevre hesabı için 2ye basınız");
        int alanCevre= input.nextInt();

        if (alanCevre==1) {
            System.out.println("seçilen şeklin alanı= " + sayi1 * sayi1);
        } else if (alanCevre==2) {
            System.out.println("Seçilen şeklin çevresi= "+ (sayi1*4));
        }else System.out.println("Lütfen geçerli bir değer giriniz.");

    }

    private static void dikdortgenhesap() {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen kenarını giriniz: ");
        int sayi1= input.nextInt();
        System.out.print("Lütfen diğer kenarını giriniz: ");
        int sayi2= input.nextInt();
        System.out.println("Lütfen alan hesabı için 1 çevre hesabı için 2ye basınız");
        int alanCevre= input.nextInt();
        if (alanCevre==1) {
            System.out.println("seçilen şeklin alanı= " + sayi1 * sayi2);
        } else if (alanCevre==2) {
            System.out.println("Seçilen şeklin çevresi= "+ (sayi1*4));
        }else System.out.println("Lütfen geçerli bir değer giriniz.");
    }

    private static void ucgenHesap() {

        System.out.println("Lütfen alan hesabı için 1 çevre hesabı için 2ye basınız");
        Scanner input=new Scanner(System.in);
        int alanCevre= input.nextInt();
        if (alanCevre==1) {
            System.out.print("Lütfen tabanını giriniz: ");
            int sayi1= input.nextInt();
            System.out.print("Lütfen yüksekliğini giriniz: ");
            int sayi2= input.nextInt();
            System.out.println("seçilen şeklin alanı= " + ((sayi1 * sayi2)/2));
        } else if (alanCevre==2) {
            System.out.print("Lütfen 1. kenarı giriniz: ");
            int sayi3= input.nextInt();
            System.out.print("Lütfen 2. kenarı giriniz: ");
            int sayi4= input.nextInt();
            System.out.print("Lütfen 3. kenarı giriniz: ");
            int sayi5= input.nextInt();
            System.out.println("Seçilen şeklin çevresi= "+ (sayi3+sayi4+sayi5));
        }else System.out.println("Lütfen geçerli bir değer giriniz.");
    }
    }

