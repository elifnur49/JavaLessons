package J08_Loops.Loop02_whileLoop.Tasks;

public class Task04 {
    public static void main(String[] args) {

		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
        int i = 999;
        int sayac = 0;
        while (i > 99) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                sayac++;
            }
            i--;
        }
        System.out.println("\n"+sayac + " tane sayı hem 4 ve hem 6 ya tam bolunebilen sayıdır.");
    }
    }

