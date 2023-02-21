package J07_StringManipulation.Tasks1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
      //  String str = "JavaCAN'lara selam olsun güzel ınsanlar :)";
       // System.out.println("str = " + str);
       // System.out.println("str.length() = " + str.length());//32
        //
       // System.out.println("str.trim() = " + str.trim());
       // System.out.println("str.trim().length() = " + str.trim().length());//24

        Scanner input = new Scanner(System.in);
        System.out.print("bir metin   giriniz : ");
        String metin = input.nextLine();// javacanlara selam olsun güzel insanlar :)

        System.out.println("metin.length() = " + metin.length());
        System.out.println(metin.replaceAll("\\s", "").length());


    }

    }

