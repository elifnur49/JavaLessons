package J08_Loops.Loop01_ForLoop.Tasks;

public class Task20 {

//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.

        public static void main(String[] args)
        {
            int i, j, k, a;
            for(i=1; i<=5; i++)
            {
                k = 4;
                a = i;
                for(j=i; j<i+i; j++)
                {
                    if(i == j)
                        System.out.print(j +" ");
                    else
                    {
                        a = a + k;
                        System.out.print(a +" ");
                        k--;
                    }
                }
                System.out.println();
            }


      // 2.yol anlatımlı

            //        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.
    /*
    j Sütunu yazdirdiktan sonra 5-j artir  5-j
    2. Sütunu yazdirdiktan sonra 3 artir
    3. Sütunu yazdirdiktan sonra 2 artir
    4. Sütunu yazdirdiktan sonra 1 artir.

    1. Satirin 1. Sütununa 1 yazdir.
    1. Satirin 2. sütununa bir sey yazdirma
    Alt satira gec
    2. Satirin 1. Sütununa 2 yazdir
    2. Satirin 2. Sütununa 6 yazdir
    2. Satirin 3. Sütununa bir sey yazdirma
    Alt satira gec
    3. Satirin 1. Sütununa 3 yazdir
    3. Satirin 2. Sütununa 7 yazdir
    3. Satirin 3. Sütununa 10 yazdir.
     */
        //    public static void main(String[] args) {
        //    for (int i = 1; i <= 5; i++) {
        //        int Number = i;
        //        for (int j = 1; j <= i; j++) {
        //            System.out.print(Number + " ");
        //            Number += 5 - j;
        //        }
        //        System.out.println();
            }

        }


