import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isEven = false;

        while (isEven == false) {
            n -= 2;
            if (n == 0) {
                isEven = true;
                break;
            }
            else if ( n == -1) {
                isEven = false;
                break;
            }
        }
        System.out.println(isEven);
    }
} 