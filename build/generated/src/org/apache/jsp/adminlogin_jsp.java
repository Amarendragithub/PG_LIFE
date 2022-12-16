package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
           

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pglife?useSSL=false", "root", "Sanu@123");
                PreparedStatement pst = conn.prepareStatement("select * from adminlogin where email=? and password=?");
                pst.setString(1, uname);
                pst.setString(2, pass);

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    session.setAttribute("email",uname);  
                     String redirectURL = "adminbooking-log.jsp";
                response.sendRedirect(redirectURL);
                } else {
                    out.println("Incorrect login credentials");
                }
            } catch (Exception e) {
                //throws new ServletException("",e);
            }

        
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login Form</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("                                                                                                                                                                                                              \n");
      out.write("    </head>\n");
      out.write("    <body background=\"https://wallpapershome.com/images/pages/pic_h/19257.jpg\"><br><br><br><br><br><br><br>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("    <center>\n");
      out.write("        \n");
      out.write("          <div style=\"height:350px;width:450px;border-radius:50%;\"><br><br>\n");
      out.write("              <font face=\"lucida handwriting\" size=\"6\" color=\"yellow\"><u>Login Form</u></font><br><br><br>\n");
      out.write("        <form method=\"post\" action=\"\" style=\"font-size:0.7cm;\">  \n");
      out.write("<!--            <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("       <select class=\"form-control form-control-lg\" aria-label=\".form-select-sm example\">\n");
      out.write("                                <option selected>Select User Type</option>\n");
      out.write("                                <option value=\"1\">Pg Owner</option>\n");
      out.write("                                <option value=\"2\">User</option>\n");
      out.write("                                <option value=\"3\">Admin</option>\n");
      out.write("                              </select>\n");
      out.write("        </div>-->\n");
      out.write("        Email    :<input type=\"text\" name=\"uname\" style=\"height:35px;width:250px;border-radius:20pt;border-style:solid;\"/><br/><br/>\n");
      out.write("        Password :<input type=\"password\" name=\"pass\" style=\"height:35px;width:250px;border-radius:20pt;border-style:solid;\"/><br/><br/>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Login\" style=\"background:darkgoldenrod;font-size:0.6cm;height:50px;width:100px;border-radius:20pt;border-style:solid;\"/>\n");
      out.write("        </form>\n");
      out.write("            </div>\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
