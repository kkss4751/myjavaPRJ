import java.util.ArrayList;
import java.util.List;

public class Array복습 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
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
        }


        /*int score[] = new int[5];*/
    }
}
