package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_09 {
    public static void main(String[] args) {
        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen bir tamsayi giriniz : ");
        int Sayi= scan.nextInt();

       if (Sayi>0){
            System.out.println("sayi Pozitif");
        }else if(Sayi<0){
            System.out.println("Sayi Negatif");

    }else System.out.println("sıfır girdiniz");
}
    }