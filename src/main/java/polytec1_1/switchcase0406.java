package polytec1_1;

import java.util.Scanner;

public class switchcase0406 {
    public static void main(String[] args) {

        /*Scanner s = new Scanner(System.in);
        int a;

        System.out.println("1 ~ 4 중에 선택하세요 : ");
        a = s.nextInt();*/

// P179 switch ~ case /break;

        /*switch (a) {
            case 1:
                System.out.printf("1을 선택했다\n");
                break;
            case 2 :
                System.out.printf("2를 선택했다\n");
                break;
            case 3 :
                System.out.printf("3을 선택했다\n");
                break;
            case 4 :
                System.out.printf("4를 선택했다\n");
                break;
            default:a
                System.out.printf("이상한걸 선택했다. \n");
        }*/

        /*if (a == 1) {
            System.out.println("1을 선택했다.");

        } else if (a == 2) {
            System.out.println("2를 선택했다.");

        } else if (a == 3) {
            System.out.println("3을 선택했다.");

        } else if (a == 4) {
            System.out.println("4를 선택했다");

        } else System.out.println("이상한걸 선택했다");*/

        // P.194 단순 for문

/*
        int i;
        for (i = 0; i < 5; i++){
            System.out.printf("안녕하세요? 빙글빙글 for문을 공부중입니다.^^ \n");
        }
*/
/*        int i;
        for (i = 1; i <= 5; i++){
            System.out.printf("%d \n", i );
        }
        for ( i = 1; i < 6; i ++){
            System.out.println(i);
        }*/

        /*
        int hap = 0;
        int i;

        for ( i = 1; i <= 10; i++) {
            hap += i;
        }
        System.out.printf("1에서 10까지의 합 : %d \n", hap);*/
// p.205
        /*int fec = 1;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = a; i > 0; i--) {
            fec *= i;
        }
        System.out.printf("입력한갑의 !는? %d \n", fec);*/
// P.207 (6-10)
//        Scanner s = new Scanner(System.in);
//        int hap = 0;
//        // int i ;
//        int num;
//        System.out.printf("값 입력 :");
//        num = s.nextInt();
//
//        for(int i = 1; i <= num; i++){   //이렇게 해야 메모리를 적게 사용
//            hap = hap + i;
//        }
//        System.out.printf("1에서 %d까지의 합: %d \n", num,hap);
// p.208
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int i;
        int num1, num2, num3;

        System.out.printf("시작값 입력 : ");
        num1 = s.nextInt();
        System.out.printf("끝값 입력 :");
        num2 = s.nextInt();
        System.out.printf("증가값 입력 :");
        num3 = s.nextInt();

//시작값이 끝보다 큰 수가 들어오면, "시작값이 끝수보다 큽니다" 출력
        if (num1 > num2) {
            System.out.println("시작값이 끝수보다 큽니다.");
        } else {
            for (i = num1; i < num2; i = i + num3) {
                hap = hap + i;

            }
            System.out.printf("%d에서 %d까지 %d증가한 값의 합 : %d \n", num1, num2, num3, hap);
        }
    }
}
