import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;

/**
 * Servlet implementation class MySQLConnect
 */

public class Myservelet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        if(uname.isEmpty()&&pass.isEmpty())
            out.println("id and password shouldnot be empty");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pglife?useSSL=false", "root", "Sanu@123");
            PreparedStatement pst = conn.prepareStatement("select uname,pass from registration where uname=? and pass=?");
            pst.setString(1, uname);
            pst.setString(2, pass);
           
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                out.println("login successful...");
            } 
            else {
                out.println("Incorrect login credentials");
            }
        } 
        catch (Exception e) {
            //throws new ServletException("",e);
        }
    }
}