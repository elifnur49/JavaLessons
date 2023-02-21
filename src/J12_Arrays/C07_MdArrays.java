package J12_Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {
        //Task-> int arr3[][]={
//                {3,5},//0. kat
//                {12,13,15},//1. kat
//                {103,107,111,121},//2. kat
//        }; array elamanları toplamını print eden code create ediniz

        int toplam=0;// arr elemanlerı toplanacak bos bır kutu tanımlandı.
        int arr[][]={
                {3,5},//0. kat
             {12,13,15},//1. kat
              {103,107,111,121},//2. kat
        };
        for (int kat = 0; kat < arr.length; kat++) {

            for (int daire = 0; daire < arr[kat].length; daire++) {

                toplam +=arr[kat][daire];
            }
        }
        System.out.println("arr deki elemaların toplamı : "+toplam);// 490



    }
}
