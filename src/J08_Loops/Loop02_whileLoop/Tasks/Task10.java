package J08_Loops.Loop02_whileLoop.Tasks;

import java.util.Scanner;

public class
Task10 {

    public static void main(String[] args) {
            // task-> girilen şifrenin asagidaki sartlari kontrol edin
            // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
            // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
            // - ilk harf kucuk harf olmali
            // - son karakter rakam olmali
            // - sifre bosluk icermemeli
            // - uzunlugu en az 10 karakter olmali

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen password giriniz : ");
        String password = sc.nextLine();

        if (
                (password.charAt(0)>='a'&& password.charAt(0)<='z') &&
                        (password.charAt(password.length()-1)>='0'&&
                                password.charAt(password.length()-1)<='9')&&
                        (password.length()>=10)&&
                        !password.contains(" ")){
            System.out.println("sifre basariyla kaydedildi");
        }else System.out.println("password geçersiz.");


        }
    }




