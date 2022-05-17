public class Test001 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) { // 행  1 2 3 총 3번 반복 = 3행
                                            // 대입숫자  출력    출력횟수
            for (int j = 1; j<=3-i; j++){  //  1       1 2     2
             System.out.print(" ");        //  2       1       1
                                          //   3
          }
            for (int j = 1; j <= i*2-1; j++) { //  1      1           1
                System.out.print("*");         //  2      1 2 3       3
                                               //  3      1 2 3 4 5   5
            }
            System.out.println();
        }



        for (int i=2; i>0 ; i--) { //  총 2  1 번 반복
            for (int j=2; j >=i; j--) {   //
                System.out.print(" ");
            }
            for (int j=1; j<=i*2-1 ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }




    }
}


