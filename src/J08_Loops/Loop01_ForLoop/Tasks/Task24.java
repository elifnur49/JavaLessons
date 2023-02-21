package J08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */
        Scanner scan=new Scanner(System.in);
		System.out.println("Bir string giriniz :");
		String str= scan.nextLine();

		for (int i =str.length()-1 ; i >= 0 ; i--) {
			System.out.println(str.charAt(i));
		}
		System.out.println("   ***   ");

		for (int i = 0; i <= str.length() - 1; i++) {
			System.out.print(str.charAt(str.length() - 1 - i));
		}


	}

	}


