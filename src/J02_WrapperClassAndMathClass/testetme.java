package J02_WrapperClassAndMathClass;

public class testetme {
    public static void main(String[] args) {
        int x = 345;

        int birler = x%10;
        int onlar = (x/10) %10;
        int yuzler =(x/100) %10 ;
        System.out.println("yuzler = " + yuzler);
        int rakamTop=birler+onlar+yuzler;
        System.out.println("rakamTop = " + rakamTop);

        // 17-
        System.out.println(""+ yuzler +""+onlar  +""+ birler);
    }
}
