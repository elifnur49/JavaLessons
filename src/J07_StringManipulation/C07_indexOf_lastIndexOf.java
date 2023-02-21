package J07_StringManipulation;

import java.util.Scanner;

public class C07_indexOf_lastIndexOf {
    public static void main(String[] args) {
       /* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/
        String str = "Maden geldin dünyaya otur çalış JAVA'ya : )";
        System.out.println(str.indexOf(':'));//40
        System.out.println(str.indexOf(":)"));//40
        System.out.println(str.indexOf("x"));//-1 x olmadıgı için -1 verir.
        System.out.println(str.indexOf("ya"));//16

        //Trick-> olmayan karakter için index -1 return eder.
        //Trick-> birden cok karakter veya strıng için -> ilk okunan degerın index ini verir.

        System.out.println("str.indexOf(\"a\",13) = " + str.indexOf("a", 13));// 17  a karakterinin 13. inddexten sonrak ılk index ini  veriri

/** lastIndexOf()
 *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 *  indexOf un sondan olan hali fakat index numaraları değişmez.
 *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
 *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
 */
        System.out.println(str.indexOf("ya"));//16
        System.out.println(str.lastIndexOf("ya"));//37
        System.out.println(str.lastIndexOf("x"));//-1
        System.out.println(str.lastIndexOf(":"));//40
/* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamsını kontrol eden code create ediniz
a-) girilen ifade java içermiyor
b-) girilen ifade 1 adet java içeriyor
c-) girilen ifade  1'den çok java içeriyor
 */


        Scanner sc = new Scanner(System.in);
        System.out.print(" bir cümle  giriniz : ");

        String cumle = sc.nextLine().toLowerCase();

        if (cumle.indexOf("java") == -1) { // java yoksa index -1 -< javanın yoklugu kontrolu
            System.out.println("Girilen cumle java icermiyor");
        }else if (cumle.indexOf("java") == cumle.lastIndexOf("java")){ //
            System.out.println("Girilen cumle 1 tane java iceriyor");
        }else System.out.println("Girilen cumlede birden fazla java vardır.");



    }
}
