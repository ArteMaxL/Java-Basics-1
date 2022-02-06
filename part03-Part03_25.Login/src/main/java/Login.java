
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] user1 = {"alex", "sunshine"};
        String[] user2 = {"emma", "haskell"};

        System.out.println("Enter username:");
        String inputUser = scanner.nextLine();
        System.out.println("Enter password:");
        String inputPass = scanner.nextLine();

        if (inputUser.equals(user1[0]) || inputUser.equals(user2[0])) {
            if (inputPass.equals(user1[1]) || inputPass.equals(user2[1])) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
