package model;

import db.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    Connection conn = null;
    PreparedStatement stmt = null;

    DbConnection dbConnection = new DbConnection();

    UserModel userModel = new UserModel();
    public UserDao() throws SQLException {
        conn = dbConnection.getConnection();
    }

    public boolean addUser(UserModel userModel) throws SQLException{
        int insertRow = 0;
        try{
            String INSERT_QUERY = "INSERT INTO user(username,job,age,email) VALUES(?,?,?,?)";
            stmt = conn.prepareStatement(INSERT_QUERY);
            stmt.setString(1,userModel.getUsername());
            stmt.setString(2,userModel.getJob());
            stmt.setString(3,userModel.getAge());
            stmt.setString(4,userModel.getEmail());

             insertRow = stmt.executeUpdate();


        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return insertRow>0;
    }


}
