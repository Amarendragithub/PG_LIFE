package org.apache.jsp.pg_002ddetails_0020BBSR;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class pgdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" ");

            String city = request.getParameter("selectcity");
//            out.print(city);
            

            
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pglife?useSSL=false", "root", "Sanu@123");
                Statement statement = conn.createStatement() ;
                ResultSet resultset = statement.executeQuery("select * from pglist WHERE city='"+city+"'") ;
            


         
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Best PG's in Bhubaneswar | PG Life</title>\n");
      out.write("\n");
      out.write("    <link href=\"style1.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"https://use.fontawesome.com/releases/v5.11.2/css/all.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,600;0,700;0,800;1,300;1,400;1,600;1,700;1,800&display=swap\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"common.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"property.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"header sticky-top\">\n");
      out.write("        <nav class=\"navbar navbar-expand-md navbar-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                <img src= \"images/logo.png\" >\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#my-navbar\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse justify-content-end\" id=\"my-navbar\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("<!--      \n");
      out.write("-->                    </li><!--\n");
      out.write("-->                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"loading\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <nav aria-label=\"breadcrumb\">\n");
      out.write("        <ol class=\"breadcrumb py-2\">\n");
      out.write("            <li class=\"breadcrumb-item\">\n");
      out.write("                <a href=\"index.html\">Home</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"breadcrumb-item active\" aria-current=\"page\">\n");
      out.write("                Bhubaneswar\n");
      out.write("            </li>\n");
      out.write("        </ol>\n");
      out.write("    </nav><!--\n");
      out.write("\n");
      out.write("-->    <div class=\"page-container\">\n");
      out.write("        <div class=\"filter-bar row justify-content-around\">\n");
      out.write("            <div class=\"col-auto\" data-toggle=\"modal\" data-target=\"#filter-modal\">\n");
      out.write("                <img src=\"images/filter.png\" alt=\"filter\" />\n");
      out.write("                <span>Filter</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-auto\">\n");
      out.write("                <img src=\"images/desc.png\" alt=\"sort-desc\" />\n");
      out.write("                <span>Highest rent first</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-auto\">\n");
      out.write("                <img src=\"images/asc.png\" alt=\"sort-asc\" />\n");
      out.write("                <span>Lowest rent first</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("     ");
 while(resultset.next()){ 
      out.write("\n");
      out.write("    \n");
      out.write("       \n");
      out.write("        <div class=\"property-card row\">\n");
      out.write("            <div class=\"image-container col-md-4\">\n");
      out.write("                <img src=\"images/1d4f0757fdb86d5f.jpg\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content-container col-md-8\">\n");
      out.write("                \n");
      out.write("                <div class=\"detail-container\">\n");
      out.write("                    <div class=\"property-name\"> ");
      out.print( resultset.getString(4) );
      out.write("</div>\n");
      out.write("                    <div class=\"property-address\"> ");
      out.print( resultset.getString(5) );
      out.write("</div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row no-gutters\">\n");
      out.write("                    <div class=\"rent-container col-6\">\n");
      out.write("                        <div class=\"rent\">Rs  ");
      out.print( resultset.getString(3) );
      out.write("/-</div>\n");
      out.write("                        <div class=\"rent-unit\">per month</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"button-container col-6\">\n");
      out.write("                        <a href=\"pgownerproperties.jsp?roomid=");
      out.print( resultset.getString(1) );
      out.write("\" class=\"btn btn-primary\">View</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"filter-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"filter-heading\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h3 class=\"modal-title\" id=\"filter-heading\">Filters</h3>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <h5>Gender</h5>\n");
      out.write("                    <hr />\n");
      out.write("                    <div>\n");
      out.write("                        <button class=\"btn btn-outline-dark btn-active\">\n");
      out.write("                            No Filter\n");
      out.write("                        </button>\n");
      out.write("                        <button class=\"btn btn-outline-dark\">\n");
      out.write("                            <i class=\"fas fa-venus-mars\"></i>Unisex\n");
      out.write("                        </button>\n");
      out.write("                        <button class=\"btn btn-outline-dark\">\n");
      out.write("                            <i class=\"fas fa-mars\"></i>Male\n");
      out.write("                        </button>\n");
      out.write("                        <button class=\"btn btn-outline-dark\">\n");
      out.write("                            <i class=\"fas fa-venus\"></i>Female\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button data-dismiss=\"modal\" class=\"btn btn-success\">Okay</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"login-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"login-heading\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"login-heading\">Login with PGLife</h5>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form id=\"login-form\" class=\"form\" role=\"form\">\n");
      out.write("                        <div class=\"input-group form-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                                <span class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fas fa-user\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-group form-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                               <span class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fas fa-lock\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" minlength=\"6\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-block btn-primary\">Login</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <span>\n");
      out.write("                        <a href=\"#\" data-dismiss=\"modal\" data-toggle=\"modal\" data-target=\"#signup-modal\">Click here</a>\n");
      out.write("                        to register a new account\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <div class=\"page-container footer-container\">\n");
      out.write("            <div class=\"footer-cities\">\n");
      out.write("                <div class=\"footer-city\">\n");
      out.write("                    <a href=\"property_list.html\">PG in Bhubaneswar</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-city\">\n");
      out.write("                    <a href=\"property_list.html\">PG in cuttack</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-city\">\n");
      out.write("                    <a href=\"property_list.html\">PG in Sambalpur</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-city\">\n");
      out.write("                    <a href=\"property_list.html\">PG in Rourkela</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-copyright\">© 2020 Copyright PG Life </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
