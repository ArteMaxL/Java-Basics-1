
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give first number:");
        int num1 = scanner.nextInt();
        System.out.println("Give second number:");
        int num2 = scanner.nextInt();
        
        double squareRoot = Math.sqrt(num1+num2);
        
        System.out.println(squareRoot);
    }
}
