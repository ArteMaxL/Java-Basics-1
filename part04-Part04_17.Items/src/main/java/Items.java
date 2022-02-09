
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String user = scanner.nextLine();

            if (user.isEmpty()) {
                break;
            }
            items.add(new Item(user));
        }
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
