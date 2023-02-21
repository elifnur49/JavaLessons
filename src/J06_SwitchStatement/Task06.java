package J06_SwitchStatement;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf=scan.next().charAt(0);
        switch(harf){
            case 'v':
            case 'V':
                System.out.println("Very");
                break;
            case 'ı':
            case 'I':
                System.out.println("Important");
                break;
            case 'p':
            case 'P':
                System.out.println("Person");
                break;

            default:
                System.out.println("hatalı harf girdiniz");

        }

        }

}
