
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int older = 0;

        while (true) {
            String user = scanner.nextLine();

            if (user.isEmpty()) {
                break;
            }

            String[] ages = user.split(",");

            if (older < Integer.valueOf(ages[1])) {
                older = Integer.valueOf(ages[1]);
            }
        }
        System.out.println("Age of the oldest: " + older);
    }
}
