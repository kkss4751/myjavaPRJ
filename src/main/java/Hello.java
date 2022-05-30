import java.util.Scanner;

public class Hello {

        public static int coffee_machine(int button) {
            System.out.printf("\n# 1.(자동으로) 뜨거운 물을 준비한다\n");
            System.out.printf("\n# 2.(자동으로) 종이컵을 준비한다\n");

            switch (button) {
                case 1:
                    System.out.printf("# 3.(자동으로)보통커피를 탄다\n");
                    break;
                case 2:
                    System.out.printf("# 3.(자동으로)설탕커피를 탄다\n");
                    break;
                case 3:
                    System.out.printf("# 3.(자동으로)블랙커피를 탄다\n");
                    break;
                default:
                    System.out.printf("# 3.(자동으로)아무거나 탄다\n");
                    break;
            }
            System.out.printf("# 4.(자동으로) 물을 붓는다\n");
            System.out.printf("# 5.(자동으로) 스푼으로 저어서 녹인다\n\n");

            return 0;
        }

        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);

            int coffee;
            int ret;

            System.out.printf("어떤 커피 드릴까요? (1:보통, 2:설탕, 3:블랙)");
            coffee = s.nextInt();

            ret=coffee_machine(coffee);


            System.out.printf("손님 ~ 커피 여기 있습니다. \n");
        }

        {

            System.out.println("----------------------------------------------------------------");

   /* public static void main(String[] args) {
        int i = 1, j = 10;

        int k = sum(i, j);
        System.out.println("k : " + k);

        int m = sum(10, 11);
        System.out.println("m : " + m);
    }


        public static int sum(int i1, int i2){
            int sum = 0;
            for (int i = i1; i <= i2; i++)
                sum += i;

            return sum;
        }*/


            System.out.println("-----------------------------------------------------------------");

        /*String str1 = "Java Programming";
        String str2 = "Java Programming";
        String str3 = new String("Java Programming");

        System.out.println("문자열1 == 문자열2 결과 : \t " + (str1 == str2));
        System.out.println("문자열1.equals(문자열2) 결과 : " + str1.equals(str2));
        System.out.println("문자열1==문자열3 결과 : \t " + (str1 == str3));
        System.out.println("문자열1.equals(문자열3) 결과 : " + str1.equals(str3));

        System.out.println("문자열1과 문자열2가 다른지 비교 compareTo 안쓰고, 이렇게 함 : " + !str1.equals(str2));*/

            System.out.println("-----------------------------------------------------------------");

        /*String str1 = "Java Programming";
        String str2 = "Java IT CookBook";

        System.out.println("원 문자열1 ==> [" + str1 + "]");
        System.out.println("원 문자열1 ==> [" + str2 + "]");

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("Java"));


        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("Java"));
        System.out.println(str1.indexOf("Java"));
        System.out.println(str1.indexOf("Java") > -1);*/


            System.out.println("---------------------------------------------------------------");



            /** Access_log 서버 로그 샘플 // 시작
             *
             * 다음주 쪽지시험에도 냄. 공부하기
             *
             ** 0525 쪽지시험 1번문제 **/
            String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

            int pos = log.indexOf(" ");
            System.out.println("pos : "+ pos);

            String ip = log.substring(0, pos);
            System.out.println("ip : "+ ip);

            String[] item = log.split(" "); //
            System.out.println("ip :"+item[0]);

            /** 0525 쪽지시험 2번문제 **/

            System.out.println("time : "+ item[3]);
            //결과값이 time : [11/Jun/2012:22:12:32 나오기 때문에 "[" 제거
            String time = item[3].substring(1);

            System.out.println("time : "+ time);
            /** 쪽지시험 ^ **/



       /* Scanner s = new Scanner(System.in);
        String str;

        System.out.println("문자열 입력");
        str=s.nextLine();*/

        /*Scanner s = new Scanner(System.in);
        String str;
        System.out.printf("문자열 입력");
        str = s.nextLine();

        int len;
        len = str.length();

        System.out.printf("문자열 : %s \n", str);
        System.out.printf("문자열 길이 : %d \n",len);*/


        /*Scanner s = new Scanner(System.in);
        String str;
        System.out.print("문자열 입력 ==>");
        str = s.nextLine();

        System.out.print("출력문자열==>");
        for (int i = 0; i<str.length();i++){
            if (str.charAt(i)=='0')
                System.out.printf("%c",'$');
            else
                System.out.printf("%c",str.charAt(i));
        }*/

        /*String str = "it cookbook. java";
        int len;
        len = str.length();
        System.out.printf("문자열 : %s \n", str);
        System.out.printf("문자열 길이 : %d \n",len);*/

        /*List<Map<String,String>> list = new ArrayList<>();

        Map<String,String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("email", "kkss@namev.com");*/
        }
    }

       /* int a,b,c,d;
        int result;

        Scanner s = new Scanner(System.in);
        System.out.println("첫번쨰 입력값");
        a=s.nextInt();

        System.out.println("두번쨰 입력값");
        b=s.nextInt();

        System.out.println("세번쨰 입력값");
        c=s.nextInt();

        System.out.println("네번쨰 입력값");
        d=s.nextInt();

        result = a+b+c+d;
        System.out.println(a+"+"+b+"+"+c+"+"+d+"="+result);


    }
}*/
       /* Scanner s = new Scanner(System.in);
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
}*/
