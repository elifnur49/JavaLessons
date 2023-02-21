package J08_Loops.Loop01_ForLoop.Tasks;

public class Task11 {
    public static void main(String[] args) {

        /*
        A          //1.satır 1 harf
        A B         //2.satır 2 harf
        A B C        //3.satır3 harf
        A B C D       //4.satır 4 harf
        A B C D E     //5.satır 5 harf
        A B C D E F    //6.satır 6 harf
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */
        System.out.println("   1.yol   ");
        int i, j;
        for(i=65; i<=70; i++)
        {
            for(j=65; j<=i; j++)
                System.out.format(" %c ", j);
            System.out.println( );
        }

        System.out.println("   2.yol   ");
        int harf=65;
        for (int kat = 0; kat < 7; kat++) {
          for(int daire=0 ;daire<=kat ;daire++){
              System.out.print((char)(harf+ daire)+" ");
          }
            System.out.println();
        }



        }

    }

