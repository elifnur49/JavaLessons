package J08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/
        Scanner sc= new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int sayi=sc.nextInt();

     if (sayi>=100){
       System.out.println("Girilen sayı 100'den küçük olmalı.");
}
     for (int i = 1; i <= sayi; i++) {
            if (i % 15 == 0) {
                System.out.println(i+"JavaCAN");
            } else if (i % 5 == 0) {
                System.out.println(i+"CAN'dır");
            } else if (i % 3 == 0) {
                System.out.println(i+"Java");
            }
            else System.out.println("girdiginiz sayı hic bir sarta uymuyor.");
        }

    }

    }
