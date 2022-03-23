public class veintedelmarzo {
    public static void main(String[] args) {
                                       // 문자열 사용 예
        /*

        String str1 = "IT CookBook 입니다.";
        String str2 = "10";
        String str3 = "20";

        str1 = "Java 입니다.";

        System.out.printf("%s \n", str1);
        System.out.printf("%s \n", str2 + str3); // 문자 + 문자로 인식한다.

        */

                                     // 산술 연산자의 사용 예
       /*

        int a, b = 5, c = 3;

        a = b + c;
        System.out.printf("%d + %d = %d \n", b, c, a);

        a = b - c;
        System.out.printf("%d - %d = %d \n", b, c, a);

        a = b * c;
        System.out.printf("%d * %d = %d \n", b, c, a);

        a = b / c;
        System.out.printf("%d / %d = %d \n", b, c, a);

        a = b % c;
        System.out.printf("%d %% %d = %d \n", b, c, a); //%는 나머지값

        */


                                   // 우선순위와 강제 형 변환의 예
        /*

        int a = 2, b = 3, c = 4;
        int result1, mok, namugi;
        float result2;

        result1 = a + b - c;
        System.out.printf("%d + %d - %d = %d \n", a, b, c, result1);
        result1 = a + b * c;
        System.out.printf("%d + %d * %d = %d \n", a, b, c, result1);
        result2 = a * b /(float) c;
        System.out.printf("%d * %d / %d = %f \n", a, b, c, result2);
        mok = c / b;
        System.out.printf("%d / %d 의 몫은 %d \n", c, b, mok);
        namugi = c % b;
        System.out.printf("%d / %d 의 나머지는 %d \n", c, b, namugi);

        */

                                          // 대입 연산자와 증감 연산자
        /*

        int a = 10;

        a ++ ;    // a = a + 1
        System.out.printf("a ++ ==> %d \n", a);

        a -- ;    // a = a - 1
        System.out.printf("a -- ==> %d \n", a);

        a += 5;    // a = a + 5
        System.out.printf("a += 5 ==> %d \n", a);

        a -= 5;    // a = a -
        System.out.printf("a -= 5 ==> %d \n", a);

        a *= 5;   // a = a * 5
        System.out.printf("a *= 5 ==> %d \n", a);

        a /= 5;    // a = a / 5
        System.out.printf("a /= 5 ==> %d \n", a);

        a %= 5 ;    // a = a % 5
        System.out.printf("a %%= 5 ==> %d \n", a);

         */

                                        // 증감 연산자 사용 예
        /*

        int a = 10, b;

        b = a++;  // a + 하기전에 b에 먼저 a를 저장하고, a + 1실행
        System.out.printf("%d \n", b);

        b = ++a;   // a + 1 먼저하고 b에 값을 저장
        System.out.printf("%d \n", b);

         */

                                   // 관계 연산자 사용 예
                                   //(관계 연산자 return 타입은 boolean 이다.)

       /*


        int a = 100, b = 200;

        System.out.printf("%d == %d 는 %s 이다. \n", a, b, a == b );
        System.out.printf("%d != %d 는 %s 이다.\n", a, b, a != b);
        System.out.printf("%d > %d 는 %s 이다. \n", a, b, a > b);
        System.out.printf("%d < %d 는 %s 이다.\n", a, b, a < b);
        System.out.printf("%d >= %d 는 %s 이다.\n", a, b, a >= b);
        System.out.printf("%d <= %d 는 %s 이다.\n", a, b, a <= b);

        System.out.printf("%d = %d 는 %s 이다. \n", a, b, a = b);

        */
    }
}
