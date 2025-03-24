import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean Chek = scanner.hasNext();
        if (Chek==true){
            for (int i =1;i<4;i++){
                String NewLine = scanner.nextLine();
                System.out.println(i+" "+NewLine);
            }
    }
}}