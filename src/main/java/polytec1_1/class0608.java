package polytec1_1;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class class0608 {
/*
    public static void main(String[] args) {
        */
/** 예외 처리
         *
         *
         * **//*

*/
/*        System.out.println("------------예외 처리 기본 예-------------");
        int [] aa = new int[3];
        try {
            aa[3] = 100;
        }catch (ArrayIndexOutOfBoundsException e){  // e 는 변수명 , 아무거나 적어도 됨
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
            System.out.println("에러 메시지 : " + e);
        }


        System.out.println("------------예외 처리 전체 예-------------");
        int [] bb = new int[3];
        try {
            aa[2] = 100 / 0;  // 처음에 에러가 나면 밑에 실행하지 않고 바로 catch 로 내려감
            aa[3] = 100;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
            System.out.println("에러 메시지 : " + e);
        }catch (ArithmeticException e) {
            System.out.println("0으로 나누는 등의 오류에요 ~~");
            System.out.println("에러 메시지 : " + e); // catch에서 by zero 에러가 나옴
        }catch ( Exception e) {
            System.out.println("난 모든 에러를 다 잡아요");
            System.out.println("에러 메시지 : " + e);
        }
        finally {
            System.out.println("이 부분은 무조건 나와요~~"); // 이건 에러여부 없이 무조건 실행
        }
*//*


        */
/**ㅇㅖ외 처리 **//*

*/
/*
        int a = 100, b = 0;
        int result;
        try{
            if (b == 0) // b 에 0이 들어오면 무조건 에러를 발생시켜라

                // 강제로 new 로 올림. new 로 던짐,
                // (회원가입할때 이메일값이 이상하거나 , 아이디가 이상하거나 정확한값이 들어오지않을떄 사용.
                // 유효성 체크용
                throw new Exception("0으로 나누려고요? 안됩니다."); // 이메시지는 밑에 exception e 로 들어간다.
            result = a/b;
        }catch ( Exception e){
            System.out.println("0으로 나누는 등의 오류에요~~");
            System.out.println("발생오류 : " + e.getMessage());
            System.out.println("에러메시지 : " + e);
        }finally {
            System.out.println("이 부분은 무조건 나와요~~");
        }
*//*


        */
/** 파일 입출력 **//*


    }
*/
    public static void main(String[] args) throws Exception {

        //파일을 읽어옴
        //실제로는 c라고 안씀(기본) -> 리눅스에는 c 개념 없음

        FileInputStream fis = new FileInputStream("c:/tempjava/data1.txt"); //이것만 쓰면 한글 에러

        // 한국어 강제로 읽게만들기
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        // 원래 한국어는 euc-kr -> 한국어 표준어 전용
        // utf-8 거의 모든 언어
        int ch;

        while ((ch = isr.read()) != -1)
        // while ( (ch = fis.read()) != -1 )
            System.out.print((char) ch);

        fis.close(); // 닫아주기 위해서
    }
}
