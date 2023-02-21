package J08_Loops.Loop02_whileLoop.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");
        int sayi = scan.nextInt();

        int toplam = 0;

        for(int i = 1; i <=sayi; i++){
            if(i%2!=0){
                toplam += i;
                System.out.print (i +" ");
            }
        }
        System.out.println("Tek Sayıların Toplamı = "+ toplam);


        System.out.println("   2.yol   ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");
        int sayi1 = sc.nextInt();

        int toplam1 = 0;

        for(int i = 1; i <=sayi1; i++){
            if(i%2!=0){
                toplam1 += i;
                System.out.print (i +" ");
            }
        }
        System.out.println("Tek Sayıların Toplamı = "+ toplam1);
    }
}
