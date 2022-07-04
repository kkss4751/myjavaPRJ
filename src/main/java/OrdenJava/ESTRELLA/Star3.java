package OrdenJava.ESTRELLA;

import java.util.Scanner;

public class Star3 {
    public static void main(String[] args) {


        // 입력받은 숫자만큼 차례대로 별 출력

        System.out.print("정수를 입력하세요 ==>");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



        //입력받은 숫자부터 0까지 반대로 별 출력

        System.out.print("정수를 입력하세요 ==>(반대로 출력)");
        int num2 = sc.nextInt();

        for (int a = num2; a >= 1; a--){        //줄반복
            for (int b = 1; b <= a; b++ ){      // 별 반복
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
