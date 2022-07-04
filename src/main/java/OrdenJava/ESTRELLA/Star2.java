package OrdenJava.ESTRELLA;

public class Star2 {
    public static void main(String[] args) {

        // 1 ~ 5 개씩 별 차례대로 출력


        for (int i = 1; i < 6; i++){        //줄반복
            for (int j = 1; j < i; j++){    //별반복
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
