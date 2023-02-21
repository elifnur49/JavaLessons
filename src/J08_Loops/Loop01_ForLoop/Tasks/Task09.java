package J08_Loops.Loop01_ForLoop.Tasks;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *
*/

            for (int satir = 1; satir <=4 ; satir++) {
                for (int sutun = 1; sutun <=satir ; sutun++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }

    }
}
