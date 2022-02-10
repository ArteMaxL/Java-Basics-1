
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int count = 0;

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try {
            Scanner scanFile = new Scanner(Paths.get(file));

            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                numbers.add(Integer.valueOf(row));
            }

        } catch (IOException ex) {
            System.out.println("File not found.");
        }
        for (int number : numbers) {
            if (number >= lowerBound && number <= upperBound) {
                count++;
            }
        }
        System.out.println("Numbers: " + count);
    }
}