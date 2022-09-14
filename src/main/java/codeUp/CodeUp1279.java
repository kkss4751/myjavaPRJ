package codeUp;

import java.util.Scanner;

/** 홀수는 더하고 짝수는 빼고**/
public class CodeUp1279 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        /* int c를 하나 더 만들어준다.*/
        int c = 0;

        // int i에 입력받은 값 a 를 집어넣어주고 b와 같을때까지 늘려준다.
        for (int i = a; i<=b; i++){
            // i가 짝수면 c에 i를 빼주고
            if (i % 2==0){
                c = c - i;
            // 아니면 c에 i를 더해준다.
            }else
                c = c + i;
        }
        System.out.println(c); // 마지막 c 출력


        /** while 문으로 돌려주기 **/
        while ( a <= b){
            if (a % 2 == 0){
                c -= a;
            }else c+= a;
            a++;
        }
        System.out.println(c);
    }
}
