package palindrome;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
         String s = scanner.nextLine();
        System.out.println("Ignoring non-alphanumeric characters, \nis " + s + " a palindrome? " + isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        String s1 = filter(s);
        String s2 = reverse(s);
        return s2.equals(s1);
    }

    private static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();


    }

    private static String filter(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            if (Character.isLetterOrDigit(s.charAt(i)));
            stringBuilder.append(s.charAt(i));

        }
        return stringBuilder.toString();
    }
}
