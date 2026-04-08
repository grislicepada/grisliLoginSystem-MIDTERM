package my_package;
import java.sql.*;

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Change "root" and "" if you set a password on XAMPP
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_system", "root", "");
            return con;
        } catch (Exception e) {
            e.printStackTrace(); // This will print the EXACT error in the bottom window
            return null;
    }
    }
}