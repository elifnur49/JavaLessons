package J08_Loops.Loop01_ForLoop.Tasks;

public class Task27 {
    public static void main(String[] args) {
            /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */
int IT,qa;
for(IT=1; IT <=3;IT++){
    System.out.println("IT =" + IT);
    for(qa = 1;qa<=3;qa++){
        System.out.println("qa = " + qa);
    }
    System.out.println( );
}


    }
}
