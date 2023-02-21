package J08_Loops.Loop02_whileLoop.Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
          Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz :");
        String str=scan.nextLine().toLowerCase();// girilen str degeri kucuk harfe atandı
       int harfSay=0;
        int rakamSay=0;
        int karakterSay=0;
        int strIndex=0;

       do{
        if(str.length()==0){// "" bos karakterlı str giriş sartı
            System.out.println("Agam adam gibi metin gir dedik:");
        }else if (str.charAt(strIndex)>='a' && str.charAt(strIndex)<='z'){//str index ındekı karakterın harf olma sartı
           harfSay++;
        }else if  (str.charAt(strIndex)>='0' && str.charAt(strIndex)<='9'){//str index ındekı karakterın rakam olma sartı
            rakamSay++;
        }else
            karakterSay++;//str ındex ındekı karakterın ozel karakter olma sartı

        strIndex++;// her loop tekrsrında str nın bır sonrakı ındexı verir
        }while(strIndex<str.length());// loop strIndex str nın boyutunun kucuk oldugu surece body action sartı
        System.out.println("Agam gırdıgın metınde " + harfSay+" tane harf var");
        System.out.println("Agam gırdıgın metınde " + rakamSay+" tane rakam var");
        System.out.println("Agam gırdıgın metınde " + karakterSay+" tane özel karakter var");
    }

}

