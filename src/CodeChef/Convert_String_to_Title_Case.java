package CodeChef;

import java.util.Scanner;

public class Convert_String_to_Title_Case {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number ");
        int T = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        for (int i = 0; i < T; i++) {
            System.out.print("Enter a string : ");
            String S = scanner.nextLine();
            System.out.println(convertToTitleCase(S));
        }

        scanner.close();
    }
    public static String convertToTitleCase(String S) {

        String[] words = S.split(" ");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (word.equals(word.toUpperCase())) {
                // If the word is entirely in uppercase, keep it as is (acronym)
                titleCase.append(word);
            } else {
                // Otherwise, convert the first letter to uppercase and the rest to lowercase
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase());
            }
            titleCase.append(" ");
        }

        // Remove the trailing space
        return titleCase.toString().trim();
    }
}
