
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter words:");
        while (true) {
            String user = scanner.nextLine();
            if (user.equals("end")) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
