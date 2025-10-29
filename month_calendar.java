import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter year: ");
        int inputYear = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int inputMonth = scanner.nextInt();

        // Create LocalDate for the first day of the given month and year
        LocalDate date = LocalDate.of(inputYear, inputMonth, 1);

        // Get total number of days in the month
        int totalDays = date.lengthOfMonth();

        System.out.println("\nDays in " + date.getMonth() + " " + inputYear + ":");

        // Print each date and its corresponding day
        for (int day = 1; day <= totalDays; day++) {
            LocalDate currentDate = LocalDate.of(inputYear, inputMonth, day);
            DayOfWeek dayName = currentDate.getDayOfWeek();
            System.out.println(currentDate + " : " + dayName);
        }

        scanner.close();
    }
}
