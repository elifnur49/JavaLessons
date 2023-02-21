package J09_Break_Continue;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {
     /*
break loop'u isrtenen yerden sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
 herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
 loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
 satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
  içinde kullanıldığı loop'dan çıkışı sağlar:


 temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
 */
   //Task-> girilen bir mail hesabı @ karakterine kadar olan karakterleri print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Mail hesabını giriniz:");
        String email=sc.nextLine();
        for(int i=0 ; i<email.length() ; i++){// 0 ındexten mail  son ındexe kadar her bir karakteri donguye alır
            char c=email.charAt(i);// döngudeki her bir karakteri c ye atar
            if(c=='@'){// c de @ karakterı varsa if blok run edılır
                break;// if blok loop u somlandırır kırar
            }
            System.out.print(c);// lopp takı elde edılen karakterlşerı c ye atayıp prınt eder.
        }

        System.out.println("   2.yol   " );
        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                break;
            } else
                System.out.print(email.charAt(i));
        }
        System.out.println();// dummy
        System.out.println("code guzel dwwamkee");
}
    }