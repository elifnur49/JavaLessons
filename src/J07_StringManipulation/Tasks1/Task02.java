package J07_StringManipulation.Tasks1;

import java.util.Scanner;

public class
Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen password giriniz : ");
        String password = sc.nextLine();

        if (
                (password.charAt(0)>='A'&& password.charAt(0)<='Z') &&
                        (password.charAt(password.length()-1)>='0'&&password.charAt(password.length()-1)<='9')&&
                        (password.length()>=6)
        ) {
            System.out.println("password geçerli");
        }else System.out.println("password geçersiz");
    }
    }

