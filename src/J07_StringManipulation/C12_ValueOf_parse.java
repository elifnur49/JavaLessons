package J07_StringManipulation;

public class C12_ValueOf_parse {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..

        String bagis1="10000";
        String bagis2="20316";
        System.out.println("toplamı" + (bagis1+bagis2));//toplamı1000020316  (concat)
        int yas=48;//primitive
        Integer age=43;// non-primitive: Wrapper class
       int yeniBagis1=Integer.valueOf(bagis1);//bagis1 Stringin degerini integer e cevirip yeniBagis1'ye atandı
       int yeniBagis2=Integer.valueOf(bagis1);//bagis2 Stringin degerini integer e cevirip yeniBagis2'ye atandı


        int bagisDegeri1=Integer.valueOf(bagis1);// bagıs1 string içindeki sayı degerini int'e cevirdi,
        int bagisDegeri2= Integer.valueOf(bagis2);//bagıs2 string içindeki sayı degerini ınt e cevirdi

        System.out.println("toplam bagıs mıktarı:"+(bagisDegeri1+bagisDegeri2));//toplam bagıs mıktarı:30316

        int Tc=98765421;
      String tcStr= String.valueOf(Tc);// int tc degeri String'e atandı.
        System.out.println("tcStr = " + tcStr);// 98765421
        System.out.println("tcStr+Tc = " + (tcStr+ Tc));//9876542198765421

        String iphone = "$1500";
        String ipad = "$1200";
        // int iphoneFiyat = Integer.valueOf(iphone);//RTE $ number değil
        int iphoneFiyat= Integer.valueOf(iphone.substring(1)) ;
        int ipadFiyat= Integer.valueOf(ipad.substring(1)) ;

        System.out.println("toplam fiyat = " + (iphoneFiyat+ipadFiyat));//2700


      /*
     Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB toplamını print den code create ediniz
     */

     // String strA= "$13.99";
     // String strB= "$17.55";
     // //double strAYeni = Double.parseDouble(strA.substring(1));
     // //double strBYeni = Double.parseDouble(strB.substring(1));

     // double strAYeni = Double.parseDouble(strA.replaceAll("\\D"," "));
     // double strBYeni = Double.parseDouble(strB.replaceAll("\\D"," "));
     // System.out.println("strAYeni = " + strAYeni);//
     // System.out.println("( strA+strB) = " + (strA + strB));
     // System.out.println("strAYeni+strBYebi = " + (strAYeni + strBYeni));

/*
    Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB toplamını print den code create ediniz
       output: strA+strB=31.54
         */

        String strA="$13.99";
        String strB="$17.55";

        double stra= Double.parseDouble(strA.replaceAll("\\D",""));
        double strb= Double.parseDouble(strB.replaceAll("\\D",""));
        double straa= Double.parseDouble(strA.substring(1));
        double strbb= Double.parseDouble(strB.substring(1));

        System.out.println("toplam : "+(straa+strbb));//31.54

        System.out.println(" toplam : "+((stra+strb)/100));// 31.54

        System.out.println(" toplam : "+(strA+strB));// $13.99$17.55


    }



    }


