package OrdenJava.GUGUDAN;

public class Gugudan1 {
    public static void main(String[] args) {


        for (int dan = 2; dan <= 9; dan++){ //단출력
            System.out.printf("----------%d단----------\n",dan);
            for (int i = 1; i <= 9; i++){   //
                System.out.printf("%d x %d = %d\n",dan,i,dan*i);
            }
        }
    }
}
