import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str = new String("I study Basic Java!");


    }


    public static void runStringMethod(String str) {
        System.out.println(str.charAt(str.length() - 2));
        System.out.println(str.contains("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.substring(str.length() - 5, str.length() - 1));
    }
}