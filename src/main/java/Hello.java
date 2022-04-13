import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int i;
        int num1,num2,num3;

        System.out.println("시작값 입력 :");
        num1 = s.nextInt();
        System.out.println("끝값 입력");
        num2 = s.nextInt();
        System.out.println("증가값 입력");
        num3 = s.nextInt();

        for( i = num1; i <= num2; i = i + num3){
            hap = hap + i;
        }
        System.out.println(hap);
    }
}
