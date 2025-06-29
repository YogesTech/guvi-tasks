
public class Voter {
    int voterId;
    String name;
    int age;

    public Voter(int voterId, String name, int age) {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}

class InvalidVoterAgeException extends RuntimeException {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

class VoterTest {
    public static void main(String[] args) {
        try {
            Voter v1 = new Voter(1, "Rahul", 16);
            System.out.println("Voter created: " + v1.name + ", Age: " + v1.age);
        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            Voter v2 = new Voter(2, "Kumar", 21);
            System.out.println("Voter created: " + v2.name + ", Age: " + v2.age);
        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
