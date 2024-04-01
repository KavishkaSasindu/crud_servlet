package db;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DbConnection {
    Connection conn = null;

    private final String URL = "jdbc:mysql://localhost/crud";
    private final String USERNAME = "root";
    private final String PASSWORD = "mysql";

    public  Connection getConnection() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return conn;
    }

}
