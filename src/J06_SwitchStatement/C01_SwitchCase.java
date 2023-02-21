package J06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
      /*
    Switch-Case yapısı  if statement'e benzer action alır.
    Çok sayida if statement bloklari code okunabilirliği ve clean code olarak tavsiye edilmez. Bir app actionda sabit bir degeri
    çoklu durum ile karsilastirmak için switch-case blok kullanılır. Switch-case blok'da  degiskene göre bir
    çok durumdan değişkene uyan durum gerçeklesir.
    if statement blok ile  switch-case blok birlikte tanımlanabiir.
    çoklu koşul içeren durumlarda switch-case blok if statement'e göre app. hızı açısından daha avantajlıdır.(Best Practice)
     Switch-Case ile if statement arasında önemli bir performans farklılığı yoktur.

      ahan da CISSS TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ..
      Switch de sadece int, byte, short, char, String data type  kullanilabilir
      Eger 3 den fazla durum varsa switch() tercih edilir.
 */

      // anahtar(varaible) kilit(case) gibi dusunmek lazım.
        System.out.println("   *** if cözümü   ***   ");

        Scanner scan=new Scanner(System.in);
        System.out.println("hele bir sayı gir :");
        int sayi=scan.nextInt();


        if(sayi==0){
            System.out.println("sıfır");
        }else if(sayi==1){
            System.out.println("bir");
         }else if(sayi==2){
            System.out.println("iki");
         }else if(sayi==3){
            System.out.println("üç");
         }else if(sayi==4){
            System.out.println("dort");
         }else if(sayi==5){
            System.out.println("bes");
         }else if(sayi==6){
            System.out.println("altı");
         }else if(sayi==7){
            System.out.println("yedı");
         }else if(sayi==8){
            System.out.println("sekız");
         }else if(sayi==9){
            System.out.println("dokuz");
        }else System.out.println("Dadas ne ediysen :(");


        System.out.println("   *** switch   ***     ");


        switch(sayi){
            case 0:
                System.out.println("sıfıt");
                break;// code blok bu komuttan sonra kırılır :bloktan sonraki satır run edılır.
           case 1:
                System.out.println("Bir");
                break;
           case 2:
                System.out.println("iki");
                break;
           case 3:
                System.out.println("üç");
                break;
           case 4:
                System.out.println("dort");
                break;
           case 5:
                System.out.println("bes");
                break;
           case 6:
                System.out.println("altı");
                break;
           case 7:
                System.out.println("yedi");
                break;
           case 8:
                System.out.println("sekiz");
                break;
           case 9:
              System.out.println("dokuz");
              break;
           default://switch hicbir case için calısmazsa devreye girer
                System.out.println("canini yiyim ne edirsen");
        }
        }

    }