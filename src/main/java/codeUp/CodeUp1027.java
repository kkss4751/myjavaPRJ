package codeUp;

import java.util.Scanner;

/** 년원일 입력 받아 형식 바꿔 출력하기**/
public class CodeUp1027 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("년.월.일 을 이와 같은 형식으로 쓰세요");

        /* 그냥 점을 넣게 되면 안되는데 실행이 되지 않는 split()함수들이 몇개 있다.
        *  실행이 안될때는 \\ (백슬레시) 두개를 넣어주면 실행이 된다.
        * */
        String [] date = sc.nextLine().split("\\.");

        System.out.println(date[2] + '-' + date[1] + '-' + date[0]);

    }
}
