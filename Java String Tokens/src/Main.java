import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(s, " !,?._'@");
        int count = tokenizer.countTokens();
        System.out.println(count);
        if (tokenizer.hasMoreTokens()) {
            for (int Start = 0; Start < count; Start++) {

                System.out.println(tokenizer.nextElement());
            }

        }

        scan.close();
    }

}
