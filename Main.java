import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordOne = scanner.nextLine();
        String wordTwo = scanner.nextLine();

        if ((wordOne.length() + wordTwo.length()) % 2 != 0 ) {
            System.out.println("Invalid input");
        }
        System.out.println((wordOne.substring(0, wordOne.length()/2)) + (wordTwo.substring(wordTwo.length()/2)));

    }
}