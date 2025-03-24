import java.util.Scanner;

public class Main {
    static int breadth;
    static int height;

    static {
        Scanner scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();
        try {
            while ((breadth <= 0 || height <= 0)) {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.exit(0);

        }
    }


    public static int ReturnArea(int A, int B) {
        return A * B;
    }

    public static void main(String[] args) {
        System.out.println(ReturnArea(breadth , height));
    }
}