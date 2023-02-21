package J02_WrapperClassAndMathClass;

public class MathClass {
    public static void main(String[] args) {

  /*
      :  Girilen degerin mutlak degerini verir.
    Math.max(a, b)  :  Girilen iki degerden buyuk olani verir.
    Math.min(a, b)  :  Girilen iki degerden kucuk olani verir.
    Math.round(a)   :  Girilen degerin en yakin tamsayiya yuvarlar.
    Math.sqrt(a)    :  Girilen degerin karekokunu verir.
    Math.pow(a, b)  :  Girilen a ve b degerini a uzeri b olarak verir.
    Math.ceil(a) 3.1 => 4 : Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.
    Math.floor(a) 3.7 => 3 :  Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.

*/
            double pi=3.14;
            double dd = Math.floor(pi);
            System.out.println("sayi = " + dd);
            dd = Math.sqrt(20);
            System.out.println("sayi = " + dd);
            int num = Math.max(5,8);
            System.out.println("num = " + num);
            double dNum = Math.min(dd,4.5);
            System.out.println("dNum = " + dNum);
            int num2 = (int) Math.pow(5,3);
            System.out.println("num2 = " + num2);
            long lNum = (long) Math.pow(10,3);
            System.out.println("lNum = " + lNum);
            double dNum3 = Math.round(3.49);
            System.out.println("dNum3 = " + dNum3);
            double dNum4 = Math.floor(3.90);
            System.out.println("dNum4 = " + dNum4);
            double dNum5 = Math.ceil(3.49);
            System.out.println("dNum5 = " + dNum5);
            double dNum6 = Math.PI;
            System.out.println("Pi Sayısı = " + dNum6);

        }
    }



