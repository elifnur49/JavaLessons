package J07_StringManipulation.Tasks1;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz :");
        String str=scan.nextLine();
        if (str.length()%2==0) {// cift karakterli olma sartı
            System.out.println("strnin ilkkısmi:" +str.substring(0,str.length()/2));
        } else {
            System.out.println("girilen metnin ilk yarısı bulunamaz:( ");
        }

    }
    }

