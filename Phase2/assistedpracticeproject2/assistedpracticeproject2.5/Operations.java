import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Operations {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/ecommercee";
        String username = "root";
        String password = "Sandeephn123!";

        try {
            // Establish a connection to the MySQL database.
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 1. Insert a new record
            String insertQuery = "INSERT INTO eproduct (id, name) VALUES (?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setInt(1, 6); // Set the ID
            insertStatement.setString(2, "ACER Laptop"); // Set the name
            int rowsInserted = insertStatement.executeUpdate();
            System.out.println(rowsInserted + " record(s) inserted.");

            // 2. Update an existing record
            String updateQuery = "UPDATE eproduct SET name = ? WHERE id = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setString(1, "APPLE Laptop"); // New name
            updateStatement.setInt(2, 4); // ID of the record to update
            int rowsUpdated = updateStatement.executeUpdate();
            System.out.println(rowsUpdated + " record(s) updated.");

            // 3. Delete a record
            String deleteQuery = "DELETE FROM eproduct WHERE id = ?";
            PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
            deleteStatement.setInt(1, 2); // ID of the record to delete
            int rowsDeleted = deleteStatement.executeUpdate();
            System.out.println(rowsDeleted + " record(s) deleted.");

            // Close prepared statements and the connection
            insertStatement.close();
            updateStatement.close();
            deleteStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
