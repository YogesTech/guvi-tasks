import java.util.*;
import java.util.stream.*;

public class studentsFilterClass {
    public static void main(String[] args) {
        // Creating a List to store student names
        List<String> studentNames = Arrays.asList(
                "Arun", "Bala", "Ajay", "Anu", "karthik",
                "Abishek", "Deepa", "Harish", "Mani", "Ashwin");

        // Use Stream API and Lambda to filter names starting with 'A'
        List<String> specialStudents = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students who will get special gifts:");
        specialStudents.forEach(System.out::println);
    }
}
