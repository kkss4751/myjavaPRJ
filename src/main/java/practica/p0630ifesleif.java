package practica;

import java.util.Scanner;

public class p0630ifesleif {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = ' ';

        System.out.print("점수를 입력해주세요.!");

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt(); //화면을 통해 입력받음 점수를 score에 저장

        System.out.printf("당신의 점수는 %d입니다.\n",score);

        if (score >= 90){
            grade = 'A';
            if(score >= 98){
                opt = '+';
            }else if (score < 94){
                opt = '-';
            }
        }else if (score >= 80){
            grade = 'B';
            if (score >= 88){
                opt = '+';
            }else if (score < 94){
                opt = '-';
            }
        }else {
            grade = 'c';
        }
        System.out.printf("당신의 학점은 %c%c입니다.\n",grade,opt);


/*
        int input;

        System.out.print("숫자를 하나 입력하세요.");
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
        input = Integer.parseInt(tmp); // 입력받은 문자열(tmp)를 숫자로 변환

       */
/* if(input == 0)
            System.out.println("입력하신 숫자는 0이 아닙니다,");
            System.out.printf("입력하신 숫자는 %d 입니다.", input);*//*


        if (input == 0)
            System.out.println("입력하신 숫자는 0입니다.");
        else
            System.out.println("입력하신 숫자는 0이 아닙니다");
*/
    }
}
