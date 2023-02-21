package J04_JavaOperators;

public class Operatorler {
    public static void main(String[] args) {

      //Atama operatorleri
        int sayi  = 15;// sayi <== 15

        sayi +=5;   //  sayi = sayi + 5;
        System.out.println("sayi = " + sayi);// 20

        sayi -=5;
         System.out.println("sayi = " + sayi);// 15

        sayi *=5;
        System.out.println("sayi = " + sayi);// 75

        sayi /=15;
        System.out.println("sayi = " + sayi);// 5

        sayi++;
        sayi++;
        ++sayi;
        System.out.println("sayi = " +  ++sayi);
        System.out.println("sayi = " + sayi);

       // sayi = sayi/2;
       // System.out.println("sayi = " + sayi);

        double dd= sayi / 2.0;
        System.out.println("dd = " + dd);
        double Dd= dd/ 2.0;
         System.out.println("Dd = " + Dd);

         //Task 1= ıkı varaible'ı yer degıstırmeyı uygulayarak kavrayın
        // Task 2= derste yapılanları yapıp uygulayın
        // Task3= iki integer degişkeni yardımcı degişken kullanmadan yer degiştiriniz.
    }
}

/*
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("a :" + a + " b :" + b);

        a = a + b; // a = 30  b = 20
        b = a - b; // b = 10  a = 30
        a = a - b; // a = 20  b = 10

        System.out.println("Degiskenler degistirildi...\n"+ "a :" + a + " b :" + b);
    }
*/



