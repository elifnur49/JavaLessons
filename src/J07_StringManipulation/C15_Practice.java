package J07_StringManipulation;

import java.util.Scanner;

public class C15_Practice {
    public static void main(String[] args) {
        /*
        Task->girilen bir pasword icin asagıdakı sartları saglarsa "gayet basarılı Dewamkee:)"
         saglamazsa "Cok basarısız:( agam yeni password giresen" prınt eden code create ediniz.
         1)en az 8 karakter uzunlugunda olmalı
         2)Ilk  harf  buyuk olmalı
		 3)Son harf kucuk  olamlı
		 4) bosluk ıcermemeli

        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen password giriniz : ");
        String password = sc.nextLine();

        if (
                (password.charAt(0)>='A'&& password.charAt(0)<='Z') &&
                        (password.charAt(password.length()-1)>='a'&&
                                password.charAt(password.length()-1)<='z')&&
                        (password.length()>=8)&&
                        !password.contains(" ")){
            System.out.println("gayet basarılı DEWAMKEEE");
        }else System.out.println("password geçersiz");


     //  2.yol
        Scanner input = new Scanner(System.in);
        System.out.print("Agam password giresen : ");
        String password1 = input.nextLine();

        if (password1.length() >= 8 &&//password 8 karakterden buyuk ve eşit olma şartı
                !password1.contains(" ") && //password " " içermeme şartı
                Character.isUpperCase(password1.charAt(0)) &&//password ilk harf buyuk olma şartı
                Character.isLowerCase(password1.charAt(password1.length() - 1)) //password son harf kucuk olma şartı
        ) {
            System.out.println("gayet başarılı DEWAMKEEE :)");
        } else System.out.println("Çok başarısız :( agam yeni password giresen");

    }




}
