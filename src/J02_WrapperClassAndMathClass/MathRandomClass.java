package J02_WrapperClassAndMathClass;

import java.util.Random;

public class MathRandomClass {
    public static void main(String[] args) {


        //        Math.random()   : 0 ila 0.999999999  arasında rastgele bir sayı üretir.
        int num = (int) (Math.random()*100+1);// 1 ila 100 arasında sayı üretir.
        System.out.println("num = " + num);

        Random rnd = new Random();
        int num2 = rnd.nextInt(100)+1; // 1 ila 100 arası sayı üretir
        int num3 = rnd.nextInt(101);   // 0 ila 100 arası sayı üretir
        System.out.println("num2 = " + num2);
        int num4 = rnd.nextInt();
        System.out.println("num4 = " + num4);


    }
}



