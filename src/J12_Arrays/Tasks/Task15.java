package J12_Arrays.Tasks;

public class Task15 {
    public static void main(String[] args) {
        // task-> arr tum elemanlarının carpımını prınt eden code create ediniz
        int arr[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };
        int carpm=1;// ilk degeri 1 verilerek carpmada etki etmeyecek deger kullanıldı

        for (int kat = 0; kat < arr.length; kat++) {
            for (int daire = 0; daire <arr[kat].length ; daire++) {// daire kontrolu
                carpm*=arr[kat][daire];
            }
        }
        System.out.println(carpm);// 2880
    }
}
