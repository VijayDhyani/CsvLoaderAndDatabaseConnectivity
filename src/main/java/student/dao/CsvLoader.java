package student.dao;

import student.model.Student;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class CsvLoader {

 public DBHelper dbHelper;

    public void loadCsv(List<Student> studentsList) throws ClassNotFoundException, SQLException {

    dbHelper = DBHelper.getInstance();

        String query = " INSERT INTO Student_Data VALUES ('"+ studentsList+"' ) ";

        Connection connection = dbHelper.getConnection();
        Statement statement = connection.createStatement();

        statement.execute(query);

        statement.close();
        connection.close();

    }    }