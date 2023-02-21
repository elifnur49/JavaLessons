package J08_Loops.Loop01_ForLoop.Tasks;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */


        {
            int i, j;
            for(i=1; i<=7; i++)
            {
                for(j=1; j<=7; j++)
                {
                    if( i == j )
                        System.out.print(" 1 ");
                    else
                        System.out.print(" 0 ");
                }
                System.out.println();
            }

    }
        System.out.println("   ***   ");
        int i, j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=5; j++)
            {
                if( i == j )
                    System.out.print(" 1 ");
                else
                    System.out.print(" 0 ");
            }
            System.out.println();
        }


        }

}