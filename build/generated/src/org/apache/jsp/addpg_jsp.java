package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class addpg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pglife?useSSL=false", "root", "Sanu@123");
    Statement statement = conn.createStatement() ;
    
    if(request.getParameter("addroom") != null){
        String name = request.getParameter("name");
        String details = request.getParameter("address");
        String price = request.getParameter("price");
        String city = request.getParameter("city");
        String ownername = request.getParameter("oname");
        String email = request.getParameter("email");
        String Mobile = request.getParameter("mobile");
//        String image = "photo.jpg";
        
        
        out.println(name);
        out.println(details);
        out.println(price);
        out.println(city);
//        out.println(image);
        out.println(ownername);
        out.println(Mobile);
        out.println(email);
        
        
        int i=statement.executeUpdate("INSERT INTO pglist(city, price, pgname, pgdetails,ownername, owneremail, ownermobile) values('"+city+"','"+price+"','"+name+"','"+details+"','"+ownername+"','"+email+"','"+Mobile+"')");
            out.println("Data is successfully inserted!");
            out.println(i);
            if(i == 1){
                out.print("Inserted to database");
                String redirectURL = "./pgownerdashboard.jsp";
                response.sendRedirect(redirectURL);
            }
            else{
                out.println("Data is not inserted!");
            }
    }


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
