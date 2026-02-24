import java.util.Scanner;

public class Runway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed and acceleration (separated by a space): ");
        double speed = scanner.nextDouble();
        double acceleration = scanner.nextDouble();
        double runwayLength = Math.pow(speed, 2) / (2 * acceleration);
        System.out.printf("The minimum runway length for this airplane is %.3f meters.\n", runwayLength);
        scanner.close();
    }
}

