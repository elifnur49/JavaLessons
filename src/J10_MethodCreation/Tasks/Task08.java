package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task08 {

    /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

    input: 2023
    output:false
            */


    public static void main(String[] args) {


    int yil;
    Scanner scan = new Scanner(System.in);
    	System.out.print("Bir yıl girin:");
    yil = scan.nextInt();
    	scan.close();
    boolean artik = false;

        if(yil % 4 == 0)
    {
        if( yil % 100 == 0)
        {
            if ( yil % 400 == 0)
                artik = true;
            else
                artik = false;
        }
        else
            artik = true;
    }
        else {
        artik = false;
    }

        if(artik==true)
            System.out.println(yil + " artık bir yıldır.");
        else
                System.out.println(yil + " artık bir yıl değildir.");
}
}
