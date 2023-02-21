package J08_Loops.Loop01_ForLoop.Tasks;

public class Task32 {
    public static void main(String[] args) {
        /*

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        şeklinde print eden code create ediniz

         */
        int i, j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<i*2 ; j++)
            {
                if(j%2 ==  0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(i=4; i>=1; i--)
        {
            for(j=1; j<i*2; j++)
            {
                if(j%2 ==  0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    }

