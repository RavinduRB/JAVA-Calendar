import java.util.Calendar;

public class Example {
    public static void main(String[] args) {
        int year = 2023; // Change to the desired year
        int month = Calendar.AUGUST; // Change to the desired month (use Calendar constants, e.g., Calendar.JANUARY)

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, 1); // Set the day to the first day of the month

        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // Get the number of days in the month

        // Print the header
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        // Print leading spaces if the first day of the month is not a Sunday
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("     ");
        }

        // Print the days of the month
        for (int day = 1; day <= maxDay; day++) {
            System.out.printf("%4d ", day);

            // If it's a Saturday (or the last day of the week), start a new line
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.println();
            }

            calendar.add(Calendar.DAY_OF_MONTH, 1); // Move to the next day
        }
    }
}
