
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println(num * -1);
        } else {
            System.out.println(num);
        }

    }
}
