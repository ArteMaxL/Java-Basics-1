
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int cube = 0;
        
        while (true) {
            String user = scanner.nextLine();
            if (user.equals("end")) {
                break;
            }
            int calc = Integer.valueOf(user);
            cube = calc * calc * calc;
            System.out.println(cube);
        }
    }
}
