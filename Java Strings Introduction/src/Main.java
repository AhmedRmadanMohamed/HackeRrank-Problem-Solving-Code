import java.util.Scanner;

public class Main {
    static String ConvertStringOfCharToUpper(String A, String B) {
        int CountChars = A.length() + B.length();
        System.out.println(CountChars);
        if (A.length() < B.length()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        return Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " +
                Character.toUpperCase(B.charAt(0)) + B.substring(1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(ConvertStringOfCharToUpper(A, B));
    }
}