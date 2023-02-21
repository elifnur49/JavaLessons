package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task18_gercek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Kenar Uzunluğunu Girin");
        double k1 = scan.nextDouble();
        System.out.println("2.Kenar Uzunluğunu Girin");
        double k2 = scan.nextDouble();

        System.out.println("3.Kenar Uzunluğunu Girin");
        double k3 = scan.nextDouble();

        dikmi(k1, k2, k3);

    }

    public static void dikmi(double a, double b, double c) {
        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
            System.out.println(" Dik Üçgendir");
    }
}