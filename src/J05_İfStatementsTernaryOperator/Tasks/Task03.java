package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		/*
		Task->//>=
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bolünuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir yıl giriniz : ");
        int yil=scan.nextInt();
        if (yil<0){
            System.out.println("Agam gelmeyeyım oraya.negatıf yıl mı olur :\n adam gibi bir sayı gır");
        }else{
        if(yil%1000==0){
            System.out.println("Milenyum");
        }else if(yil%100==0){
            System.out.println("Yuzyıl");
        }else if(yil%10==0){
            System.out.println("Onyıl");
        }
            System.out.println("agam code gayet BAŞARILI " );
}
}
}

