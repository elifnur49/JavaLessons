package J08_Loops.Loop02_whileLoop.Tasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "javaTAR" print eden code create ediniz.
        do-while lopp
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir metin giriniz : ");
        String str ="";
        do {
            System.out.println("javaCAN");
            str=input.nextLine();

        }while (!str.equalsIgnoreCase("x"));
        System.out.println("javaTAR");






    }


}
