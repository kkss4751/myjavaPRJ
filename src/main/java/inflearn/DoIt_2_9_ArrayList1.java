package inflearn;

public class DoIt_2_9_ArrayList1 {
    /**
     * 배열을 왜 써야 할까?
     * <p>
     * ArrayList 배열의 기능을 제공하는 클래스
     * <p>
     * 배열을 쓰다보면 여러가지 불편한 점들이 있을텐데
     * 그 불편한 일들을 ArrayList를 사용하면 훨씬 편하게 사용할 수 있음음
     * <p>
     * ArrayList 란 JDK 에서 제공하는 Class
     * <p>
     * 배열은 동일한 자료가 연속적으로 순차적으로 있는 구조
     * <p>
     * 언제쓰냐?
     * 학교에 학생이 10명있다라고하면 10명의 학생을 관리하기 위해
     * 학번, 학년 등을 관리하기위해 변수를 선언해야하는걸 하나씩 선언하지않고
     * 배열하나에 값을 하나씩 넣어줌
     * <p>
     * 4byte
     * 물리적으로도 연속, 논리적으로도 연속되어 있는 자료구조
     * <p>
     * 5칸의 int 형 배열으 만들면 총 크기는 20byte
     * <p>
     * 배열을 몇개를 쓸지 선언하고 시작해야함.
     * 고정된 길이 fixed-length로 시작함 (연속된 자료구조)
     * <p>
     * 배열은 중간에 자료가 비면 안됨.
     * a,b,c 가 있는데 b를 생략하고 갈 수 없음
     * <p>
     * b를 지울시 비워둘수 없음.
     * c를 한칸 앞으로 가져와야함
     **/

/*
    배열 선언하기
    자료형[] 배열이름 = new 자료형[개수];
    int [] arr = new int[10];

    자료형 배열이름 [] = new 자료형[개수];
    int arr [] = new int[10];

 */

/*  배열 초기화
    배열은 선언과 동시에 초기화 할 수 있음
    배열을 초기화 할 때는 배열의 개수를 명시하지 않음

    int[] studentIDs = new int [ ] {101,102,103}; //개수는 생략
    int[] studentIDs = new int [3] {101,102,103}; //오류 발생
    int[] studentIDs = {101,102,103}; // int형 요소가 3개인 배열 생성

    아무런 초기화 값이 없이 선언만 한 경우, 정수는 0, 실수는 0, 객체배열은 null로 초기화됨

*/
    //int[] numbers = new int[10]; // 10칸짜리 만듬
    // int number [] = new int[10]; 이렇게도 만들수 있음
    public static void main(String[] args) {


        int [] numbers = new int[] {0,1,2};
        System.out.println( numbers.length); // length 속성 = 배열의 길이

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[1]);

/*
        int [] numbers1 = new int[3];
        numbers1[0] = 1; // 배열은 0부터 샘
        numbers1[1] = 2;
        numbers1[2] = 3;

        for( int i = 0; i < numbers1.length; i++){
            System.out.println(numbers1[i]);
*/
        }
    }
}
