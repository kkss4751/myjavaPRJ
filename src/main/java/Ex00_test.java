import java.util.Scanner;

public class Ex00_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int a = 1; a <= n; a++){
            System.out.print(a);
            System.out.printf(" ");
        }
    }
}
