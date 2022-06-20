package practica;

public class repasodel0608 {
    public static void main(String[] args) {

        /**예외 처리
         *
         * try ~ catch 문 **/

        int [] aa = new int[3];
/*        try {
            aa[3] = 100; //일부러 에러를 냄
        }catch (ArrayIndexOutOfBoundsException e){ //배열의 인덱스가 실제 크기보다 큰 경우에 발생하는 오류 변수의 이름 e
            System.out.println("배열 첨자가 배열 크기보다 커요~~ ");
        }
*/

/*        try {
            aa[2] = 100 / 0;
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요");
        }catch (ArithmeticException e) {
            System.out.println("0으로 나누는 등의 오류에요"); //0으로 나누는 오류등 수식 오류잡음
        }catch ( Exception e) {
            System.out.println("모든 에러를 다 잡는다");
        }finally {
            System.out.println("이 부분은 무조건 나온다");
        }
*/

/*
        int a = 100, b = 0;
        int result;
        try {
            result = a / b;
        }catch (ArithmeticException e){
            System.out.print("발생오류 ==>");
            System.out.println(e.getMessage());     //get.Message() 메소드로 오류내용 추출
        }
*/




        int a = 100, b = 0;
        int result;
        try {
            if (b==0)
                throw new Exception("0으로 나누려고요? 안됩니다.");
            result = a/b;
        }catch (Exception e){
            System.out.print("발생오류 ==>");
            System.out.println(e.getMessage());
        }


    }
}
