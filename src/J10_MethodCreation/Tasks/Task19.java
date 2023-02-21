package J10_MethodCreation.Tasks;

public class Task19 {

    public static void main(String[] args) {
        /*
   task->
   INTERVIEW SORUSU !!!
   1'den 100'e kadar hic rakam  kullanmadan sayilari print eden METHOD create ediniz

    */
      //static void SayilariYazdir(int sayi)
      //{
      //    if(sayi > 0)
      //    {
      //        SayilariYazdir(sayi - 1);
      //        System.out.print(sayi + " ");
      //    }
      //}

      //public static void main(String[] args)
      //{
      //    SayilariYazdir(100);
      //}

        sayilariYazdir(1);
    }

    public static void sayilariYazdir (int sayi)
    {
        if(sayi <= 100)
        {
            System.out.print(sayi + " ");
            sayilariYazdir(++sayi);
        }
    }
}
