package polytec1_1;

import java.util.Scanner;

public class section3_0330 {

    // 연산자 - Section02논리 연산자 p.143 ~

    /* public static void main(String[] args) {
        int a = 99;
        System.out.printf("and 연산 : %s \n", (a >= 100)&&(a<=200));
        System.out.printf("or 연산 : %s \n", (a >= 100)||(a<=200));
        System.out.printf("not 연산 : %s \n", !(a == 100));
    }*/
    // 조건문 - Section01 (if 문) p.167 ~

   /* public static void main(String[] args) {
        int a = 200;
        if (a<100) {
            System.out.printf("100보다 작군요.. \n");
            System.out.printf("거짓이므로 이 문장은 안보이겠죠? \n");
        }
        System.out.printf("프로그램 끝!");
   }*/
    // (if else 문) p.171 ~

   /* public static void main(String[] args) {
        int a = 200;
        if (a < 100) {
            System.out.println("100보다 작군요.. \n");
        } else System.out.println("100보다 크군요..\n");
    }*/

    //Section02 - (중첩 if 문) p.175 ~

    /*public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.println("점수를 입력하세요 : ");
        a = s.nextInt();

        if (a >= 90){
            System.out.printf("A");
        }else if ( a >= 80){
            System.out.printf("B");
        }else if (a >= 70){
            System.out.printf("C");
        }else if (a >= 60){
            System.out.printf("D");
        }else {
            System.out.printf("F");
        }
        System.out.printf(" 학점 입니다.\n");
    }*/

    // 마지막 if문 문제

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
