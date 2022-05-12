/**Write a short Java method that uses a StringBuilder instance to remove all the
punctuation from a string s storing a sentence, for example, transforming the
string "Let’s try, Mike!" to "Lets try Mike". */

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);
    }
}
