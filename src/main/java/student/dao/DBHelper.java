package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Applying singleton pattern here
public class DBHelper {
    private static String url = "jdbc:mysql://localhost:3306/teamdata";
    private static String user = "root";
    private static String pass = "vijay";
    private static DBHelper instance;

    private DBHelper() throws ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
    }

    public static DBHelper getInstance() throws ClassNotFoundException {
        if (instance == null)
            instance = new DBHelper();

        return instance;
    }

    public Connection getConnection() throws  SQLException {

        Connection connection = DriverManager.getConnection(url, user, pass);
        return connection;
    }

}
