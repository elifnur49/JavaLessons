package J06_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
       //Task-> Girilen ay numarasına gore ayın ısmını prın eden code yazınız
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ay sayınını giriniz :");
        int ayNo=scan.nextInt();

        switch(ayNo){

            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nısan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmz");
                break;
            case 8:
                System.out.println("agustoz");
                break;
            case 9:
                System.out.println("eylul");
                break;
             case 10:
                System.out.println("ekim");
                break;
             case 11:
                System.out.println("kasım ");
                break;
             case 12:
                System.out.println("aralık");
                break;

                default:
                System.out.println("hatalı sayı girdiniz");
        }
    }
}
