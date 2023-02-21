package J08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        //Task-> girilen ıkı sayı arasındakı cıft sayıları prınt eden code create ediniz.

      //  Scanner input=new Scanner(System.in);
      //  System.out.print("bizim gızzz birinç sayı gir bakennn : ");
      //  int sayi1=input.nextInt();
      //  System.out.print("bizim gızzz ikinç sayı gir bakennn : ");
      //  int sayi2=input.nextInt();

        Scanner sc=new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz: ");
        int sayi1=sc.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        int sayi2=sc.nextInt();

        for (int i =(sayi1<sayi2 ? sayi1 : sayi2); i <=(sayi1>sayi2 ? sayi1 : sayi2) ; i++) {
            System.out.print(i%2==0 ? i+" " : "");
        }
        System.out.println();
        System.out.println("Kod calısıyor.");
    }
}



