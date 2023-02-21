package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_07 {
    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz :");
        char harf = scan.next().charAt(0);

        if (harf >= 'a' && harf <= 'z') {
            if (harf == 'a') {
                System.out.println("ilk küçük harf");
            } else
                System.out.println("İlk küçük harf değil");
        }
        if (harf >= 'A' && harf <= 'Z') {
            if (harf == 'Z') {
                System.out.println("Son büyük harf");
            } else
                System.out.println("Son büyük harf değil");
        }
    }
}
