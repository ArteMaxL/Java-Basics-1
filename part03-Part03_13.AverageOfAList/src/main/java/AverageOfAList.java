
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while (true) {
            int user = scanner.nextInt();

            if (user != -1) {
                list.add(user);
                sum += user;
            } else {
                break;
            }
        }
        System.out.println("Average: " + (1.0 * sum / list.size()));
    }
}
