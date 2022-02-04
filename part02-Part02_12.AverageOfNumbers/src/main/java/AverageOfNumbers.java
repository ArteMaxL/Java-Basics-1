
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numbers = 0;
        double count = 0;
        double avg;
        
        while (true){
            System.out.println("Give a number:");
            double user = scanner.nextDouble();
            
            if (user != 0){
                numbers+=user;
                count++;
            }else {
                break;
            }
        }
        avg = numbers/count;
        System.out.println("Average of the numbers: " + avg);
    }
}
