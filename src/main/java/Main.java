import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        int result;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a % 2 == 0) {
            System.out.print("짝수");
        } else {
            System.out.print("홀수");
        }
        System.out.print("+");
        if (b % 2 == 1) {
            System.out.print("홀수");
        } else {
            System.out.print("짝수");
        }
        System.out.print("=");
        //resut
        result = a+b;
        if ((a+b) % 2 == 0) {
            System.out.print("짝수");
        } else {
            System.out.print("홀수");
        }
    }
}