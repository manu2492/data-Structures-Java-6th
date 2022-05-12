/**
 *  Write a short Java method that takes an integer n and returns the sum of the
squares of all positive integers less than or equal to n.
 */
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(squaresSum(n));
    }

    public static int squaresSum (int n) {
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum2 += (i*i);
            }
        }
        return sum2;
    }
}
