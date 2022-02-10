
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try {
            Scanner scanFile = new Scanner(Paths.get(file));

            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                String[] list = row.split(",");
                String name = list[0];
                int age = Integer.valueOf(list[1]);
                persons.add(new Person(name, age));
            }
        } catch (IOException ex) {
            Logger.getLogger(StoringRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}
