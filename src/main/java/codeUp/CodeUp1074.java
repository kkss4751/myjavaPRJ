package codeUp;

import java.util.Scanner;

/** 기초 반복  정수 1개 입력받아 카운트다운 출력하기 **/
public class CodeUp1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        /** for 문으로 반복문 **/
        for (int a = 0; a < i; i--){
            System.out.println(i);
        }
        /** while 문으로 반복문 **/
        int b = sc.nextInt();
        int a = 0;
        while (a < b){                  // a 가 b 보다 작을때 까지 반복해라
            System.out.println(b);
            b--;
        }


    }
}
