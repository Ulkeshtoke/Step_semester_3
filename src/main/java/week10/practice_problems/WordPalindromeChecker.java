import java.util.Scanner;

public class WordPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        StringBuilder reversed = new StringBuilder(word);
        reversed.reverse();

        if (word.equalsIgnoreCase(reversed.toString())) {
            System.out.println(reversed + " - palindrome");
        } else {
            System.out.println(reversed + " - not a palindrome");
        }

        sc.close();
    }
}