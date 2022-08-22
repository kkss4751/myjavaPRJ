package JavaJungsuk;

import java.util.Scanner;

public class P145_FlowEx5 {
    /* 중첩 if문으로 점수입력받아 학점 출력하기 */
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력해주세요 >> ");

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt(); // 화면을 통해 입력받은 점수를 score에 저장

        System.out.printf("당신의 점수는 %d 입니다.\n",score);

        if (score >= 90) {      //score 가 90보다 같거나 크면 A학점
            grade = 'A';
            if (score >= 98) {     // 90점 이상 중에서도 98점 이상은 A+
                opt = '+';
            }else if (score < 94) { //90점 이상 94점 미만은 A-
                opt = '-';
            }
        }else if (score >= 80) {    // score 80점보다 같거나 크면 B학점
            grade = 'B';
            if (score >= 88) {      // 80학점 중에서 88이상은 B+
                opt = '+';
            }else if (score < 84) { // 80학점 중에서 84점 미만은 B-
                opt = '-';
            }
        } else {                //나머지는 C학점
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.\n", grade, opt);

    }
}
