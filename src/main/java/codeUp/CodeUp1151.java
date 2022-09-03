package codeUp;

import java.util.Scanner;

/** 10보다 작은 수 **/
public class CodeUp1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i = Integer.parseInt(str);

        if (i < 10){
            System.out.println("small");
        }else {
            System.out.println("");
        }


    }
}
