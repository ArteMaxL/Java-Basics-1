
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("First number?");
        int num1 = scanner.nextInt();
        System.out.println("Second number?");
        int num2 = scanner.nextInt();

        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
