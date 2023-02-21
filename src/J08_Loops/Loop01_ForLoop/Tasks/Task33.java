package J08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task33 {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)



        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

        int bolenToplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                bolenToplam += i;
            }
        }
        if (bolenToplam == sayi) {
            System.out.println(sayi + " sayisi Mukemmel Sayi");
        } else System.out.println(sayi + " sayisi Mukemmel sayi degil.. tekrar deneyiniz");


        System.out.println("   *** 2.yol ***   ");

        Scanner Input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int Sayi = Input.nextInt();
        int x = 0;
        for (int i = 1; i <= Sayi / 2; i++) {
            if (Sayi % i == 0) {
                x += i;
            }
        }
        if (x == Sayi)
            System.out.println("Mükemmel Sayi");
        else
            System.out.println("Mükemmel Sayi degil");
    }


}



