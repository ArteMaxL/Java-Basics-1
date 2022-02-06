
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String user = scanner.nextLine();
            if (user.isEmpty()) {
                break;
            }
            String[] pieces = user.split(" ");

            for (String piece : pieces) {
                System.out.println(piece);
            }
        }
    }
}
