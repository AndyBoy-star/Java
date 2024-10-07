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


import java.util.Scanner;

public class Converter {
    static double convertToUsd(double eur){

        return eur * 1.15;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in euro");
        double eur = sc.nextDouble();
        double usd = convertToUsd(eur);
        System.out.println("Dollar  amount: " + usd);
    }
}
