package polytec1_1;

import lombok.Getter;
import lombok.Setter;

@Setter //역할은 이게
@Getter
public class class0615_3 {

    /** private 선언 / 나만 소유한게 private / 이건 나, class0615_3 클래스 밖에 쓸수없음
     *
     * alt + insert --> Getter and Setter 라는 개발 패턴 으로 외부에서 쓸수 있게 만들어준다
     *
     *
     *
     * **/

    private String test;                        // 여기에 테스트는
    private int score;


/*    //alt + insert --> Getter and Setter


    public String getTest() {
        return test;
    }

    public void setTest(String test) {           // 여기에 test 는 파라미터의 test
        this.test = test;                        // this = class class0615_3
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
*/

}
