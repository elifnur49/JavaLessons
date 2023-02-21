package J06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
       // Task->

        Scanner sc=new Scanner(System.in);
        System.out.println("haftanın bir gununu giriniz");
        String gun=sc.next();
        switch(gun){
            case"pazartesi":
            case"salı":
            case"carsamba":
            case"persembe":
            case"cuma":
                System.out.println("girilen gunler haftaaıcı");
                break;
            case"cumartesı":
            case"pazar":
                System.out.println("girilen gunler haftasonu");
                break;
            default:
                System.out.println("Hata yaptınız");
    }
}
}