package J06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
       //Task->girilen ay numarasına göre hangı mevsımde oldugunu print eden code cretare ediniz

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir ay numarasına giriniz  : ");
        int ayNumara = sc.nextInt();
        // String  ay=sc.nextLine();
        switch (ayNumara) {
            case 12:

            case 1:

            case 2:
                System.out.println("Mevsim KIŞ");
                break;
            case 3:

            case 4:

            case 5:
                System.out.println("Mevsim İLKBAHAR");
                break;
            case 6:

            case 7:

           case 8:
                System.out.println("Mevsim YAZ");
                break;
            case 9:

            case 10:

            case 11:
                System.out.println("Mevsim SONBAHAR");
                break;
            default:
                System.out.println("Bir yıl 12 aydır.hatalı rakam girdiniz.");
        }

    }
}
