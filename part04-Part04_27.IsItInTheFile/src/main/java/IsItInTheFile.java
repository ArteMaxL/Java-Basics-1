
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IsItInTheFile {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try {
            Scanner fileScan = new Scanner(Paths.get(file));

            while (fileScan.hasNextLine()) {
                list.add(fileScan.nextLine());
            }

            if (list.contains(searchedFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (IOException ex) {
            //Logger.getLogger(IsItInTheFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Reading the file " + file + " failed.");
            //"Reading the file " + file + " failed."
        }
    }
}
