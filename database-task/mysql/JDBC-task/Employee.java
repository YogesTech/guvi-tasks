import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Employee {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/database_task";
        String user = "root";
        String password = "yogeshmysql";

        try {
            // connection to the database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully!");

            // SQL INSERT query using placeholders (?)
            String query = "INSERT INTO Employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";

            // PreparedStatement to insert data
            PreparedStatement ps = conn.prepareStatement(query);

            // data to be inserted
            Object[][] employees = {
                    { 101, "Jenny", 25, 10000 },
                    { 102, "Jacky", 30, 20000 },
                    { 103, "Joe", 20, 40000 },
                    { 104, "John", 40, 80000 },
                    { 105, "Shameer", 25, 90000 }
            };

            // Looping through each employee and inserting into database
            for (Object[] emp : employees) {
                ps.setInt(1, (int) emp[0]);
                ps.setString(2, (String) emp[1]);
                ps.setInt(3, (int) emp[2]);
                ps.setDouble(4, (int) emp[3]);
                ps.executeUpdate();
            }

            System.out.println("All employee records inserted successfully.");

            // Closing the connection
            conn.close();
            System.out.println("Connection closed.");

        } catch (Exception e) {
            System.out.println("Error while connecting or inserting data:");
            e.printStackTrace();
        }
    }
}
