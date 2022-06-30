package JAVAAREGLA;

public class variable1 {
    public static void main(String[] args) {
        //두변수의 값 교환하기

        int x= 10, y= 20;
        int tmp; // 임시저장소를 만들어준다
        System.out.println("x:"+x+" y:"+y);

        tmp = x;
        x = 20;
        y = 10;
        System.out.println("x:"+x+" y:"+y);
    }
}
