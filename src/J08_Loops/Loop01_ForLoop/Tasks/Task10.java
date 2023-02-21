package J08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner input = new Scanner(System.in);
        System.out.println("agam bir ifade giresen : ");
        String str = input.nextLine();//javacan

        System.out.print("agam hangi harfi saydıracaksın :");
        char harf=input.next().charAt(0);//a

        int harfSayisi=0;

        for (int i = 0; i <=str.length()-1 ; i++) {
            if (str.charAt(i)==harf) {
                harfSayisi++;
            }
        }

        System.out.println("agam giridigin  ifade : "+str+" de istediğin harf :"+harf+harfSayisi+" kadar var");


    }

    }

