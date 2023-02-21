package J04_JavaOperators;

public class ComparisonOperators {
    public static void main(String[] args) {
/*
Comparator : karsılastırma ıslemlerı
Java da ıkı varaıble ın degerı karsılastırıldıgında java sonuc olarak boolean return eder

     == esit            x==y
     != esit degil      x!=y
     > buyuk            x>y
     <  kucuk           x<y
     >=buyuk esit       x>=y
     <= kucuk esit      x<=y
     ! unlem isareti olunsuzluk anlamında kullanılır.

 */

      //  int sayi=16;
      //  boolean sonuc = (sayi/2*2 == sayi);
      //  System.out.println("sonuc = " + sonuc);
//
      //  sonuc = sayi % 2 == 0;
      //  System.out.println("sonuc = " + sonuc);
//
      //  int x =5;
      //  int y =10;
      // sonuc = x == y;
      // sonuc = x != y;
      //  System.out.println("x != y " + sonuc);
      //  System.out.println("x== y " + sonuc);

        // System.out.println("Sonuc = (5<5) "+ (5<5));
        int sayi=16;
        boolean sonuc = (sayi/2*2==sayi);
        //System.out.println("sonuc = " + sonuc);

        sonuc = sayi%2==0;
        // System.out.println("sonuc = " + sonuc);
        int x=5; int y=10;
        sonuc =  x == y;  System.out.println(" x == y " + sonuc);
        sonuc =  x != y;  System.out.println(" x != y " + sonuc);
    }

    }

