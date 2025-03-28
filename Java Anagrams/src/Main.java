import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String A, B;
        Solutions s = new Solutions();
        Scanner sc = new Scanner(System.in);
        A = sc.nextLine();
        B = sc.nextLine();
        boolean IsAnagram = s.isAnagram(A, B);
        sc.close();
        System.out.println(IsAnagram ? "Anagram" : "Not Anagram");


    }
}