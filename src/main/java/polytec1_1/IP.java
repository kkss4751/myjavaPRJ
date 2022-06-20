package polytec1_1;

public class IP {
    public static void main(String[] args) {
        //리턴타입이 없으면 void
        //void 가 없으면 무조건 return이 들어가야 한다.

        /** Access_log 서버 로그 샘플 // 시작
         *
         * 다음주 쪽지시험에도 냄. 공부하기
         *
         ** 0525 쪽지시험 1번문제 **/
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        String ipp = log.substring(0,log.indexOf(" "));
        System.out.println("IP : " + ipp);


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


        String timee = log.substring(log.indexOf("[") + 1, log.indexOf(" +"));
        System.out.println("TIME : "+ timee);
        /** 쪽지시험 ^ **/



        // static 쓰고 안쓰고는 메모리에 올라가고 안올라가고 차이
        // static 을 안쓰고 메모리에 올라가려면 new 를 쓴다

/*
        public static int sum(int num1, int num2){
            return num1 + num2;
        }
*/

    }
}
