package J07_StringManipulation.Tasks1;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char e=harfDepo.charAt(harfDepo.indexOf("E"));
        char l=harfDepo.charAt(harfDepo.indexOf("L"));
        char i=harfDepo.charAt(harfDepo.indexOf("I"));
        char f=harfDepo.charAt(harfDepo.indexOf("F"));
        char n=harfDepo.charAt(harfDepo.indexOf("N"));
        char u=harfDepo.charAt(harfDepo.indexOf("U"));
        char r=harfDepo.charAt(harfDepo.indexOf("R"));


        System.out.println(e+l+i+f+n+u+r);// 533-> char ascii deger toplamı
        System.out.println("adım : "+e+l+i+f+n+u+r);//ELIFNUR

    }
}
