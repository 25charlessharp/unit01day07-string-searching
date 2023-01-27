import java.util.Scanner;
public class FindTagContents {
    public static void main(String[] args) {
        System.out.println("Please type in the HTML you want to search within");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println("Thanks, now enter the search term");
        String searchTerm = scanner.nextLine();

        int textPos = text.indexOf("<" + searchTerm + ">");
        int closingTagStartPos = text.indexOf(">", textPos);
        int closingTagEndPos = text.indexOf("</", closingTagStartPos);

        System.out.println(textPos);

        if (textPos == -1){
            System.out.println("There is no " + searchTerm + " tags entered in the HTML");
        }
        else{
            System.out.print("The text you entered was within a ");
            System.out.print(text.substring(closingTagStartPos+1, closingTagEndPos));
            System.out.println(" tag");
        }

        

        scanner.close();



    }
}