package J02_WrapperClassAndMathClass;

import java.util.Random;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

//      Math.Class Tasks ( Aşağıdaki soruları Math class kullanarak yapınız.
 // 1 :
         Scanner scan =new Scanner(System.in);

         double dd=12.4;
         double sayiKaresi=dd*dd;
        System.out.println("sayiKaresi = " + sayiKaresi);

// 2 :

        double dd1 = Math.sqrt(25);
        System.out.println("sayi = " + dd1);

// 3 :
        int num = Math.max(4,12);
        System.out.println("num = " + num);

// 4 :
       int num2= Math.abs(6);
        System.out.println("num2 = " + num2);
// 5 :
        int iNum = Math.min(13,34);
        System.out.println("iNum = " + iNum);

// 6 :
        Random rnd=new Random();
        int num3 = rnd.nextInt();
        System.out.println("num3 = " + num3);

//7 :
        int say = rnd.nextInt(20);
         System.out.println("say = " + say);
//8 :
         int num4 = (int) (Math.random()*100+6);
         System.out.println("num4 = " + num4);

//ask 9 :

        double kAlanı=25;
        kAlanı = Math.sqrt(25);
        System.out.println("kCevresi = " + kAlanı*4);


//10 :


//


// 11 :
        Random rastgele = new Random();

        int sayi = -10 + rastgele.nextInt(10);

        System.out.println("Rastgele atanan sayi = " + sayi);

//rintf Tasks
//ask 12 : Pi = 22/7 dir (3.14???? ) ekrana _3.14 şeklinde yazdırın


//ask 13 : gun, ay, yil int olarak veriliyor ??/??/???? olacak şekilde çıktı alın
//      ör tarih:12,1,2023 olarak ekrandan aldık verileri 12/ 1/2023 şeklinde çıktı alacağız



// 14 :
        String str1="ocak ayının 13.gününde ki ödevleri tamamladım";
        String str2="Haziran ayının 1.gününde ki ödevleri tamamladım.";
        System.out.printf("%s\n",str1);
        System.out.printf("%s\n",str2);



//ask 15 : double dd = 35.2556 sayısını ekranın soluna dayalı olarak ve
//         noktadan sonrası max 2 basamak olacak çekilde yazdırın.




// 16 :
        int x = 345;

        int birler = x%10;
        int onlar = (x/10) %10;
        int yuzler =(x/100) %10 ;

        int rakamTop=birler+onlar+yuzler;
        System.out.println("rakamTop = " + rakamTop);

    // 17-
         System.out.println(""+ yuzler +""+onlar  +""+ birler);
    }
 }
