package J07_StringManipulation;

public class C02_Length {
    public static void main(String[] args) {
/*
length() methodu girilrn string'in uzunluğunu:içinde buluna karakter sayısını return eder
butun karakterleri(boşluk vs) sayıp adedini verir
 */
     String str ="Maden geldin dünyaya otur çalış JAVA'ya :) ";
        System.out.println(str.length());// 43
    int karaktrSayiasi=str.length();
        System.out.println("karaktrSayiasi = " + karaktrSayiasi);//43

     String str1 = " ";
        System.out.println("str1 = " + str1.length());// 1
        String str2 = "";
        System.out.println("str2 = " + str2.length());// 0
        String str3 = null;// cte vermez
        System.out.println(str3.concat(str1));// RTE
        System.out.println("str3 = " + str3.length());// rte ( run tıme exception)

      /*
      TRİCK-> null atanan Stringler herhangi bir method call etmez calısmaz
      null-> case sensettive Null NULL !=null
      null-> bır deger degil(dutluk )  sadece  hiçliği gösteren bir pointer(işaretci )
       */

        String name;// declare edilmiş ama atanmamıs bir string  type variable
        //name.concat(str1);// atanmamış (initilaze edilmemis ) string method.CTE verir
    }
}
