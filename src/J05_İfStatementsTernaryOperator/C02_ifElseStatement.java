package J05_İfStatementsTernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        /*
        Task- girilen yasın 18 den buyuklugunu kontrol edın
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Agam yasını giresen : ");
        int agaYas=scan.nextInt();

        if(18<agaYas){
            System.out.println("agam artık resitsin cugara sana cohh yakısır.");
        }

        /*
        Task- girilen yasın 18 den buyuklugunu kontrol edın
yas 182den kucukse "agam buyu de gel prınt eden code create ediniz.
         */


        System.out.println("Agam yasını giresen : ");
        int yas=scan.nextInt();

        if(18<yas){
            System.out.println("agam artık resitsin cugara sana cohh yakısır.");
        }

        if(yas<18){
            System.out.println("agam büyü de gel :(");
        }

     // ikinci yontem

        if(18<=yas){
         System.out.println("agam resitsen");
     }else System.out.println("agam büyü de gel");


    }
}
