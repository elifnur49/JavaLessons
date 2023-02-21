package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Deneme2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int intrndm = scan.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int intrdnm1 = scan.nextInt();

        System.out.print("dort islemden birini sembol olarak giriniz ornk /, *, +, -");
        String islem = scan.next();
        if (islem.equals("/")){
            System.out.println("sonuc bolme = "+(intrndm/intrdnm1));
        } else if (islem.equals("*")) {
            System.out.println("sonuc carpma = "+(intrndm*intrdnm1));
        } else if (islem.equals("-")) {
            System.out.println("sonuc cikarma = "+(intrndm-intrdnm1));
        } else if (islem.equals("+")) {
            System.out.println("sonuc toplama = "+(intrndm+intrdnm1));
        }

    }
}
