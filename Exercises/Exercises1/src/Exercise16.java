/**Write a short Java method that takes an integer n and returns the sum of all the
odd positive integers less than or equal to n. */

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println(sum1(n));   
    }

    public static int sum1 (int n) {
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum2 += i;
            }
        }
        return sum2;
    }
}
