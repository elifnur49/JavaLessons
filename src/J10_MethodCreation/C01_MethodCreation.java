package J10_MethodCreation;

public class C01_MethodCreation {// class başı

    /*
  code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
  main method'a call edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tercih edilir
  1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
  parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

  str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                        bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                        bana rapor olarak ne getirdigini bilmem lazim (true/false)

  2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

  3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
     de oldugu gibi
     disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
     deklare edilmeli

     method call edildiğinde  Parametre olarak
     declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/
    public static void main(String[] args) {// main başı

        topla();//parametresiz method call edildi
        System.out.println(topla1(23, 58));// 40
        System.out.println(topla1(12, 34));// 23
        System.out.println(topla1(50, 38));// 44
        System.out.println(topla1(27, 63));// 45
        System.out.println(topla1(47, 53));// 50

        topla2(45,1.5,"javacan");

      /*
      bir method main blok dısına create edilir main blok'a call edilmezse method run olmaz.
      besst practice-> methodlar maın bloktan sonra create edılır
       */
        System.out.println(topla3());

    }// main sonu

    private static void topla2(int sayi, double boy, String name) {//int,double,string type 3 p'li void method
        System.out.println(sayi+boy);//46.5
        System.out.println("agam hoc gelmışsın:"+ name);//agam hoc gelmışsın:javacan


    }

    private static int topla1(int ebik, int gabık) {// iki int type p'li int return method


        return( ebik+gabık)/2;//ey method sana verilecek 2 int degeri topla ve 2'ye bolerek return et

    }


    public static void topla() {
        int a = 23;
        int b = 58;
        System.out.println(a + b);
        System.out.println("topla methodundan selamlar");
    }

    public static String topla3() {
     int a=23;
     int b=31;



        return "toplamınız : " +(a+b);
    }


}//class sonu
