package J08_Loops.Loop02_whileLoop.Tasks;

import java.util.Scanner;

public class Quiz_soru {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int biSayi=sc.nextInt();
        int toplam=0;

        while (biSayi>=0){
            toplam += biSayi;
            biSayi--;
        }
        System.out.println("toplam = " + toplam);

    }
}
