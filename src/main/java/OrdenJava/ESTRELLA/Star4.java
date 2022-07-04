package OrdenJava.ESTRELLA;

import java.util.Scanner;

public class Star4 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = 3; k > i; k--){
                System.out.print("*");
            }
            System.out.println();
        }


        //입력받은 수부터 내림차순으로 별 출력 (오른쪽 정렬)


        System.out.print("숫자 입력 ===> ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {           //지역변수기때문에 중복가능하다.
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = num; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
