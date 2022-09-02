package codeUp;

import java.util.Scanner;

public class CodeUp1027_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] date = sc.nextLine().split("\\.");

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        System.out.printf("%d-%d-%d",day,month,year);

    }
}
