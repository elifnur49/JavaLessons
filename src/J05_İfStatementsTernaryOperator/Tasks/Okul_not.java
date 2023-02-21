package J05_İfStatementsTernaryOperator.Tasks;

import java.util.Scanner;

public class Okul_not {
    public static void main(String[] args) {
         /*  Task->
        Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F
        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */


        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen  vize notunuzu giriniz : ");
        int vizeNot = sc.nextInt();

        System.out.println("Lutfen arasınav notunuzu giriniz : ");
        int araSinav= sc.nextInt();

        System.out.println("Lutfen final notunuzu giriniz : ");
        int finalNot= sc.nextInt();

       double ort=(vizeNot+araSinav+finalNot)/3;

        if (ort<100 && ort>=90){
            System.out.println("A");

        }else if (ort<90 && ort>=70 ){
            System.out.println("B");

        }else if (ort<70 && ort>=50){
            System.out.println("C");

        }else if (ort<50){
            System.out.println("D");

        }else{
            System.out.println("Girdiginiz not gecerli degil ");
        }
        System.out.println("\"ortalama\" = " +ort+"");
    }
}
