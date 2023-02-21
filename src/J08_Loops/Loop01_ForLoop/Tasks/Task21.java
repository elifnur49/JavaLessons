package J08_Loops.Loop01_ForLoop.Tasks;

public class Task21 {
    public static void main(String[] args) {
        /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */
        int i, j,k;
        for(i=0; i<=8; i++)
        {
            for(j=0; j<i*2-1 ; j++)
            {
                if(j%2 ==  0)
                    System.out.print("*");
                else
                    System.out.print("! ");
            }
            System.out.println();
}
}
    }




