package codeUp;

import java.util.Scanner;
/** 시, 분, 초 입력받아 초만 출력하기 **/
public class CodeUp1026 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("시:분:초 를 이와 같은 형식으로 입력하세요");
        /*배열로 입력받음*/
        String [] cmd = sc.nextLine().split(":");
        /*.split은 그 안에 들어간문자 기준으로 쪼개겠다.*/
        /*시,분,초를 h:m:s형식으로 적어야함*/

        /*string으로 입력받은 시간을 배열로 쪼개진것중 1번칸에 있는걸 가져온다.*/
        int m = Integer.parseInt(cmd[1]);
        System.out.printf("%d",m);


    }
}
