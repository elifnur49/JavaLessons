package J01_Variables;

import java.util.Locale;

public class Printf_Formats {
    public static void main(String[] args) {

        // int ali=10,veli=2215,toplam;
//        toplam = ali+veli;
//        System.out.printf("Alin Yaşı (%2d) Velinin Yaşı (%4d) toplamı =%4d",ali,veli,toplam);
//        double sayi1,sayi2;
//        sayi1 = 3.144673324;
//        sayi2 = 4567.564;
//        System.out.printf("%5.2f %n%5.2f",sayi1,sayi2);
//        String str="Hello World";
//        String format="%15s";
//        System.out.printf(format,str);
//        System.out.printf("Hello %s!%n", "World");
//        System.out.printf("%c%n", 65);
//        System.out.printf(Locale.US, "%,d %n", 10000);
//        System.out.printf("%10.4s", "Hi there!");
//        %n, \n, \t, %b, %B, -20%s %10.4s  ",d" , Locale.
        System.out.println("123456789012345678901234567890");
        int num=100;
        int num1=35;
        System.out.printf("Num =(%5d), Num1=%5d%n",num,num1); // sayıları sağa dayalı yazar
        System.out.printf("Num =%-5d, Num1=%-5d%n",num,num1); // sayıları sola dayalı yazar
        double dNum1 = 5.412736;
        double dNum2 = 54217.632;
        System.out.printf("dNum1=%10.2f, dNum2=%10.3f%n",dNum1,dNum2);
        System.out.printf("dNum1=%10f, dNum2=%-10.3f%n",dNum1,dNum2);
        String str1="Merhaba Clarusway Fun";
        System.out.printf("%s\n",str1);
        System.out.printf("%S\n",str1);
        System.out.printf("%25s%-15s%n",str1,"hi guys");
        String frmt = "%25s%-15s%n";
        System.out.printf(frmt,str1,"hi guys");
        System.out.printf("%c%n", 65);
        System.out.printf(Locale.US, "%,d %n", 1000000);
        System.out.printf(Locale.ITALY, "%,d %n", 1000000);
        System.out.printf("%10.4s%n", "Hi there!");
        System.out.printf("%B%n",(3==5));
        System.out.printf("Pi=%5.2f",Math.PI);

    }

    }


