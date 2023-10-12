import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCDemo {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/ecommercee";
        String username = "root";
        String password = "Sandeephn123!";
        
        try {
            // Establish a connection to the MySQL database.
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            
            // Create a Statement object and execute a SELECT query.
            Statement selectStatement = connection.createStatement();
            String selectQuery = "SELECT * FROM eproduct";
            ResultSet resultSet = selectStatement.executeQuery(selectQuery);
            
            while (resultSet.next()) {
                // Retrieve and process data from the result set.
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
            
            resultSet.close();
            selectStatement.close();
            
            // Create a Statement object and execute an INSERT query.
            Statement insertStatement = connection.createStatement();
            String insertQuery = "INSERT INTO eproduct (id, name) VALUES (4, 'Apple Laptop')";
            
            int rowsAffected = insertStatement.executeUpdate(insertQuery);
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Data insertion failed.");
            }
            
            insertStatement.close();
            
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
