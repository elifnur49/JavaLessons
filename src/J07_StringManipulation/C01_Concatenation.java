package J07_StringManipulation;

public class C01_Concatenation {
    public static void main(String[] args) {
        /*
        concat()->methodu içinde parametre aldıgı String variable 'yi calıstıdıgı string sonuna ekler.
        Java '+' işlenimde en az bir string ifade varsa aritmetik toplama degil birleştirme yapılır.
         */
        String qa="Safvet";
        String lead="Vedat";

        System.out.println(qa.concat(lead));//SafvetVedat  //qa String sonuna lead string birleştirildi.
        System.out.println(qa);//Safvet

       /*
        Trıck-> String methodları variableyi kalıcı degil gecici degişiklik yapar.
        String' te kalıcı degişiklik yapmak için atama yapılır.
       */

     qa = qa.concat(lead);
        System.out.println("qa = " + qa);//qa = SafvetVedat
     qa = lead.concat(qa);
        System.out.println("qa = " + qa);//qa = VedatSafvetVedat

        System.out.println(qa.concat("true"));//VedatSafvetVedattrue
        System.out.println(lead.concat(true + "$"));//Vedattrue$
        System.out.println(lead.concat(53 + "cay"));//Vedat53cay
     /*
     Trıck-> concat methodu parametre olarak String harıcı  tum dataları Stringr cevirir concat eder.
     murekkep gibi bulundugu ortamda dıger dataları etkıler.
      */



    }
    }