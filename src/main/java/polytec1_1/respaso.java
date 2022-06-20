package polytec1_1;

public class respaso {
    public static void main(String[] args) {
//        System.out.println("hello my first java");
/*
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 계산할 값 입력-->");
        int a = sc.nextInt();
        System.out.println("두번째 계산할 값 입력-->");
        int b = sc.nextInt();
        System.out.println("세번째 계산할 값 입력-->");
        int c = sc.nextInt();
        System.out.println("네번째 계산할 값 입력-->");
        int d = sc.nextInt();

        result = a+b+c+d;
        System.out.println(result);
*/
/*
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 계산할 값을 입력하세요");
        int a = sc.nextInt();
        System.out.println("<1>덧셈,<2>뺄셈,<3>곱셈,<4>나눗셈");
        int b = sc.nextInt();
        System.out.println("두번째 계산할 값을 입력하세요");
        int c = sc.nextInt();

        if ( b == 1) {
            result = a + c;
            System.out.println(a + "+" + b + "=" + result);
        }else if ( b == 2) {
            result = a - c;
            System.out.println(a + "-" + b + "=" + result);
        }else if ( b == 3) {
            result = a * c;
            System.out.println(a + "x" + b + "=" + result);
        }else {
            result = a / c;
            System.out.println(a + "/" + b + "=" + result);
        }*/
/*
        Scanner sc= new Scanner(System.in);
        System.out.printf("숫자를 입력하세요");
        int a = sc.nextInt();

        if(((a % 3 == 0) && (a % 5 == 0))) {
            System.out.printf("3과 5의 배수입니다\n");
        }else if ( a % 3 == 0) {
            System.out.printf("3의 배수입니다");
        }else if ( a % 5 == 0) {
            System.out.printf("5의 배수입니다");
        }else System.out.printf("잘못입력하셨습니다.");
*/
        /*Scanner sc = new Scanner(System.in);
        System.out.printf("출력할 단 입력");
        int dan = sc.nextInt();

        int i =1;
        while ( i <10) {
            System.out.printf("%d x %d = %d\n", dan , i, dan*i);
            i++;*/
        /*
        for( int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n",dan,i,dan*i);
        }*/

        /*Scanner s = new Scanner(System.in);
        System.out.printf("출력할 값을 입력하시오");
        int dan = s.nextInt();
        System.out.printf("어디까지 곱할것인가");
        int f = s.nextInt();

        for( int i = dan; i <= dan; i++) {
            for ( int n = 1; n <= f; n++) {
                System.out.printf("%d x %d = %d\n",dan,n,dan*n);
            }
        }*/
        /*Scanner s = new Scanner(System.in);
        int b= s.nextInt();

        for(int line = 1; line <= b; line ++) {
            for (int star = 1; star <= line; star++ ){
                System.out.printf("*");
            }
            System.out.println("");
        }*/
        /*for(int line = 5; line >= 1; line--) {
            for ( int star = 1; star <= line; star++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }*/
        /*Scanner s = new Scanner(System.in);
        System.out.printf("숫자 입력");
        int a = s.nextInt();

        for( int b = a; b >= 1; b--){
            for ( int c = 1; c <= b; c++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }*/
        /*int hap = 0;

        for (int i = 50; i < 101; i++) {
            if ( i % 3 == 0 || i % 7== 0 || i% 11== 0) {
                hap += 0;
            }
            hap += i;
        }*/
       /* for(int i = 3; i < 9; i++) {
            for(int j = 2; j < 7; j++) {
                System.out.println(i + "X" + j + "=" + (i*j));
            }
            System.out.println();
        }*/

/*                Scanner input = new Scanner(System.in);
                int x;
                int y;
                int sum;

                System.out.print("첫번째 숫자를 입력하시오 : ");
                x = input.nextInt();

                System.out.print("두번째 숫자를 입력하시오 : ");
                y = input.nextInt();

                sum = x + y;

                System.out.println(sum);
    */
       /* int month = 8;
        String monthString = "";
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);*/
       /* Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요");
        int a = sc.nextInt();

        if( a % 3 == 0 && a % 5 == 0){
            System.out.println("3과 5의 배수입니다,");
        }else if ( a % 3 == 0) {
            System.out.println("3의 배수입니다");
        }else if ( a % 5 == 0) {
            System.out.println("5의 배수입니다");
        }else System.out.println("아무것도 아닙니다");*/

        /*Scanner ss= new Scanner(System.in);
        System.out.println("숫자르 입력하세요");
        int b = ss.nextInt();
        int hap = 0;

        for (int c = 1; c <= b; c++){
            if ( c % 3 == 0 || c % 5 == 0) {
            }else {
                hap += c;
            }
        }
        System.out.println(hap);*/

     /*   for( int a = 2; a <= 9; a++){
            for (int b = 2; b <= 8; b++ ){
                System.out.printf("%d x %d = %d ",b, a, b*a);
            }
            System.out.println("");
        }*/
        for ( int a = 2; a <=6; a++){
            for ( int dan = 3; dan <= 8; dan++){
                System.out.printf ( "%d X %d = %d ", dan, a, dan*a);
            }
            System.out.println ("");
        }
        /*int hap = 0;
        for ( int a = 50; a <= 100; a++) {
            if (a % 3 == 0 || a % 7 == 0 || a % 11 == 0) {
            } else {
                hap += a;
            }
        }
            System.out.printf("%d",hap);*/


    }
}