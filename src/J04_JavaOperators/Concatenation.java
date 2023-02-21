package J04_JavaOperators;

public class Concatenation {

        public static void main(String[] args) {
            String name = "Ahmet";
            String sName= "Hacıoğlu";
            String bosluk= " ";
            String fullName = name +bosluk+ sName;
            int sayi=0;
            fullName = fullName +bosluk+ sayi+bosluk;

            char ch ='A';
            fullName = fullName + ch;
            System.out.println("fullName = " + fullName);
            int i = ch+0;
            System.out.println(i);

        }
    }

