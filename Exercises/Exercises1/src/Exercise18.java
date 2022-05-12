/**Write a short Java method that counts the number of vowels in a given character
string. */

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(countVowels(s));
        
    }
    public static int countVowels (String s) {
        String s2 = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || 
            s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u' ) {
                count += 1;
            }
        }
        return count;
    }
}
