
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String giveStr = scan.nextLine();
        System.out.println("Give an integer:");
        int giveInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double giveDbl = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean giveBool = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + giveStr);
        System.out.println("You gave the integer " + giveInt);
        System.out.println("You gave the double " + giveDbl);
        System.out.println("You gave the boolean " + giveBool);
    }
}
