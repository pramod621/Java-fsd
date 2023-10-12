import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class Procedure {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/ecommercee";
        String username = "root";
        String password = "Sandeephn123!";

        try {
            // Establish a connection to the MySQL database.
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create a CallableStatement to call the stored procedure
            CallableStatement callableStatement = connection.prepareCall("{CALL insertData(?, ?)}");

            // Set input parameter values
            callableStatement.setInt(1, 5); // Replace with the appropriate value
            callableStatement.setString(2, "DELL Laptop"); // Replace with the appropriate value

            // Execute the stored procedure
            callableStatement.execute();

            System.out.println("Stored procedure executed successfully.");

            // Close the CallableStatement and the connection
            callableStatement.close();
            connection.close();
        } catch (SQLException e) {
            // Handle database-related exceptions
            e.printStackTrace();
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
        }
    }
}
