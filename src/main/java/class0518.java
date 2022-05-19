public class class0518 {
    public static void main(String[] args) {



        /** toUpperCase(), toLowerCase(), trim() **/

        String str = " 한글 ABCD efgh ";

        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println("대문자로 ==> [" + str.toUpperCase() + "]");
        System.out.println("소문자로 ==> [" + str.toLowerCase() + "]");
        System.out.println("공백제거 ==> [" + str.trim() + "]");    // 가운데 공백말고 앞뒤 공백만 제거.

        System.out.println("전체공백제거 ==> [" + str.replaceAll(" ",""));

        /** replace() , substring() **/

        /*Scanner s = new Scanner(System.in);
        String str, strRep, strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str = s.nextLine();

        strRep = str.replace(" ","$");
        strSub = str.substring(3,8);
        strAry = str.split(" ");

        System.out.println("입력 문자열 ==> " + str);
        System.out.println("바꾼 문자열 ==> " + strRep);
        System.out.println("일부 문자열 ==> " + strSub);
        for (int i = 0; i < strAry.length; i++)
            System.out.println("분리한 문자열" + i + "==>" + strAry[i]);*/


        /** indexOf() , lastIndexOF() **/

       /* String sr = "Java를 공부하는 중, Java는 재밌어요.^^";
        System.out.println("문자열 ==> " + str);

        System.out.print("제일 처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java"));
        System.out.print("마지막에 나오는 Java 위치 ==> ");
        System.out.println(str.lastIndexOf("Java"));*/


        /** starsWith() , endsWith() **/

        /*Scanner s = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==>");
        str = s.nextLine();

        System.out.print("출력 문자열==>");

        if(!str.startsWith("("))
            System.out.printf("(");

        for (int i = 0; i < str.length(); i++)
            System.out.printf("%c", str.charAt(i));

        if (!str.endsWith(")"))
            System.out.printf(")");

        System.out.printf(str);

//        if (!str.equals(")")){
//            System.out.printf(")");
//        } */



        /*String str = "IT CookBook. Java";
        int len;

        len = str.length();

        System.out.printf("문자열 : %s \n", str);
        System.out.printf("문자열 길이 : %d \n", len);*/



        /** HashMap **/

        /*List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        //데이터 추가
        map.put("name", "이협건");
        map.put("addr", "서울");
        map.put("dept", "데이터분석");
        map.put("email", "hglee@naver.com");

        list.add(map); // 등록한 정보 list에 저장

        map = null;    //메모리에 데이터를 지우는 방식으로 정보 삭제하기

        //map 객체의 값을 새롭게 생성하기
        map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("addr", "경기");
        map.put("dept", "정보보안");

        list.add(map); // 홍길동 정보 list에 저장

        map = null; // 메모리에 데이터를 지우는 방식으로 정보를를 삭제하기 // list에는 저장됨

        list.forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("dept : " + rMap.get("dept"));
            System.out.println("----------------------------");
        });*/

    }
}
