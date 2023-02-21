package J10_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {//benim koyum
String javaCAN="Ahmet bey";
 String javaTAR="Ceren Hanım";
   selamver();//koy amelesi
   C03_MethodDepo.gecmeNotu(55);//komsu koyun amelesini koy ısmıylecall ettık
        System.out.println("javaTAR = " + javaTAR);


/*
farklı classlardan methoc call etmek için
 classMane.method() yapılır.static method ->gokteki gunes gibi
 ancak aynı classtan method dogrudasn method name ile call edilir.
 */
    }//main sonu

   public static void selamver(){

       System.out.println("javaTAR'a selamlar");



   }


}//class sonu
