package codeUp;

import java.util.Scanner;

public class CodeUp1075_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        // a 가 아니면 a-- 를 하고 출력해라
        while (a != 0) {
            a--;
            System.out.println(a);
        }
    }
}
