import java.util.Scanner;

public class class13 {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        int listSize = list.size();

        for ( int i = 0; i < listSize; i++){
            System.out.println("이름 :" + list.get(i));
        }*/

        /*
        int aa[] = {10, 20, 30, 40, 50};
        int count, size;

        count = aa.length;
        size = count * Integer.BYTES;

        System.out.printf("배열 aa[]의 요소의 개수는 %d 개 입니다.\n", count);
        System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 바이트입니다.\n", size);

        for ( int i = 0; i < aa.length; i++) {
            System.out.println("aa[" + i + "] :" + aa[i]);
        }*/


        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int hap=0;

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d번째 숫자를 입력하세요", i + 1);
            aa[i] = s.nextInt();
            System.out.println(aa[i]);
        }
        hap = aa[0] + aa[1] + aa[2] + aa[3];
        System.out.println("합계 : " + hap);
    }

//        System.out.printf("1번째 숫자를 입력하세요");
//        aa[0] = s.nextInt();
//        System.out.printf("2번째 숫자를 입력하세요");
//        aa[1] = s.nextInt();
//        System.out.printf("3번째 숫자를 입력하세요");
//        aa[2] = s.nextInt();
//        System.out.printf("4번째 숫자를 입력하세요");
//        aa[3] = s.nextInt();
//
//        hap = aa[0] + aa[1] + aa[2] + aa[3];
//
//        System.out.printf("합계 ==> %d \n", hap);
}
