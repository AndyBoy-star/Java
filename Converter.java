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
