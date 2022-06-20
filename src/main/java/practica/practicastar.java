package practica;

public class practicastar {
    public static void main(String[] args) {
        for(int j = 0; j < 5; j++){
            for ( int i = 0; i < 4-j; i++){
                System.out.printf(" ");
            }
            for (int i = 0; i < 2*i+1; i++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
