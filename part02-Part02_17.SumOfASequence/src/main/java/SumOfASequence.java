
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("Last number?");
        int user = scanner.nextInt();

        for (int i = 1; i <= user; i++) {
            count += i;
        }
        System.out.println("The sum is " + count);
    }
}
