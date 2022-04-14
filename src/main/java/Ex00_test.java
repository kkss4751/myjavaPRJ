import java.util.Scanner;

public class Ex00_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hap = 0;

        for (int one = 1; one <= n; one++){
            if (one % 2 == 0) {
                hap = hap + one;
            }
        }
        System.out.println(hap);
    }
}
