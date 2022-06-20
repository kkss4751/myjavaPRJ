package polytec1_1;

import java.util.HashMap;
import java.util.Map;

public class Array복습 {
    public static void main(String[] args) {



        /*List<String>list = new ArrayList<>();
        list.add("김연");
        list.add("이정훈");
        list.add("김다운");
        list.add("김원집");

        int listSize = list.size();

        for (int i = 0; i<listSize; i++){
            System.out.println("이름:"+list.get(i));
        }
        for(String name : list){
            System.out.println("이름 : " + name);
        }
        list.forEach(name -> System.out.println("이름은 : " + name));

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String name = it.next();
            System.out.println("이름 :" + name);
        }*/



       /* List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        //이협건 정보 저장하기
        map.put("name", "이협건");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과");

        list.add(map); // 앞서 등록한 이협건 정보를 list에 저장하기

        map = null; // 메모리에 데이터르 지우는 방식으로 이협건 정보를 삭젷기

        //기존 map 객체의 값을 새롭게 생성하기
        map = new HashMap<>();

        //홍길동 정보 저장하기
        map.put("name", "홍길동");
        map.put("email", "gdhong@kopo.ac.kr");
        map.put("addr", "경기");
        map.put("dept", "시각디자인과");

        list.add(map); //앞서 등록한 홍길동 정보를 list에 젖아하기
        map = null; // 메모리에 데이터를 지우는 방식으로 이협건 정보를 삭제하기

        int listSize = list.size();

        for(int i = 0; i < listSize; i++){
            Map<String, String> rMap = list.get(i);
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("dept : " + rMap.get("dept"));
            System.out.println("---------------------------");
        }*/

        Map<String, String> map = new HashMap<>();

        map.put("name", "이협건" );
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("dept", "데이터분석과");

        System.out.println("----------------------------------");

        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));

        System.out.println("----------------------------------");

        /*List<String> pList = new ArrayList<>();
        pList.add("홍길동");
        pList.add("이협건");
        pList.add("고길동");
        pList.add("이정훈");

        Iterator<String> it = pList.iterator();
        while (it.hasNext()){
            String name = it.next();
            System.out.println("이름 : "+ name);
        }*/
//        pList.forEach(name -> System.out.println("name : " + name));
        /*for (String name : pList){
            System.out.println("이름 : " + name);
        }*/

       /* Scanner s = new Scanner(System.in);
        int aa[] = new int[4];
        int hap = 0;
        for (int i = 0; i <=3; i++ ){
            System.out.printf("%d번쨰 숫자를입력하세요 :", i+1);
            aa[i] = s.nextInt();
        }hap = aa[0] + aa[1] + aa[2] + aa[3];
        System.out.printf("합계 ==> %d", hap);*/

        /*ArrayList al = new ArrayList();
        al.add("one");
        al.add("two");
        al.add("tree");
        for (int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }
        List<String> list = new ArrayList<>();
        list.add("alex");
        list.add("benjamin");
        list.add("jorge");
        list.add("wapo");

        for (int i = 0; i < list.size(); i++){
            System.out.println("이름 :" + list.get(i));
        }

        int aa[] = {10,20,30,40,50};
        int count,size;
        count = aa.length;
        size = count*Integer.BYTES;
        System.out.printf("aa[]요소의 개수는 %d개 이고 \n",count);
        System.out.printf("aa[]요소의 크기는 %d바이트 입니다 \n", size);*/

        /*int a,b;
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
        }*/
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
