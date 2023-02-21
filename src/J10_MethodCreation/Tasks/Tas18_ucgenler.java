package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Tas18_ucgenler {
    public static void main(String[] args) {


    System.out.println("Üçgen Mi ? Programı Açılmıştır !");
		System.out.println("1.Kenar Uzunluğunu Girin");
    Scanner kenar1 = new Scanner(System.in);
    double k1 = kenar1.nextDouble();

		System.out.println("2.Kenar Uzunluğunu Girin");
    Double k2 = kenar1.nextDouble();

		System.out.println("3.Kenar Uzunluğunu Girin");
    double k3 = kenar1.nextDouble();

   double Cevre;
   Cevre = k1+k2+k3;

   if (k1<k2+k3 && k2<k1+k3 && k3<k1+k2 ){
       System.out.println("Bir Üçgen Oluşturuyor");
       System.out.println("Bu Üçgenin Çevresi : "+Cevre);

       alan(k1,k2,k3,Cevre);
       kenarbak(k1,k2,k3);
       dikmi(k1,k2,k3);
   }
		else
          System.out.println("Girilen Kenar Uzunluklarıyla Bir Üçgen Oluşturulamaz");

    }
     public static void alan(double k1,double k2,double k3,double Cevre){
       double alan;
       double SonHesap;
       double u;

      u = Cevre/2;
       SonHesap = (u*(u-k1)*(u-k2)*(u-k3));
       alan = Math.sqrt(SonHesap); //Hazır metod kullanılmıştır . Kök Almaya Yarar .
       System.out.println("Verilen Üçgenin Alanı : "+alan);

   }


    public static void kenarbak(double k1,double k2,double k3){
        if (k1==k2 && k2==k3)
            System.out.println("Bu Üçgen Eşkenar Üçgendir");
        else if (k1==k2 || k1==k3 || k2==k3)
            System.out.println("Bu Üçgen İkizkenar Üçgendir");
        else
            System.out.println("Bu Üçgen Çeşitkenar Üçgendir");
    }

    public static void dikmi(double a,double b,double c){
        if (a*a ==b*b+c*c || b*b==a*a+c*c || c*c ==a*a+b*b)
            System.out.println("Aynı Zamanda Dik Üçgendir");
    }

}
