package J05_İfStatementsTernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {
   // // Alinin yası veriliyor.eger Ali 18 veya daha buyukse yetıskındır diye yazdırın
        //  Scanner oku= new Scanner(System.in);
   //     System.out.println("Alinin yası : ");
   //     int alininYasi=oku.nextInt();
   //     if(alininYasi>=18){
   //         System.out.println("Ali "+alininYasi +" yasında bir yetişkindir.");
   //     }
   //     System.out.println("Code finished.");

      // if statement blok belli durum ve aksiyonları belirli sarta baglı
        // olarak calıstırmak için kullanılır

      int abdiYas = 33;// int data type( veri tipi)' da abdiYas adında degeri 33 olan variable create edıldı.
      int mstfYas = 41;
      if(abdiYas==mstfYas){ // abdiYas ile mstfYas esitligi kontrol edıldı.
          System.out.println("yaştaş arkadaslar :)");
          System.out.println("yoksam siz kardes mısınız?");
      }
      if(40<=mstfYas){ //mstfYas 40 a eşit veya 40 tan büyük mü kontrolu yapıldı
          System.out.println("mıstaa bey 40 yas dırt yas :)");
      }
      //bagımısz if blokları sadece kendı scope(kapsam)da run eder.//
        // Birden fazla if blok hepsinin body calısabılecegı gibi
        // sart saglanmazsa hıcbırı de calısmayabılır

      if(100<abdiYas+mstfYas) System.out.println("Bir asırlık yaş");

      //if blokta {} kullanılmazsa (bad practice) ilk ;e kadar komut if ile calısır sonrası if yen  bagımsız run olur
        System.out.println("agam dewamkee code sorunsuz run oldu :)");
    }

}
