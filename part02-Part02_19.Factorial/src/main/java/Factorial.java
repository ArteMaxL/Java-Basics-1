
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;

        System.out.println("Give a number:");
        int user = scanner.nextInt();

        for (int i = 1; i <= user; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
