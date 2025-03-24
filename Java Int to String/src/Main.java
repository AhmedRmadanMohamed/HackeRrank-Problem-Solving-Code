import java.util.Scanner;

public class Main {
    public static void Sample() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String x = Integer.toString(n);
        if (x.equals(Integer.toString(n))) {

            System.out.println("Good job");

        } else {
            System.out.println("Wrong answer");


        }
    }

    public static void main(String[] args) {
        Sample ();
    }
}