
import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    static HashMap<String, Integer> studentMap = new HashMap<>();

    public static void addStudent(String name, int grade) {
        studentMap.put(name, grade);
    }

    public static void removeStudent(String name) {
        studentMap.remove(name);
        System.out.println("Student removed.");
    }

    public static void displayGrade(String name) {
        if (studentMap.containsKey(name)) {
            System.out.println(name + "'s grade: " + studentMap.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        addStudent("Ravi", 85);
        addStudent("Kumar", 92);
        addStudent("Amit", 78);

        System.out.print("Enter student name to display grade: ");
        String nameToDisplay = sc.nextLine();
        displayGrade(nameToDisplay);

        System.out.print("Enter student name to remove: ");
        String nameToRemove = sc.nextLine();
        removeStudent(nameToRemove);

        sc.close();
    }
}
