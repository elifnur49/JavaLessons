package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Emeklilik_Sorusu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("cinsiyetinizi giriniz: ");
        String cns = sc.next();
        if (cns.equals("Kadın")) {
            System.out.print("Yaşınızı  giriniz: ");
            int yas = sc.nextInt();
            if (yas > 60) {
                System.out.println("Prim gününü giriniz:");
                int prim = sc.nextInt();
                if (prim > 6000) {
                    System.out.println(" Emekli olmaya hak kazandınız .Hayırlı olsun! ");
                } else System.out.println("emeliliğiniz için: " + (6000 - prim) + " gun  yatırmanız lazım");

            } else System.out.println("Emeklilige " + (60 - yas) + " yıl daha var");

        } else if (cns.equals("Erkek")) {
            System.out.print("Yaşınızı  giriniz: ");
            int yas = sc.nextInt();
            if (yas > 65) {
            } else System.out.println("Emeklilige " + (65 - yas) + " yıl daha var");
            System.out.println("Prim gününü giriniz:");
            int prim = sc.nextInt();
            if (prim > 7000) {
                System.out.println(" Emekli olmaya hak kazandınız .Hayırlı olsun! ");
            } else System.out.println("emeliliğiniz için: " + (7000 - prim) + " gun  yatırmanız lazım");
        } else
            System.out.println("Agam AYTA' nın sana selamı var:(");
    }
    }

