
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numbers = 0;
        int count = 0;
        double avg = 0;

        while (true) {
            System.out.println("Give a number:");
            double user = scanner.nextDouble();

            if (user != 0 && user > 0) {
                numbers += user;
                count++;
            } else if (user < 0) {
                continue;
            } else {
                break;
            }
        }
        avg = numbers / count;
        if (numbers > 0) {
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
