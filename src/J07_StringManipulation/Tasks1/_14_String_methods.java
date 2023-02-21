package J07_StringManipulation.Tasks1;

public class _14_String_methods {
    public static void main(String[] args) {

        /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        //Kodu aşağıya yazınız.
        String str1 = "apple";
        String str2 = "APPLE";


        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));// true
        str2 = "APPLE";
        System.out.println("str1.equals(str2) = " + str1.equals(str2));//false

    }
}
