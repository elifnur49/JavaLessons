package J08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String str=sc.nextLine();

        String tersStr="";// bos bir string kutu"
        for (int i = str.length()-1; i >=0 ;i--){
            tersStr+=str.charAt(i);
        }
        System.out.println("girilen ifadenini tersi:"+tersStr);
        if(str.equalsIgnoreCase(tersStr)){
            System.out.println("girilen ifade polindrome");
        }else System.out.println("girilen ifade polindrome degil");
    }

    }



