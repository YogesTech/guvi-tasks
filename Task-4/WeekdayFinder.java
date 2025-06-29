
import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        String[] weekdays = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day index (0 to 6): ");
        int index = sc.nextInt();

        try {
            System.out.println("Day is: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Please enter a value between 0 and 6.");
        }

        sc.close();
    }
}
