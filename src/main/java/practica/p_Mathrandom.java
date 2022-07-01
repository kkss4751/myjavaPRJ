package practica;

public class p_Mathrandom {
    public static void main(String[] args) {
        int num = 0 ; // 변수 초기화

        //괄호 {} 안의 내용을 20번 반복한다.
        // Quiz. 1~ 10 사이의 난수를 20개 출력하시오.
        // 1,2,3,4,5,6,7,8,9,10
        for (int i = 1; i <= 20; i++){
//            System.out.println(Math.random());// 0.0 ~ < 1.0
//            System.out.println(Math.random()*10); // 0.0 ~ < 10.0
            System.out.println((int)(Math.random()*10)); // 0 ~ < 10 정수로 형변환
            System.out.println((int)(Math.random()*10)+1); // 1 ~ 10까지

        }
    }
}
