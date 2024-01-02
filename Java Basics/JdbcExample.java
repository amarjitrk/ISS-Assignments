//JDBC
import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourdatabase";
        String user = "username";
        String password = "password";

        try {
            // Establishing a connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Creating a statement
            Statement stmt = conn.createStatement();

            // Executing a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM your_table");

            // Processing the result set
            while (rs.next()) {
                System.out.println(rs.getString("column_name"));
            }

            // Closing connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
