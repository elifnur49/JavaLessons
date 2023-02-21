package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin  ilk kenar uzunlugunu giriniz :");
        int a=scan.nextInt();

        System.out.println("Lütfen üçgenin ikinci kenar uzunluğunu yazın");
        int b=scan.nextInt();

        System.out.println("Lütfen üçgenin ucuncu kenar uzunluğunu yazın");
        int c=scan.nextInt();


        if (a==b && b==c)
            System.out.println("üçgen eşkenar üçgendir");
        else if (a==b || a==c || b==c)
            System.out.println("üçgen ikizkenar üçgendir");
        else
            System.out.println("üçgen çeşitkenar üçgendir");

    }

    }

/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.

		 */
