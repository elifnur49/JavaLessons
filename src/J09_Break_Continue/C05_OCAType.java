package J09_Break_Continue;

public class C05_OCAType {
    public static void main(String[] args) {


        int count=0;// varaible-> primitive->ilkel
        RAW_LOOP:
        for (int row = 1;row <= 3 ;row++){
            for (int col = 1;col <= 2 ;col++){
                if(row*col % 2 == 0) continue ;// raw*col cift ise bekleme yapma devam ticari:count artma
                count++;
            }
        }
        System.out.println(count);
    }
    }

