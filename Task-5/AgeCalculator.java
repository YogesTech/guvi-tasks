import java.time.*;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Scanner to get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birthdate in the format yyyy-mm-dd: ");
        String input = sc.nextLine();

        // Parse the input string to LocalDate
        LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between birthDate and currentDate
        Period age = Period.between(birthDate, currentDate);

        System.out.println("Your age is " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays()
                + " days.");

        sc.close();
    }
}
