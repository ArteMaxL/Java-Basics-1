
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] listArray = {};
        System.out.println("Name of the file:");
        String user = scanner.nextLine();
        String name = "";
        int age = 0;

        try {
            Scanner file = new Scanner(Paths.get(user));
            while (file.hasNextLine()) {
                String row = file.nextLine();
                listArray = row.split(",");
                name = listArray[0];
                age = Integer.valueOf(listArray[1]);
                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(RecordsFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
