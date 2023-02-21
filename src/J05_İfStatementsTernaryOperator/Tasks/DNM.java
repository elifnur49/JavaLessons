package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class DNM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Karakteri giriniz : ");
        char ch = scan.next().charAt(0);

        if (ch >= 97 && ch <= 122) {
            if (ch == 97) {
                System.out.println("Ilk kucuk harf");
            } else {
                System.out.println("Ilk kucuk harf degil");
            }
        }

        if (ch >= 65 && ch <= 90) {
            if (ch == 90) {
                System.out.println("Son buyuk harf");
            } else {
                System.out.println("Son buyuk harf degil");
            }


        }

    }
}
