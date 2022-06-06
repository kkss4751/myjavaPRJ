import java.util.Scanner;

public class codeup1010_1086 {
    public static void main(String[] args) {
        /** 기초2. 입출력문 및 연산자
         *
         *  1010 ~ 1012
         * 정수 1개 입력받아 그대로 출력하기 기초**/
/*

        //1010 : [기초-입출력] 정수 1개 입력받아 그대로 출력하기
        Scanner Num = new Scanner(System.in);
        int a = Num.nextInt();
        System.out.println(a);

        //1011 : [기초-입출력] 문자 1개 입력받아 그대로 출력하기
        Scanner caracter = new Scanner(System.in);
        String str = caracter.nextLine();  //String 문자열
        System.out.println(str);

        //1012 : [기초-입출력] 실수 1개 입력받아 그대로 출력하기
        Scanner fNum = new Scanner(System.in);
        float f = fNum.nextFloat();
        System.out.println(f);

*/

        /** 1013 ~ 1015
         *
         *  정수 2개 입력받아 그대로 출력하기 기초
         *  **/

        //1013 : [기초-입출력] 정수 2개 입력받아 그대로 출력하기
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(a+" "+b);
        System.out.printf("%d %d\n",a,b);

        //1014 : [기초-입출력] 문자 2개 입력받아 순서바꿔 출력하기
        Scanner c = new Scanner(System.in);
        String str = c.nextLine();
        String strstr = c.nextLine();

        System.out.println(strstr+" "+str);
        System.out.printf("%s %s\n",strstr,str);

        //1015 : [기초-입출력] 실수 2개 입력받아 둘째자리까지 출력하기

        /**
         *
         * **/

        //1017 : [기초-입출력] 정수 1개 입력받아 3번 출력하기
        //1018 : [기초-입출력] 시간 입력받아 그대로 출력하기
        //1019 : [기초-입출력] 연월일 입력받아 그대로 출력하기
        //1020 : [기초-입출력] 주민번호 입력받아 형태 바꿔꿔 출력하기




    }
}