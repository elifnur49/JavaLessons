package J07_StringManipulation.Tasks1;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= haluk
         Print ==> Jahalukva
         */
        Scanner sc =new Scanner(System.in);

        System.out.print("Birinci kelimeyi giriniz : ");
        String  kelime1 = sc.nextLine();

        System.out.print("ikinci kelimeyi giriniz : ");
        String  kelime2 = sc.nextLine();

        if (kelime1.length()%2==0){
            System.out.println(kelime1.substring(0, kelime1.length() / 2) + kelime2 + kelime1.substring(kelime1.length() / 2));
        }else{
            System.out.println("kelime2 kelime1 eklenemez");
        }





    }
}
