package J07_StringManipulation.Tasks1;

import java.util.Scanner;

public class _11_String_methods {
    public static void main(String[] args) {

        /*  apple olan bir String oluşturun.
            String'in içinde app olup olmadığını doğrula.   */

    //Kodu aşağıya yazınız.
        Scanner sc = new Scanner(System.in);
        System.out.print(" bir cümle  giriniz : ");

        String kelime = sc.nextLine().toLowerCase();

        if (kelime.indexOf("apple") == -1) {
            System.out.println("Girilen cumle apple icermiyor");
        }else
            System.out.println("Girilen cumle app iceriyor");



}
}

