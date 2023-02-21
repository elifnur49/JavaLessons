package J07_StringManipulation.Tasks1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı prnt eden code create ediniz
       */
        Scanner input = new Scanner (System.in);
        String isim,soyisim;
        System.out.println("isim ve soyisiminizi giriniz:");
        isim=input.next();
        soyisim=input.next();

        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
        System.out.println("isim+soyisim = " + isim + " "+ soyisim);

    }
}
