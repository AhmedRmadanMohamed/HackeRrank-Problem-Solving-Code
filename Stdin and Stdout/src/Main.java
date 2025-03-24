import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // for (int i=0;i<3;i++){int myInt = scanner.nextInt();System.out.println(myInt);}
        //   scanner.close();

        while (scanner.hasNextInt()) {
            int myInt = scanner.nextInt();
            System.out.println(myInt);
        }

    }
}
