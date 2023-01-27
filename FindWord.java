import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        System.out.println("please type in the sentences");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println("Thanks, now enter the search letter");
        String searchTerm = scanner.nextLine();

        int wordPos = text.indexOf(searchTerm);
        int endOfWord = text.indexOf(" ", wordPos);
        String textUpToWord = text.substring(0, wordPos);
        int startOfWord = textUpToWord.lastIndexOf(" ");
        String word = text.substring(startOfWord,endOfWord);

        if(wordPos == -1){
            System.out.println("Letter is not in the sentence");
        }
        else{
            System.out.println("The word is " + word);
        }

        scanner.close();
    }
}
