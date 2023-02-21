package J08_Loops.Loop01_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
     /*
     Loop-> tekrarlayan actionları tanımlayan code bloklarıdır.
      */
     //task-> 41 kere masallah prınt eden code create edınız.

     // bas.value        bitiş value      value degişimi
       for(int i=1;           i<=41;             i++){// cincix code
      // i=1 den basla     i=41 e kadar         1 'er artarak devam  et ->true
    System.out.println( i+ ". masallah");

      // Task02-> 2 basamaklı tek sayıları aynı satıra prınt eden code creatre edınız
           System.out.println("   ***    ");

           for(int a=11;a<=99;a+=2){

               System.out.print(a+" ");
       }
           for (int j = 0; j < 10; j++) {//condition daima false verir-> baba akuyu calmıslar :) calısmayan loop yapmıslar.
               System.out.println("selam javaCAN'lar");
           }

           System.out.println("bizim olan code cincix dewamkeee :)");
        }
       // for (int i = 0; i >= 0; i++) {// sonsuz donguye gırer
          //  System.out.println("bu loop cugaarayı cupıterde yakana kadar calısır:) durdurana ask olsun");
        }

}

