package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_01 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yaşınızı giriniz :");
        int yas=scan.nextInt();
        if (yas >= 0 && yas <= 4) {
            System.out.println("bebek");
        } else if  (yas >= 5 && yas <=12) {
            System.out.println("cocuk");
        } else if
        (yas >= 13 && yas <=20){
            System.out.println("genç");
        }else if(yas >= 21 && yas <=30){
            System.out.println("yetişkin evre");

        }else
        System.out.println("tanımlanmamış evre");
    }
}
 /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */