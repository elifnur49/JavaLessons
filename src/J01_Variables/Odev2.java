package J01_Variables;

public class Odev2 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        System.out.println("Num1  kutusu : " + num1 + "\tNum2 kutusu :" + num2);
        //İşte matematik kısmı
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("------------------------------------");

        System.out.println("Num1  kutusu : " + num1 + "\tNum2 kutusu :" + num2);

    }
}
