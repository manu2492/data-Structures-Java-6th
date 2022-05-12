import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println(isMultiple(n, m));
        
    }
    public static boolean isMultiple (long n, long m) {
        boolean yes1 = false;
        if (m % n == 0) {
            yes1 = true;
        }
        else if (n % m == 0) {
            yes1 = true;
        }
        return yes1;
    }
}
