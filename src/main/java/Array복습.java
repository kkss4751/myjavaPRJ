import java.util.Scanner;

public class Array복습 {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();


        if (a < b){
            System.out.printf("<");
        }
        if (a > b) {
            System.out.printf(">");
        }
        if (a == b){
            System.out.printf("==");
        }

/*
        int a, b;
        int hap;

        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        hap = a+b;
        System.out.println(hap);
        hap = a-b;
        System.out.println(hap);
        hap = a*b;
        System.out.println(hap);
        hap = a/b;
        System.out.println(hap);
        hap = a%b;
        System.out.println(hap);
*/
        /*int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수 입력");
        a= sc.nextInt();
        System.out.println("두번째 수 입력");
        b= sc.nextInt();

        int hap = a + b;
        System.out.println(hap);*/

        /*int aa[] = {10, 20, 30};
        int count, size;

        count = aa.length;
        size = count * Integer.BYTES;

        System.out.printf("배열 aa[] 요소의 개수는 %d 이고 \n", count);
        System.out.printf("배열 aa[] 요소의 전체 크기는 %d 바이트 입니다", size);*/

        /*int aa[] = {10,20,30,40,50};
        int count, size;

        count = aa.length;
        size = count * Integer.BYTES;

        System.out.printf("배열 aa[]의 요소의 개수는 %d 개 입니다 \n", count);
        System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 바이트 입니다",size);*/

        /*Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int hap = 0, i;
        for (i = 0; i <=3; i++){
            System.out.printf("%d번째 숫자 : ", i + 1);
            aa[i] = s.nextInt();
        }
        hap = aa[0] + aa[1] + aa[2] + aa[3];
        System.out.printf("합계 ==> %d", hap);*/

        /*Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int hap;
        System.out.printf("첫번째 수 입력");
        aa[0] = s.nextInt();
        System.out.printf("두번째 수 입력");
        aa[1] = s.nextInt();
        System.out.printf("세번째 수 입력");
        aa[2] = s.nextInt();
        System.out.printf("네번째 수 입력");
        aa[3] = s.nextInt();

        hap = aa[0] + aa[1] + aa[2] + aa[3];
        System.out.println(hap);*/

/*
        ArrayList score = new ArrayList();

        score.add("100");
        score.add("90");
        score.add("80");
        score.add("70");

        for (int i = 0; i < score.size(); i++){
            System.out.println(score.get(i));
        }
*/

       /* ArrayList al = new ArrayList();
        al.add("one");
        al.add("two");
        al.add("three");
        for(int i = 0; i < al.size(); i++){
            System.out.println((al.get(i)));
        }

        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        int listSize = list.size();

        for(int i = 0; i < listSize; i++){
            System.out.println("이름 : " + list.get(i));
        }*/


        /*int score[] = new int[5];*/
    }
}
