
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resp = "";

        while (true) {
            System.out.println("Shall we carry on?");
            resp = scanner.nextLine();

            if (resp.equals("no")) {
                break;
            }
        }
    }
}
