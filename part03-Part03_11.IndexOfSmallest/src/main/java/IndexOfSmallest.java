
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        int smallest = 9999;

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int user = scanner.nextInt();

            if (user != 9999) {
                list.add(user);
                if (user < smallest) {
                    smallest = user;
                }
            } else {
                break;
            }
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
