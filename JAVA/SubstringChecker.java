import java.util.Scanner;

public class SubstringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        // Check if str2 is a substring of str1
        boolean isSubstring = str1.contains(str2);
        
        // Report the result
        if (isSubstring) {
            System.out.println("'" + str2 + "' is a substring of '" + str1 + "'.");
        } else {
            System.out.println("'" + str2 + "' is not a substring of '" + str1 + "'.");
        }
        
        scanner.close();
    }
}
