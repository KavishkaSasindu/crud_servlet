package web;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import model.UserDao;
import model.UserModel;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/addUser")
public class UserServlet extends HttpServlet {


    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{

        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try {
            UserDao userDao = new UserDao();
            UserModel userModel = new UserModel();

            String username = request.getParameter("username");
            String job = request.getParameter("job");
            String age = request.getParameter("age");
            String email = request.getParameter("email");

            userModel.setUsername(username);
            userModel.setJob(job);
            userModel.setAge(age);
            userModel.setEmail(email);

            boolean success = userDao.addUser(userModel);

            if(success){
                System.out.println("User added");
                pw.println("<p>User Added Success</p>");
            }else{
                System.out.println("User not added");
                pw.println("<p>User not added</p>");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
