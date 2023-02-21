package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Tas_Kagıt_Makas_OGRNCI {
    public static void main(String[] args) {
       /*
       Tas Kagıt Makas oyunun simüle eden code create edınız.
        */

        Scanner scan=new Scanner(System.in);

        System.out.println("oyuncu1 oynuyor:");
        String oyuncu1= scan.nextLine();

        System.out.println("oyuncu2 oynuyor.");
        String oyuncu2= scan.nextLine();

        String tas="1";
        String kagıt="2";
        String makas="3";

       if(oyuncu1.equals("1") && oyuncu2.equals("1")){
           System.out.println("Kazanan yok.");
       }else if(oyuncu1.equals("1")&&oyuncu2.equals("2")){
           System.out.println("oyuncu2 kazandı");
       }else if(oyuncu1.equals("1")&& oyuncu2.equals("3")){
           System.out.println(" oyuncu1 kazandı");
       }else if(oyuncu1.equals("2")&&oyuncu2.equals("1")){
           System.out.println("oyuncu1 kazandı");
       }else if(oyuncu1.equals("2")&& oyuncu2.equals("2")){
           System.out.println(" kazanan yok");
       }else if(oyuncu1.equals("2")&&oyuncu2.equals("3")){
           System.out.println("oyuncu2 kazandı");
       }else if(oyuncu1.equals("3")&& oyuncu2.equals("1")){
           System.out.println(" oyuncu2 kazandı");
       }else if(oyuncu1.equals("3")&& oyuncu2.equals("2")){
        System.out.println(" oyuncu1 kazandı");
        }else if(oyuncu1.equals("3")&& oyuncu2.equals("3")){
        System.out.println(" kazanan yok");
       }else
           System.out.println("berabere bitti");
    }
}