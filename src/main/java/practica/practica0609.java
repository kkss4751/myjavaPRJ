package practica;

public class practica0609 {
    public static void main(String[] args) {
        int [] aa = new int[3];
        // aa[3] = 100;  // try ~ catch 예외처리 14번 줄로 이동

        /** 예외 처리의 기본 예 p.352 **/
/*

//        try {
//            JAVA 코드...
//        }catch (예외 타입 e) {
//            예외 발생 시 이 부분이 실행됨
//        }

        try {
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e){ // 예외 타입 Array~~~ : 배열의 인덱스가 실제 크기보다 큰 경우 발생하는 오류
            System.out.println("배열 첨자가 배열 크기보다 커요");
        }
*/


        /** 예외 처리의 전체 예 p.353 **/
/*
//        try {
//            JAVA 코드...
//        } catch ( 예외 타입 1 e) {
//            예외1 발생시 이 부분이 실행됨
//        } catch ( 예외 타입 2 e) {
//            예외2 발생시 이 부분이 실행됨
//        } finally {
//            이 부분은 마지막에 무조건 실행됨
//        }

        try {
            aa[2] = 100 / 0;        // 강제로 에러를 내준다 // 첫번째에러가 나면 두번째실행안하고 바로 catch로 내려감
            aa[3] = 100;
        } catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자가 배열 크기보다 커요");
        } catch (ArithmeticException e){                // 예외 타입
            System.out.println("0으로 나누는 등의 오류에요~~");
        } finally {
            System.out.println("이 부분은 무조건 나와요");  // 오류가 발생하든 않든 무조건 마지막에 수행되며 생략가능하다
        }
*/
        /** 오류 내용의 출력 예 p354 **/


   /*
        int a = 100, b = 0;
        int result;
        try {
            result = a / b;
        }catch (ArithmeticException e){
            System.out.print("발생 오류 ==> ");
            System.out.println(e.getMessage());
            // Arithmetic~~ 클래스 타입의 변수e에 대해 getMessege() 메소드로 오류 내용을 추출해서 출력했다.
            // 오류 메시지 '/ by zero' 가 나온다.
        }
     */

        /** 오류 메시지 직접 만들기 p.355 **/

        int a = 100, b = 0;
        int result;
        try {
            if (b == 0 )                                               // b 가 0 이면 오류 실행
                throw new Exception("0으로 나누려고요? 안됩니다");         // 예외 타입을 Exception으로 변경
            result = a / b;
        } catch (Exception e){
            System.out.print("발생 오류 ==> ");
            System.out.println(e.getMessage());
        }
    }
}
