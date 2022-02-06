
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String older = "";
        int age = 0;
        while (true) {

            String user = scanner.nextLine();
            if (user.isEmpty()) {
                break;
            }
            String[] ages = user.split(",");

            if (Integer.valueOf(ages[1]) > age) {
                age = Integer.valueOf(ages[1]);
                older = ages[0];
            }
        }
        System.out.println("Name of the oldest: " + older);
    }
}
