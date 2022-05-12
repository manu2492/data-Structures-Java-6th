/*Write a short Java method that takes an integer n and returns the sum of all
positive integers less than or equal to n.*/

import java.util.Scanner;

public class Exercise15 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            suma += i;    
        }
        System.out.println(suma);
   } 
}
