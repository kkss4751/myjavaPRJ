public class javaprograming_inflearn {
    public static void main(String[] args) {
        /** 화면에 내용 출력하기 **/

/*
        System.out.println("홍길동"); // println = 줄바꿈

        System.out.print("전우치");
        System.out.print("손오공");

        System.out.println(); // 내용없이 줄바꿈
*/

        /** 변수 , 상수 사용하기
         *
         * 변하는 값 : 변수
         * 변하지 않는 지정 값 : 상수
         *
         * 변수명은 소문자로 시작한다, 클래스명은 대문자
         * myMathScore 낙타등처럼 생겨 camel 표기법이라고 한다.
         * **/
/*
        System.out.println(2+3);
        // 변수 계산 방법1
        int num1 = 2;
        int num2 = 3;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num1 + num2);
        // 방법 2
        int result = num1 + num2;
        System.out.println(result);
*/
        /** 산술 연산자 사용하기
         *
         * 컴퓨터에 cup 중앙처리장치가 있다. 모든 처리를 한다.
         * alu 이 안에 연산장치가 들어있다.
         *
         * 정수 -> 정수, 1 + 2 = 3
         * 실수 -> 실수, 1.0 + 2.0 = 3.0
         *
         * 3/2 = 1.5 가 아니라 1을 출력하는데
         * 정수는 정수로 반환하고 실수는 실수로 반환하기 때문에
         * 나머지를 구하는 연산자 % 가 있다.
         *
         * **/
/*
        int num1 = 5;
        int num2 = 2;

        int result1 = num1 + num2;
        System.out.println(result1);

        int result2 = num1 - num2;
        System.out.println(result2);

        int result3 = num1 * num2;
        System.out.println(result3);

        int result4 = num1 / num2;
        System.out.println(result4);

        int result5 = num1 % num2;
        System.out.println(result5);

        System.out.println("홍길동"); //문자열 출력
        System.out.println(5); //숫자 출력
        System.out.println(num1); //변수의 값 출력

        System.out.println(num1+num2); // 변수끼리의 연산의 값 출력
        System.out.println(2 + 3); // 상수끼리의 연산의 값
        System.out.println(num1 + 4); // 변수와 산수의 연산 값
        System.out.println(); // enter 값 출력
 */

        /** 조건문 사용하기
         *
         * if 조건문 ( 만약 이게 맞으면 a 를 실행하고 틀리면 b 를 실행해라
         *
         * **/
/*
        System.out.println(2 + 3);
        System.out.println(2 < 3); // true
        System.out.println(2 > 3); // false

        boolean bmyCheck = (2 > 3);
        System.out.println(bmyCheck); //false


        // 괄호 안에 내용이 true 이면 중괄호 안의 내용 출력력
        if (1 < 2) {
            System.out.println("Hello");
        }

        int num = 3;
        if(num < 2) { // () 안의 내용이 false 면 중괄호 안의 내용을 출력하지 않음
            System.out.println("Hi~");
        }

        int num2 = 4;
        if ( num2 % 2 == 1) { //0 과 1은 같다 는 false. 즉 출력되지 않음
            System.out.println("Hola~");
        }

        if ( num2 % 2 == 1){ // 괄호안의 내용이 false 이므로 else로 내려감
            System.out.println("나머지가 1: 홀수 ");
        }else { // if 괄호안의 내용이 false 이므로 else 출력
            System.out.println("나머니가 0: 짝수");
        }
*/
        /** While 반복문 사용하기
         *
         * while () 안의 내용이 true 인지 false 인지
         *
         * **/
/*
        int num = 0;
        while ( num < 5) {  // 5 보다 작을때 까지 , 0 부터 4 까지 홍길동 5번 출력
            System.out.println("홍길동");
            num = num + 1;// 한번작동하면 다시 while 문, 처음으로 돌아감
        }// 끝나면 밑에 값 실행
        System.out.println("끝");

        // 구구단
        System.out.println(2 * 1);
        System.out.println(2 * 2);
        System.out.println(2 * 3);
        System.out.println(2 * 4);
        System.out.println(2 * 5);
        System.out.println(2 * 6);
        System.out.println(2 * 7);
        System.out.println(2 * 8);
        System.out.println(2 * 9);
        System.out.println("----------------------------------------");

        int number = 1;
        while (number < 10) {
            System.out.println(2 + "x" + number); // 구구단 닶
            number = number + 1; // number 하나씩 커짐
        }
        System.out.println("2단 출력 끝");
*/
        /** for 반복문 사용하기
         *
         * for ( 초기식; 조건 체크 연산식; 증감식) {  문장 ; }
         *
         * 실행 순서는 ( 조건식 -> 연산식 -> 문장 -> 증감식 -> 연산식 -> 문장 -> 증감식 순으로 반복.)
         *
         * **/

/*
        for( int i = 0; i < 5; i ++){
            System.out.println("홍길동");
        }

        System.out.print(2 * 1 + " ");
        System.out.print(2 * 2 + " ");
        System.out.print(2 * 3 + " ");
        System.out.print(2 * 4 + " ");
        System.out.print(2 * 5 + " ");
        System.out.print(2 * 6 + " ");
        System.out.print(2 * 7 + " ");
        System.out.print(2 * 8 + " ");
        System.out.print(2 * 9 + " ");
        System.out.println();

        System.out.println("=========================================");

        for ( int a = 1; a < 10; a++){
            System.out.print(2 * a + " ");
        }
        System.out.println();

        System.out.print(2 + "x" + 1 + " ");
        System.out.print(2 + "x" + 2 + " ");
        System.out.print(2 + "x" + 3 + " ");
        System.out.print(2 + "x" + 4 + " ");
        System.out.print(2 + "x" + 5 + " ");
        System.out.print(2 + "x" + 6 + " ");
        System.out.print(2 + "x" + 7 + " ");
        System.out.print(2 + "x" + 8 + " ");
        System.out.print(2 + "x" + 9 + " ");
        System.out.println();

        System.out.println("=========================================");

        for( int b = 1; b < 10 ; b++) {
            System.out.print(2 + "x" + b + " ");
        }
        System.out.println();
*/

        /** 반복문의 중첩
         *
         * **/

 /*       for(int i = 1; i < 10; i++){
            System.out.print(2 * i + " ");
        }
        System.out.println();
        System.out.println("==================================");

        for (int i = 2; i < 10; i++) {
            System.out.print( 2 * i + " ");
            System.out.print( 3 * i + " ");
            System.out.print( 4 * i + " ");
            System.out.print( 5 * i + " ");
            System.out.print( 6 * i + " ");
            System.out.print( 7 * i + " ");
            System.out.print( 8 * i + " ");
            System.out.print( 9 * i + " ");
            System.out.println();
        }
        System.out.println("===================================");

        for ( int a = 2; a < 10; a++){
            for (int j = 2; j < 10; j++){
                System.out.println(a + "x" + j + " = " + a*j );
            }
            System.out.println("-------------------------------");
        }

        for ( int gop = 2; gop < 10; gop ++){
            for (int sam = 2; sam < 10; sam++) {
                System.out.print(gop + "x" + sam + " " + "=" + gop*sam);
                System.out.print(" ");
            }
            System.out.println();
        }
*/
        /** 반복문 고급 사용
         *
         * while 문에서 break, continue 사용하기기
         *
         * while 문은 무조건 반복만 하는게 아니라 조건에 따라 건너뛰거나 혹은 어떠한 조건이 되면 중단시킬 수 있다
         *
         * 조건에 따라 반복문의 실행을 건너뛸 때는 continue; ,
         * 조건에 따라 반복문을 중지시킬때는 break;  사용
         *
         * for ( 초기식; 조건 체크 연산식; 증감식) {
         *      문장1;
         *      if ( 연산식) {
         *          continue;         <- continue 를 만나면 증금식으로 올라감
         *          break;     <- break 는 빠져나감
         *         }
         *      문장2;
         *     }
         * **/

        int num = 0;
        while ( true ) {
            num ++;
            System.out.println(num);

            if (num > 10){
                break;
            }
        }
        System.out.println("while 문 종료");

        int number = 0;
        while ( true ) {
            number ++;

            if (num % 2 == 0){
                continue;
            }
            if ( num > 10){
                break;
            }
            System.out.println(number); // 홀수 일 때만 출력
        }
        System.out.println("while문 종료");



    }
}
