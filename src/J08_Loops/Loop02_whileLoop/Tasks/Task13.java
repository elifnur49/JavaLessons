package J08_Loops.Loop02_whileLoop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
         /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

      Scanner scan = new Scanner(System.in);
      int toplam = 0;

      System.out.print("Bir sayi giriniz: ");
      int sayi = scan.nextInt();

      for(int i = 1; i <=sayi; i++)
      {
          toplam += i;
          System.out.println(  i);
      }
      System.out.println(sayi + " sayisina kadar olan sayiların toplamı = " + toplam);


        System.out.println("   ***2.yol ***   ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int num=sc.nextInt();
        int sum=0;

        while (num>0){
            sum += num;
            num--;
        }
        System.out.println("toplam = " + sum);

    }
}


