package J07_StringManipulation.Tasks1;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("bir kelime giriniz : ");
        String str = sc.next();

        System.out.println(" karakterin index'ini giriniz : ");
        int index=sc.nextInt();

        if (str.length()>index){
            System.out.println(str.charAt(index));
        }else System.out.println("hatalı giris yaptınız");

    }


    }

