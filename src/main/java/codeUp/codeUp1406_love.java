package codeUp;

import java.util.Scanner;

public class codeUp1406_love {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("입력하세요 : ");

        String str = s.nextLine();

        // 만약에 입력한 String 이 "love " 일떄만 출력
        // 그 외의 값을 입력하면 "X" -- else 구문은 뺴도 됩니다.
        // 저는 알아보려고 일부러 넣었어요.

        if(str.equals("love")){
            System.out.println("I " + str + " you.");
        } else {
            System.out.println("X");
        }

        Scanner sc = new Scanner(System.in);


    }
}
