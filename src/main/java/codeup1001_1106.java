public class codeup1001_1106 {
    public static void main(String[] args) {
        // 문제 1106 : int의 범위
        /** 솔직히 몰라서 인터넷 배껴옴 **/ //뭔 소리야..?
        int min, max;
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;

        System.out.print(min+" "+max);

        /**파일을 읽을때 \uFEFF 를 써야함 ??? 빼도 정답은 맞지만 복사하면 저게 뜸**/
        // 문제 1103 : 폴더명 출력
        System.out.printf("\uFEFF\"c:\\test\"");

        //문제 1102 : Hello, World! (줄 바꿈 버전)
        System.out.printf("Hello,\nWorld!\n");

        //문제 1101 : Hello, World!
        System.out.printf("Hello, World!\n");

        //문제 1008 : [기초- 출력] 출력하기08 (설명) //유니코드??
        System.out.printf("\u250C\u252C\u2510\n");
        System.out.printf("\u251C\u253C\u2524\n");
        System.out.printf("\u2514\u2534\u2518\n");

        //문제 1007 : [기초- 출력] 출력하기07 (설명)
        System.out.println("\"C:Download\\hello.cpp\""); // printf 로 출력하는 방법 찾아보기

        //문제 1006 : [기초- 출력] 출력하기06 (설명)
        System.out.println("\"!@#$%^&*()\""); // printf 로 출력하는 방법 찾아보기.

        //문제 1005 : [기초- 출력] 출력하기05 (설명)
        System.out.printf("\"Hello World\"\n");

        //문제 1004 : [기초- 출력] 출력하기04 (설명)
        System.out.printf("\'Hello\'\n");

        //문제 1003 : [기초- 출력] 출력하기03 (설명)
        System.out.printf("Hello\nWorld\n");

        //문제 1002 : [기초- 출력] 출력하기02 (설명)
        System.out.printf("Hello World\n");

        //문제 1001 : [기초- 출력] 출력하기01 (설명)
        System.out.printf("Hello\n");

    }
}
