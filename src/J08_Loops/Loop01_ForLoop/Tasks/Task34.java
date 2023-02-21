package J08_Loops.Loop01_ForLoop.Tasks;

public class Task34 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        for (int kat = 1; kat <=6; kat++) {
            for (int daire = 1; daire <= kat; daire++) {
                System.out.print(" ");
            }
            for (int sayi = kat; sayi <= 6; sayi++) {
                System.out.print(sayi + " ");
            }
            System.out.println();

    }
}

    }
