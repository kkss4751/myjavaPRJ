package practica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p0621 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        map.put("name","이협건");
        map.put("dept", "데이터분석");

        list.add(map);
        map = null;

        map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("dept","정보보안");

        list.add(map);
        map = null;

/*        List<String> pList = new ArrayList<>();

        pList.add("홍길동");
        pList.add("이협건");
        pList.add("고길동");
        pList.add("둘리");

        pList.forEach(name -> System.out.println("name : " + name));*/







    }
}
