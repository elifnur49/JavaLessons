package J08_Loops.Loop01_ForLoop.Tasks;

public class Task13 {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..
        */
        int i, j;
        for(i=65; i<=70; i++)
        {
            for(j=65; j<=i; j++)
                System.out.format(" %c ", i);
            System.out.println();
        }


        int harf=65;
        for (int kat = 0; kat < 6; kat++) {
            for(int daire=0 ;daire<=kat ;daire++){
                System.out.print((char)(harf+kat)+" ");
            }
            System.out.println();//dumyy
        }


    }
}
