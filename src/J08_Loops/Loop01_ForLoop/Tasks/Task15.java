package J08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
		Scanner scan = new Scanner(System.in);

		System.out.print("Bir kelime giriniz: ");

		String kelime =scan.nextLine();
		char karakter = 'a';
		int tane = 0;

		for(int i = 0; i < kelime.length(); i++) {
			if(karakter == kelime.charAt(i)) {
				++tane;
			}
		}
		System.out.println( karakter + " yazı içinde  " + tane +" tanedir");
	}
	}

