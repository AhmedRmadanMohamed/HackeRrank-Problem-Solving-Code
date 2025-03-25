import java.util.Scanner;

public class Main {
//    static String reString (String A){
//        StringBuffer buffer = new StringBuffer();
//        String OutResult = A.equals(buffer.append(A).reverse().toString()) ? "Yes" : "No";return OutResult;}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder builder = new StringBuilder(A).reverse();
        String convertToString = builder.toString();
        if (A.equals(convertToString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // Another solution
//        System.out.println(reString ( A));
    }
}