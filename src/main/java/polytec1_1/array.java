package polytec1_1;

public class array {
    public static void main(String[] args) {
        /*String[] classGroup = {"최진혁","최유빈","한아름","이고잉"};
        System.out.println(classGroup[0]);
        System.out.println(classGroup[1]);
        System.out.println(classGroup[2]);
        System.out.println(classGroup[3]);*/

        /*String[] classGroup = new String[4];
        classGroup[0] = "최진혁";
        System.out.println(classGroup.length);     //classGroup 배열이 담겨있는 변수의이름
        classGroup[1] = "최유빈";                   //length 배열이 담을수있는원소의 개수
        System.out.println(classGroup.length);     //변수안에 몇개의 값을 수용할 수 있는지 알려줌
        classGroup[2] = "한아름";
        System.out.println(classGroup.length);
        classGroup[3 ] = "이고잉";
        System.out.println(classGroup.length);*/

        String[] members = {"choi","kim","lee"};
        for(int i = 0; i< members.length; i++){
            String member = members[1];
            System.out.println(member + "이 상담을 받았습니다.");
        }
    }
}