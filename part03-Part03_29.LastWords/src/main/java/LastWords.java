
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String user = scanner.nextLine();

            if (user.isEmpty()) {
                break;
            }
            String[] words = user.split(" ");
            System.out.println(words[words.length - 1]);
        }

    }
}
