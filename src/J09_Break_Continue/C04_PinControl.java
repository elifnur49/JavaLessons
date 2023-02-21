package J09_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
// Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir mail hesabı giriniz:");
        String dgruPin = "javaCAN";

        int girisHakki = 3;
        while (true) {
            System.out.println("AGAm pin'ini giresen :");
            String agaPin = scan.nextLine();
            if (agaPin.equals(dgruPin)) {
                System.out.println("agam bugun ballısın gayet başarılı :) ");
                break;
            } else {
                System.out.println("agam bugun nasipsizsin bi daha dene");
                girisHakki--;
                System.out.println("agam kalan canın : " + girisHakki);
                if (girisHakki == 0) {
                    System.out.println("agam canın kalmadı bidahkine bekleme yapma dewamkeee :(");
                    break;
                }
            }
        }

        System.out.println("   ** 2.yol *   ");
        Scanner input = new Scanner(System.in);

        int grsHkk=3;
        String  dgrPin="javaCAN";
        while (true){

            System.out.print("gakgom hele bi pin cizikdiresen ha :");
            if (dgrPin.equals(input.nextLine())) {
                System.out.println("Gakgom böyün ballı günüğndesin haa :)");
                break;
            } else {
                System.out.println("gakgom hele bi daha pin cizikdiresen ha :");;
                grsHkk--;
                System.out.println("Gakgom kalan hakkın : "+grsHkk);
                if (grsHkk == 0) {
                    System.out.println("Gakgom hiç canın kalmadı bekleme yapma DEWAMKEEE ");
                    break;
                }
            }
        }
    }

    }
