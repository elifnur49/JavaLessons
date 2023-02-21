package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_12 {
    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */
        Scanner sc = new Scanner(System.in);

        System.out.print("bir karakter  giriniz : ");
        char krktr = sc.nextLine().charAt(0);

        if ((krktr >='A'&& krktr <= 'Z')||(krktr >='a'&& krktr <= 'z')){
            System.out.println("girdiginiz karakter harfdir :)");
        }else System.out.println("girdiğiniz  karakter harf değildir :(");


}

}