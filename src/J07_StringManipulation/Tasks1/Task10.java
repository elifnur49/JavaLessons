package J07_StringManipulation.Tasks1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz :");
        String isim = scan.next();

        //if ile
        System.out.println("   ***   if statement   ***   ");
        String s1=isim.substring(0,1);
        String s2=isim.substring(1,2);
        String s3=isim.substring(2,3);
        if (isim.length() == 3) {
            if (!s1.equals(s2)  && !s1.equals(s3) && !s2.equals(s3)) {
                System.out.println("Girdiginiz isim 3 harfli ve unique karakterle sahip");
            }else System.out.println("Girdiginiz isim 3 harfli ancak unique karakterle sahip degil");

        }else System.out.println("Girdiginiz isim 3 harfli değil");
        //Ternary ile


        System.out.println("   ***   ternary   ***   ");
        char c1 = isim.charAt(0);
        char c2 = isim.charAt(1);
        char c3 = isim.charAt(2);

        String result = isim.length() == 3 ? ((c1 != c2 && c1 != c3 && c2 != c3) ? "Girdiginiz isim 3 harfli ve unique karakterle sahip"
                : "Girdiginiz isim 3 harfli ancak unique karakterle sahip degil "):"Girdiginiz isim 3 harfli değil";

        System.out.println(result);


      String ad= scan.nextLine();

        String  sonuç=  isim.length()==3? (isim.charAt(0)!=isim.charAt(1)&&
                isim.charAt(0)!=isim.charAt(2)&&
                isim.charAt(1)!=isim.charAt(2)?"isim benzersiz harflerden oluşuyor":"isim benzersiz harflerden oluşmuyor")
                : "isim 3 harf değil" ;
        System.out.println("sonuç = " + sonuç);
    }
    }

