package J08_Loops.Loop02_whileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya
         tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int sayi,sayi1 ,sayac,puan = 0;
        System.out.print("1- 100 arasındaki sayıyı tahmin ediniz: ");
        sayi=input.nextInt();
        sayi1=rnd.nextInt(100);
        sayac=0;
     while(sayi!=sayi1){
         if(sayi>sayi1){
             System.out.println("Girdiginiz sayı daha kucuk");
         }else{
             System.out.println("girdiginiz sayi daha büyük");
         }
         sayi=input.nextInt();

         sayac=sayac+1;
     }
        System.out.println("Tebrikler bildiniz ="+ sayi1);
        System.out.println("Deneme sayısı=" + sayac);
        if(sayac>1){
            puan=100-sayac*2;
        }
        System.out.println("puanınız=" + puan );
    }
}
