package Lesson17;

import java.sql.*;

public class Main {
    public static final String url1 = "jdbc:mysql://localhost:3306";


    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection((url1));

        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into person (name,married,age) value(?,?,?)");

        preparedStatement.setString(1,"Timmy");
        preparedStatement.setBoolean(2,false);
        preparedStatement.setInt(3, 12);
        preparedStatement.execute();

        statement.execute("select * from person");

        ResultSet set = statement.getResulSet();
        while (set.next()) {
            System.out.println(
                    "ID: " + set.getInt(1) +
                            "name: " + set.getString(2) +
                            "married: " + set.getBoolean(3) +
                            "age: " + set.getInt(4));


        }

        connection.close();

    }
}
