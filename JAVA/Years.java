import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        long minutesInYear = 365 * 24 * 60;
        long years = minutes / minutesInYear;
        long remainingDays = (minutes % minutesInYear) / (24 * 60);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
        scanner.close();
    }
}

