package OrdenJava.ESTRELLA;

public class Star5 {
    public static void main(String[] args) {


        // 피라미드 별찍기
        System.out.println("-------피라미드 별찍기--------");

        //줄반복
        for (int i = 1; i <= 4; i++) {
            //공백출력
            for (int j = 5-i; j > 0 ; j--) {
                System.out.print(" ");
            }
            //별 출력
            for (int k = 1; k <= i*2-1 ; k++) {
                System.out.print("*");
            }
            //줄바꿈
            System.out.println();
        }

        System.out.printf("\n\n");


        //다이아몬드 별찍기
        System.out.println("-------다이아몬드 별찍기--------");



        int num = 3;
        for (int i = 0; i < num; i++) {
            //공백출력
            for (int j = num-i-1; j > 0 ; j--) {
                System.out.print(" ");
            }
            //별출력
            for (int k = 0; k < i*2+1; k++) {
                System.out.print("*");
            }
            //줄바꿈
            System.out.println();
        }
        for (int i = 0; i < num; i++) {
            //공백출력
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            //별출력
            for (int k = (num-i-1)*2 -1; k > 0 ; k--) {
                System.out.print("*");
            }
            //줄바꿈
            System.out.println();

        }
    }
}
