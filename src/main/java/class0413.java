public class class0413 {
    public static void main (String[] args) {
/*
        // P.209 실습 6-12
        // for문을 사용한 구구단 프로그램
        Scanner sc = new Scanner(System.in);
        int i;
        int dan;

        System.out.printf("몇 단 ?");
        dan = sc.nextInt();

        for( i = 1; i <= 9; i++) {
            System.out.printf("%d X %d = %d \n", dan, i, dan * i);
        }
*/
/*
        // p.211 중첩 for문
        // 6-13 중첩 for문 사용 예1
        int i, k;

        for (i = 0; i < 3; i++){
            for ( k = 0; k < 2; k++){
                System.out.printf("중첩 for문입니다. (i값: %d, k값: %d)\n", i,k);
            }
        }
*/
/*
        //P.215 6-14 중첩 for문 사용 예 2
        // (1단부터 9단까지 출력하기)
        int i, k;
        for ( i = 2; i <= 9; i++){ // ( i < 10 )
            for (k = 1; k <= 9; k++){
                System.out.printf("%d X %d = %d \n", i,k,i,k);
            }
        }
*/                    //조건을 알면 while 문 , 횟수를 알고있다면 for 문

/*
        //P.234 while 문
        // 실습7-1 for문을 while문으로 바꾸기1
        int i = 0;

        while ( i < 5) {
            System.out.printf("while 문을 공부합니다. \n");
            i++;
        }
        //P.236 실습 7-2 - for문을 while 문으로 바꾸기2
        int hap = 0;
        int i = 1;
        while (i < 11) {
            hap = hap + i;
            i++; //조건 값에 변화를 주기 위해
        }
        System.out.printf("1에서 10까지의 합은 : %d \n", hap);
*/
/*
        //P.238 실습 7-3 - while 문의 무한 루프 만들기
        Scanner sc = new Scanner(System.in);
        int a, b;

        while (true) {
            System.out.printf("더할 첫 번쨰 수 입력 :");
            a = sc.nextInt();
            System.out.printf("더할 두 번쨰 수 입력 :");
            b = sc.nextInt();

            System.out.printf("%d + %d = %d \n", a, b, a+b);
        }
*/
/*
        // p.241 do ~ while 문 P.241 do~while문 사용 예
        int a = 100;
        while ( a == 200){
            System.out.printf("While 문 내부에 들어왔습니다.\n");
        }
        do { // false 지만 무조건 한번은 실행.
            System.out.printf("do ~ while 문 내부에 들어왔습니다.\n");
        }while ( a == 200);
*/
/*
        //P.244 기타 제어문 (break;)
        // -- 실습 7-7 -- break문 사용 예1
        for ( int i = 1; i <= 100; i++) {
            System.out.printf("for문을 %d 회 실행했습니다.\n", i);
            break;
        }

        System.out.printf("for 문을 종료했습니다.\n");
        //-- 실습 7-8 -- break문 사용 예2
        Scanner s = new Scanner(System.in);
        int a,b;
        while(true) {
            System.out.printf("더할 첫 번째 수 입력 :");
            a = s.nextInt();
            System.out.printf("더할 두 번째 수 입력 :");
            b = s.nextInt();

            if ( a == 0 )
                break;
            System.out.printf("%d + %d = %d \n", a, b, a+b);
        }
        System.out.printf("0을 입력해서 반복문을 탈출했습니다.\n");
*/
        //P248 continue 문 사용 예 --개념만 알고 넘어가기
        int hap = 0;
        int i;
        // else 사용 가능
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0)    // (i % 3 != 0) -- 를 쓰면 continue; 문을 쓰지 않아도 됨.
                continue;

            hap += 1;
        }
        System.out.printf("1~100까지의 합(3의배수 제외): %d\n", hap);
    }
}
