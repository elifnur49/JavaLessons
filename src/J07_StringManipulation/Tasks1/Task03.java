package J07_StringManipulation.Tasks1;

public class Task03 {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini return eden code create ediniz

        String str = "Alamanya";
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));

    }
}
