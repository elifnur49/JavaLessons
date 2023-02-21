package J04_JavaOperators;

public class LogicalOperators {
    public static void main(String[] args) {

 /*
 -------- && - and - (ve)---------

      True   &&    True    -->  True
      True   &&    False   -->  False
      False  &&    True    -->  False
      False  &&    False   -->  False


     -------- ||- or - (veya)---------

      True   ||    True    -->  True
      True   ||    False   -->  True
      False  ||    True    -->  True
      False  ||    False   -->  False
 */

        //&& de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calısmaz.
        // Ancak & tum satırı kontrol eder ondan sonra durur.
        //sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri sonuna kadar gider.&& tekliye gore daha hizli calisir

        //and->ve

        int x= 5, y=10,z=15;
        System.out.println((x==5) && (z==15)); //  1 and 1 = 1
        System.out.println((x==5) || (z==15)); //  1 or 1 = 1
        System.out.println((x==5) && !(y==15)); //  1 and 1 = 1
        System.out.println(!(x==5) || (y==15)); //  0 or  0 = 0
        System.out.println(!true);
        System.out.println(((x==5) && (z==10)) && ((x==5) || (y==15)) );
        System.out.println(((x==5) && (z==10)) || ((x==5) || (y==15)) );
        System.out.println(((x==5) && (z==10)) || ((x==15) || (y==15)) );



    }
    }

