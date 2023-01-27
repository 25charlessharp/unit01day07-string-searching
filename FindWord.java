import java.util.Scanner;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        System.out.println("please type in the sentences");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println("Thanks, now enter the search word");
        String searchTerm = scanner.nextLine();

        int wordPos = text.indexOf(searchTerm);
        int endOfSentence = text.indexOf(".", wordPos);
        String textUpToWord = text.substring(0, wordPos);
        int startOfSentence = textUpToWord.lastIndexOf(".");
        System.out.println("the word " + searchTerm + " occurs in sentence");
        System.out.println(text.subSequence(startOfSentence+2, endOfSentence+1));

        scanner.close();
    }
}
