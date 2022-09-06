package codeUp;

import java.util.Scanner;

/** 정수1개 입력받아 카운트다운 출력하기2 **/
public class CodeUp1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //int i 는 입력받은 값 a-1 이고 0과 같을때까지 하나씩 줄인후 출력
        for (int i=a-1; i>=0; i--){
            System.out.println(i);
        }
    }
}


