package polytec1_1;

import java.util.Scanner;

public class codeup1156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
