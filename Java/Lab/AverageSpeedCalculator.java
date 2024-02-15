import java.util.Scanner;

public class AverageSpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for distance in kilometers
        System.out.print("Enter the distance completed in kilometers: ");
        double distanceInKilometers = scanner.nextDouble();

        // Get user input for time in minutes and seconds
        System.out.print("Enter the minutes spent during the run: ");
        double timeInMinutes = scanner.nextDouble();
        System.out.print("Enter the seconds spent during the run: ");
        double seconds = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Convert time to hours
        double timeInHours = (timeInMinutes + seconds / 60.0) / 60.0;

        // Convert distance from kilometers to miles (1 mile = 1.6 kilometers)
        double distanceInMiles = distanceInKilometers / 1.6;

        // Calculate average speed in miles per hour
        double averageSpeedInMilesPerHour = distanceInMiles / timeInHours;

        // Display the result
        System.out.println("Average speed: " + averageSpeedInMilesPerHour + " miles per hour");
    }
}
