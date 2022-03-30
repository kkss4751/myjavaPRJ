import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        //Q1. 내가 입력한 숫자가 홀인지? 짝인지? 출력해주는 프로그램
        //10 --> 짝입니다. / 11 --> 홀입니다.
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.printf("숫자를 입력하세요 ==> ");
        a = sc.nextInt();

        if (a % 2 == 0){
            System.out.printf("짝입니다. \n");
        }else {
            System.out.printf("홀입니다. \n");
        }
        //Q2. 내가 입력한 숫자가 3의 배수인지> 혹은 5의 배수인지? 3과 5의 배수인지?
       /* if (a % 3 == 0){
            System.out.printf("3의 배수입니다. \n");
        }else if (a % 5 == 0){
            System.out.printf("5의 배수입니다. \n");
        }else if ((a % 3 == 0) && (a % 5 == 0) ) {
            System.out.printf("3과 5의 배수를 둘 다 만족합니다.");
        }else {
            System.out.println();
          }*/
        if ((a % 3 == 0)&&(a % 5 == 0)){          // 순서를 1번으로 놓기! 이게 밑으로 갔을경우
            System.out.printf("3과 5의 배수를 둘 다 만족합니다.");//범위가 가장큰것이 위로 올라가기
        }else if (a % 3 == 0){
            System.out.printf("3의 배수입니다.");
        }else if (a % 5 == 0){
            System.out.printf("5의 배수입니다.");
        }

    }
}
