package J08_Loops.Loop02_whileLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task-> girilen 7 sayının en buyugunu print eden code create ediniz
        Scanner klavye=new Scanner(System.in);
        System.out.println("arka arkaya 7 adet sayi yazin");
        int max=0;
        int min=0;

        for (int i=1; i<=7; i++)
        {
            System.out.println(i+". sayiyi giriniz: ");
            int sayi = klavye.nextInt();
            if (i==1)
            {
                max=sayi;
                min=sayi;
            }
            if (sayi>max)
                max=sayi;

            if (sayi<min)
                min=sayi;
        }

        System.out.println("girdiginiz sayılar icinden en buyuk olani: "+max);
        System.out.println("girdiginiz sayılar icinden en buyuk olani: "+min);

    }

}



