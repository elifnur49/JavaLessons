package J08_Loops.Loop01_ForLoop.Tasks;

public class Task19 {

    public static void main(String[] args) {

        /* task -> İlk 10 doğal sayının toplamını print eden code create ediniz.
         */
        System.out.println("   ***  1.yol  ***  ");
        int toplam = 0;

        for (int i = 1; i < 10; ++i) {
            toplam += i;
        }
        System.out.println("1-10 arasındaki sayıların toplamı = " + toplam);


        System.out.println(" 2.yol   ");
        int sayi1 = 9, toplam1 = 0, i = 1;

        while (i <= sayi1) {
            toplam1 += i;
            i++;
        }

        System.out.println("Toplam = " + toplam1);
    }


}




