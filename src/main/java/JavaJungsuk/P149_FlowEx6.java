package JavaJungsuk;

import java.util.Scanner;

public class P149_FlowEx6 {
    /* switch 문으로 숫자 입력받아 계절 출력하기 */
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요 >>");

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(); // 화면을 통해 입력받을 숫자 month에 저장

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
//            case 12: case 1: case 2: //default : 겨울
                System.out.println("현재의 계절은 겨울입니다.");
        }
        System.out.println("");

        /*위의 switch 문을 if문으로 바꿔보기*/

        System.out.printf("현재의 달을입력하세요>>>");
        Scanner scanner = new Scanner(System.in);
        int mes = scanner.nextInt();

        if(mes == 3 || mes == 4 || mes == 5){
            System.out.println("현재의 계절은 봄입니다.");
        } else if (mes == 6 || mes == 7 || mes == 8) {
            System.out.println("현재의 계절은 여름입니다.");
        } else if (mes == 9 || mes == 10 || mes == 11){
            System.out.println("현재의 계절은 가을입니다.");
        } //else if (mes == 12 || mes == 1 || mes == 2)
        else{
            System.out.println("현재의 계절은 겨울입니다.");
        }



    }
}

