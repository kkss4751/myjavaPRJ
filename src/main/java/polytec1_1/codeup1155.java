package polytec1_1;

import java.util.Scanner;

public class codeup1155 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a % 7 == 0 ){
            System.out.println("multiple");
        }else {
            System.out.println("not multiple");
        }
    }
}
