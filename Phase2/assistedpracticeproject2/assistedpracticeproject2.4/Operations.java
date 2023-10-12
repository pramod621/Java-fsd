import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Operations {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "Sandeephn123!";
        String databaseName = "ecommercee1";

        try {
            // Establish a connection to the MySQL server (not a specific database).
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create a Statement object to execute SQL statements.
            Statement statement = connection.createStatement();

            // 1. Create a database
            String createDatabaseSQL = "CREATE DATABASE " + databaseName;
            statement.executeUpdate(createDatabaseSQL);
            System.out.println("Database created successfully.");

            // 2. Select (use) the newly created database
            String useDatabaseSQL = "USE " + databaseName;
            statement.executeUpdate(useDatabaseSQL);
            System.out.println("Selected database: " + databaseName);

            // You can execute SQL statements specific to the selected database here.

            // 3. Drop (delete) the database
            String dropDatabaseSQL = "DROP DATABASE " + databaseName;
            statement.executeUpdate(dropDatabaseSQL);
            System.out.println("Database dropped successfully.");

            // Close the Statement and Connection
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
