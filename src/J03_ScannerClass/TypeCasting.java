package J03_ScannerClass;

public class TypeCasting {


        public static void main(String[] args) {
            int ii =130;
            byte bb = (byte) ii; // Cast işlemi
            long ll = ii;
            System.out.println(bb);
            System.out.println("ll = " + ll);
            double dd= ii;
            dd = 10.5;
            ii = (int) dd; // dd double değişkenini al int e çebir ve ii ye aktar.
            System.out.println("ii = " + ii);
            String str = String.valueOf(ii)+"";

            System.out.println("str = " + str);
            String str2 = ""+ii;
            System.out.println("str2 = " + str2);
            System.out.println("str1+str2 = " + (str+str2));
            int sayi = Integer.parseInt(str);
            System.out.println("sayi = " + sayi);


    }
}
