package J07_StringManipulation.Tasks1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */
        Scanner input = new Scanner (System.in);
        String isim,soyisim,meslek;
        System.out.println("isim ve soyisim ve mesleginizi giriniz:");
        isim=input.next();
        soyisim=input.next();
        meslek=input.next();

        System.out.println("İsmin başharfi:"+isim.charAt(0));
        System.out.println("Soyismin başharfi:"+soyisim.charAt(0));
        System.out.println("Meslegin başharfi:"+meslek.charAt(0));
    }
}


