package J06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCaseATM {
    public static void main(String[] args) {
        //TaskATM-> Bakiye 1000 $ olan bir banka hesabı için
        // bakiye öğrenme ,para cekme,para yatırma ve çıkış işlemlerinin yapıldıgı
        // bir ATM app. code creatae ediniz
        Scanner sc = new Scanner(System.in);
        System.out.print("Atm ' ye Hosgeldiniz!\nBakiye:\nPara Çekme:\nPara yatırma:\nÇıkış ");
        int secim = sc.nextInt();
        int bakiye=1000;
        switch(secim){
        case 1:
            System.out.println("\"Güncel bakiyeniz\" = " + "bakiye");
            break;
        case 2:
                System.out.println("Cekmek istediginiz miktari giriniz :");
                int cekilenMiktar=sc.nextInt();
                bakiye -=cekilenMiktar;
                if(cekilenMiktar<=bakiye){
                    System.out.println("yeni bakiyeniz" + bakiye);
                }else System.out.println("Bakiyeniz yetersiz.");
                break;
        case 3:
            System.out.println("Yatırmak istediginiz miktarı giriniz :");
            int yatırılanMiktar=sc.nextInt();
            bakiye+=yatırılanMiktar;
            System.out.println("yeni bakiyeniz" + bakiye);
            break;
        case 4:
            System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.Yine bekleriz!");
            break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }
}
    }