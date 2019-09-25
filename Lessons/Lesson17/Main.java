package Lesson17;

import java.sql.*;

public class Main {
    public static final String jdbc = "jdbc:mysql:";
    public static final String hostAndPort = "//localhost:3306";
    public static final String url = "/addressBook";
    public static final String unicode = "useUnicode = true";
    public static final String jdbcTimezoneShift = "useJDBCCompliantTimezoneShift=true";
    public static final String dateTime = "useLegacyDateTimeCode = false";
    public static final String serverTimezone = "serverTimezone=UTC";
    public static final String separator = "?";
    public static final String separatorAnd = "&";
    public static final String fullurl =
            jdbc
            + hostAndPort
            + url
            + separator
            + unicode
            + separatorAnd
            + jdbcTimezoneShift
            + separatorAnd
            + dateTime
            + separatorAnd
            + serverTimezone;
    public static final String USER_NAME = "root";
    public static final String password = "root";
    public static final String insertPerson = "insert into person (name,age) values (?,?);";


    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(url);

        Statement statement = connection.createStatement();
        statement.execute("create table if not exist person " +
                "id int primari key auto increment, " +
                "name varchar(255)," +
                "married boolean defoult false");
        statement.execute("insert into person (id,name,married) value (2,'Timmy',false)");
        statement.execute("update person set name = 'Karl', married=true where id = 1");
        statement.execute("delete from person where name = 'Timmy'");
        statement.execute("after table person add age int");

        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into person (name,married,age) value(?,?,?)");

        preparedStatement.setString(1,"Slava");
        preparedStatement.setBoolean(2,false);
        preparedStatement.setInt(3, 12);
        preparedStatement.execute();

        statement.execute("select * from person");

        ResultSet set = statement.getResultSet();
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
