package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_04 {
    public static void main(String[] args) {
		/*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz :");
        char krtr = scan.nextLine().charAt(0);
        if (krtr >= 'A' && krtr <= 'Z') {
            System.out.println("Büyük Harf");
        } else if (krtr >= 'a' && krtr <= 'z') {
            System.out.println("Küçük Harf");
        } else
            System.out.println("Harf Degil");
    }
		/*
		 Logical Operator (Mantik Islemleri)
		 1) And Islemi : Sembolu & veya && dir.&& sembolu daha hizli calisir.Bu yuzden genellikle && kullaniriz
		 						true && true = true
		 						true && false = false
		 						false && true = false
		 						false && false = false
		 2)Or Islemi : Sembolu || dir
		 						true || false = true
		 						true || true = true
		 						false || true = true
		 						false || false = false
		 3)Not Islemi : Sembolu !'dir
		 						!true = false
		 						!false = true
 */
    //  boolean b1=true;
    //  int a=3;
    //  int c=7;
//
    //  System.out.println(b1&(a<c));
    //  System.out.println(b1&&(a>c));
    //  System.out.println(b1&(a==c));
//
    //  //or->veya
    //  System.out.println(b1||(a<c)); //true
    //  System.out.println(b1||(a>c)); //true
//
    //  System.out.println(b1||(a==c));//true
//
    //  //not->!
//
    //  System.out.println(!(b1||(a>c)));// false
//

}

