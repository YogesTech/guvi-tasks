
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
        }

        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name is not valid. It should not contain numbers or special characters.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

public class StudentException {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "John123", 20, "Computer Science");
            System.out.println("Student created: " + s1.name + ", " + s1.age);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            Student s2 = new Student(102, "Alice", 24, "Mechanical Engineering");
            System.out.println("Student created: " + s2.name + ", " + s2.age);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            Student s3 = new Student(103, "Robert", 19, "Electrical Engineering");
            System.out.println("Student created: " + s3.name + ", " + s3.age);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
