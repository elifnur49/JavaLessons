package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Odev_17_Tas_Kagıt {
    public static void main(String[] args) {
        /*
        Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
         */
        Scanner s = new Scanner(System.in);
        int kisiPuan =0;
        int pcPuan=0;
        System.out.println("Taş kağıt makas oyununa hoş geldiniz!");
        System.out.println("1-Taş 2-Kağıt 3-Makas");
        while(true) {
            System.out.println("Seçiminiz: ");
            int secim = s.nextInt();
            int bil_secim = (int)(Math.random()*3);
            if (secim == 1) {
                if (bil_secim == 1) {
                    System.out.println("Bilgisayarın seçimi: TaşnSonuç: Berabere");
                    System.out.println("Puanınız: "+kisiPuan+" Bilgisayarın puanı:"+pcPuan);
                } else if (bil_secim == 2) {
                    System.out.println("Bilgisayarın seçimi: KağıtnSonuç: Kaybettiniz");
                    pcPuan++;
                    System.out.println("Puanınız: "+kisiPuan+" Bilgisayarın puanı:"+pcPuan);
                } else {
                    System.out.println("Bilgisayarın seçimi: MakasnSonuç: Kazandınız");
                    kisiPuan++;
                    System.out.println("Puanınız: " + kisiPuan + " Bilgisayarın puanı:" + pcPuan);
                }
            } else if (secim == 2) {
                if (bil_secim == 1) {
                    System.out.println("Bilgisayarın seçimi: TaşnSonuç: Kazandınız");
                    kisiPuan++;
                    System.out.println("Puanınız: "+kisiPuan+" Bilgisayarın puanı:"+pcPuan);
                } else if (bil_secim == 2) {
                    System.out.println("Bilgisayarın seçimi: KağıtnSonuç: Berabere");
                    System.out.println("Puanınız: "+kisiPuan+" Bilgisayarın puanı:"+pcPuan);
                } else {
                    System.out.println("Bilgisayarın seçimi: MakasnSonuç: Kaybettiniz");
                   pcPuan++;
                    System.out.println("Puanınız: " + kisiPuan+ " Bilgisayarın puanı:" + pcPuan); }
            } else if (secim == 3) {
                if (bil_secim == 1) {
                    System.out.println("Bilgisayarın seçimi: TaşnSonuç: Kaybettiniz");
                  pcPuan++;
                    System.out.println("Puanınız: "+kisiPuan+" Bilgisayarın puanı:"+pcPuan);
                } else if (bil_secim == 2) {
                    System.out.println("Bilgisayarın seçimi: KağıtnSonuç: Kazandınız");
                    kisiPuan++;
                    System.out.println("Puanınız: "+kisiPuan+" Bilgisayarın puanı:"+pcPuan);
                } else {
                    System.out.println("Bilgisayarın seçimi: MakasnSonuç: Berabere");
                    System.out.println("Puanınız: " + kisiPuan + " Bilgisayarın puanı:" +pcPuan);
                }
            } else{
                System.out.println("Hatalı giriş yaptınız tekrar deneyin");
                continue;}
            if(kisiPuan==3){
                System.out.println("Oyunu "+kisiPuan+"-"+pcPuan+" kazandınız");
                break; }
            else if(pcPuan==3){
                System.out.println("Oyunu "+pcPuan+"-"+kisiPuan+" kaybettiniz");
                break; }
        }
    }
}


