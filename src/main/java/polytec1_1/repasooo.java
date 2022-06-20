package polytec1_1;

public class repasooo {
    public static void main(String[] args) {
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        int pos = log.indexOf(" ");
        System.out.println("pos : "+ pos); // indexOf 는 특정문자열의 위치, (" ")즉 공백의 위치

        String ip = log.substring(0, pos); // substring 일부 문자열을 출력, 즉 pos변수의 0번째 문자열 출력
        System.out.println("ip : "+ ip);

        String[] item = log.split(" "); // split 문자열을 공백으로 분리, 0번째 출력
        System.out.println("ip :"+item[0]);

        /** 0525 쪽지시험 2번문제 **/

        System.out.println("time : "+ item[3]);
        //결과값이 time : [11/Jun/2012:22:12:32 나오기 때문에 "[" 제거
        String time = item[3].substring(1); //3번째에 1번부터 출력, 즉 [ 제거

        System.out.println("time : "+ time);
        /** 쪽지시험 ^ **/
    }
}
