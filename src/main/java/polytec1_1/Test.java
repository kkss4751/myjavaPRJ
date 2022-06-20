package polytec1_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

       /* int[] scores = {50, 70, 60, 30};

        System.out.println("scores[0] :" + scores[0]);
        System.out.println("scores[1] :" + scores[1]);
        System.out.println("scores[2] :" + scores[2]);
        System.out.println("scores[3] :" + scores[3]);

        int sum = 0;
        for( int i = 0; i < 4; i++){
            sum += scores[i];
        }
        System.out.println("총합 :" + sum);

        double avg = (double) sum / 4;
        System.out.printf("평균"+ avg);*/

        Scanner sc = new Scanner(System.in);
        int[] scores = new int[4];
        int hap;

        System.out.println("첫번째 숫자");
        scores[0] = sc.nextInt();
        System.out.println("두번째 숫자");
        scores[1] = sc.nextInt();
        System.out.println("세번째 숫자");
        scores[2] = sc.nextInt();
        System.out.println("네번째 숫자");
        scores[3] = sc.nextInt();

        hap = scores[0] + scores[1] + scores[2] + scores[3];
        System.out.printf("%d", hap);
    }
       /* int a,b,c,d;

        Scanner sc = new Scanner(System.in);

        System.out.printf("1번째 값 입력");
        a = sc.nextInt();
        System.out.printf("2번째 값 입력");
        b = sc.nextInt();
        System.out.printf("3번째 값 입력");
        c = sc.nextInt();
        System.out.printf("4번쨰 값 입력");
        d = sc.nextInt();

        System.out.printf("%d + %d + %d + %d = %d\n", a, b, c, d, a+b+c+d);
*/
}
