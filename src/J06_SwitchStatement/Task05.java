package J06_SwitchStatement;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
		/*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz

		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Notunuzu giriniz : ");
        int not = scan.nextInt();

        if(not >=0 && not<50){
            System.out.println("girilen  harf not D");
        }else  if (not>=50 && not<60 ) {
            System.out.println("girilen harf not C");
        }  else if (not >=60 && not<80) {
            System.out.println("girilen  harf not B");
        } else if (not>=80 && not <=100) {
            System.out.println("girilen harf not A");
        } else System.out.println("Gecerli not giriniz");



      }
    }



