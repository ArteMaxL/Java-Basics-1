
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String user = scanner.nextLine();

            if (user.isEmpty()) {
                break;
            }

            String[] parts = user.split(" ");

            for (String part : parts) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }

        }

    }
}
