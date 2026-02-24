import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 1000) {
            System.out.println("Invalid input. Please enter a number between 0 and 1000.");
        } else {
            int product = 1;
            int remainingNumber = number;

            while (remainingNumber > 0) {
                int digit = remainingNumber % 10;
                product *= digit;
                remainingNumber /= 10;
            }
            System.out.printf("The multiplication of all digits in %d is %d.\n", number, product);
        }
        scanner.close();
    }
}

