
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int nameNumber = 0;
        int ages = 0;
        int count = 0;

        while (true) {
            String user = scanner.nextLine();

            if (user.isEmpty()) {
                break;
            }

            String[] array = user.split(",");
            String tempName = array[0];
            ages += Integer.valueOf(array[1]);
            count++;

            if (tempName.length() > nameNumber) {
                nameNumber = tempName.length();
                name = array[0];
            }
            if (Integer.valueOf(array[1]) > ages) {
                ages = Integer.valueOf(array[1]);
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * ages / count));
    }
}
