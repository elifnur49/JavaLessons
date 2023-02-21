package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Odev17_ikinciCozum {
    public static void main(String[] args) {
        Random rnd=new Random();
        int pc =rnd.nextInt(3)+1; //bilgisayarın 1-3 aralıgında değer tutmasını sağladık.
        System.out.println("pc"+pc);
        System.out.println("1.taş");
        System.out.println("2.kağıt");
        System.out.println("3.makas");
        System.out.println("Lütfen seçiminizi yapınız");
        Scanner input=new Scanner(System.in);
       int kisi=input.nextInt();
        if(kisi!=1 && kisi!=2 && kisi!=3)
        {
            System.out.println("yanlış bir seçim yapılmıştır.");
        }
        else
        {
            if(pc==kisi)
            {
                System.out.println("berabere");
            }
            if(pc==1 &&kisi==2)
            {
                System.out.println("kişi kazandı");
            }
            if(pc==1 && kisi==3)
            {
                System.out.println("pc kazandı");
            }
            if(pc==2 && kisi==1)
            {
                System.out.println("pc kazandı");
            }
            if(pc==2 && kisi==3) {

                System.out.println("kişi kazandı");
            }
            if(pc==3 && kisi==1)
            {
                System.out.println("kişi kazandı");
            }
            if(pc==3 && kisi==2)
            {
                System.out.println("pc kazandı");
            }
        }

    }
}

// pc:1 k:1 berabere
// pc:1 k:2 kisi kazandı
// pc:1 k:3 pc kazandı
// pc:2 k:1 pc kazandı
// pc:2 k:2 berabere
// pc:2 k:3 kişi kazandı
// pc:3 k:1 kisi kazandı
// pc:3 k:2 pc kazandı
// pc:3 k:3 berabere
//istenilen değer aralığında giriş yapılmıştır. Değeri bilgisayar ile karşılaştırmak gerekecektir.
