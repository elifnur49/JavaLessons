package J02_WrapperClassAndMathClass;

import java.util.Scanner;

public class WapperClass {
    public static void main(String[] args) {
  //     int a;  Integer aa;
  //     byte b; Byte bb;
  //     char c; Character cc;
  //     long l;  Long ll;
  //     short s; Short ss;
  //     boolean bol; Boolean boll;
  //     float f;  Float ff;
  //     double d;  Double dd;

  //  Scanner scan = new Scanner(System.in);
  //   // int sayi =scan.nextInt();
  //   // int macInt= Integer.MAX_VALUE;
  //   // int macInt1 = Integer.MIN_VALUE;
  //   // System.out.println("macInt = " + macInt);
  //   // System.out.println("macInt1 = " + macInt1);

  //     int macInt2= Integer.MIN_VALUE;
  //     long maxlong =Long.MAX_VALUE;
  //     double maxDouble = Double.MAX_VALUE;
  //     System.out.println("maxlong = " + maxlong);
  //     System.out.println("maxDouble = " + maxDouble);
  //     System.out.printf("1%350.5f",maxDouble);

        int a; Integer aa;
        byte b; Byte bb;
        char c; Character cc;
        long l; Long ll;
        short s; Short ss;
        boolean bol; Boolean bbb;
        float f; Float ff;
        double d; Double dd;
  /*
        1)Java'da iki turlu "memory" var
            i)Stack Memory:
                a)Kucuk memory'dir
                b)Primitve ve Non-Primitive'lerin adreslerini(Reference) icerir
           ii)Heap Memory:
                a)Buyuk Memory'dir
                b)Non-Primitive'leri icerir
        2)Java Heap Memory'ye yerlestirilen her non-primitve data icin bir address(Reference) olusturur ve bu adresi(Reference)
         Stack Memory'ye koyar. Herhangi bir sebeple address(Reference) silinirse Java adresi(Reference) olmayan Heap deki
         non-primitive data yi otomatik siler.  Memory'nin temizligini saglayan "Garbage Collector" vardir.
     */

        Scanner scanner = new Scanner(System.in); int sayi = scanner.nextInt();
        int macInt = Integer.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("maxLong = " + maxLong);
        System.out.println("maxDouble = " + maxDouble);
        System.out.printf("%335.5f",maxDouble);







    }
}
