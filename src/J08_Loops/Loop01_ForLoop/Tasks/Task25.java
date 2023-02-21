package J08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task25 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden  create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine();
        String output = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            if (!output.contains(str.substring(i, i + 1))) {

                output += str.charAt(i);
            }
        }
        System.out.println("cıktı = " + output);
    }
}


