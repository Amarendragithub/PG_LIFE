package org.apache.jsp.pg_002ddetails_0020BBSR;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class pgownerproperties_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

            String roomid = request.getParameter("roomid");
            out.print(roomid);
            

            
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pglife?useSSL=false", "root", "Sanu@123");
                Statement statement = conn.createStatement() ;
                ResultSet resultset = statement.executeQuery("select * from pglist WHERE id='"+roomid+"'") ;
                resultset.next();
                
                out.print(resultset.getString(4));
                


         
            

      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Ganpati Paying Guest | PG Life</title>\n");
      out.write("\n");
      out.write("    <link href=\"bootstarp.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"https://use.fontawesome.com/releases/v5.11.2/css/all.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,600;0,700;0,800;1,300;1,400;1,600;1,700;1,800&display=swap\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"common1.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"property_details.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"header sticky-top\">\n");
      out.write("        <nav class=\"navbar navbar-expand-md navbar-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                <img src=\"images/logo.png\" />\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#my-navbar\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
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
      out.write("            <li class=\"breadcrumb-item\">\n");
      out.write("                <a href=\"property_list.html\">");
      out.print( resultset.getString(2));
      out.write("</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"breadcrumb-item active\" aria-current=\"page\">\n");
      out.write("                ");
      out.print( resultset.getString(4));
      out.write("\n");
      out.write("            </li>\n");
      out.write("        </ol>\n");
      out.write("    </nav>\n");
      out.write("            \n");
      out.write("       \n");
      out.write("            \n");
      out.write("    <div id=\"property-images\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("            <li data-target=\"#property-images\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("            <li data-target=\"#property-images\" data-slide-to=\"1\" class=\"\"></li>\n");
      out.write("            <li data-target=\"#property-images\" data-slide-to=\"2\" class=\"\"></li>\n");
      out.write("        </ol>\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("            <div class=\"carousel-item active\">\n");
      out.write("                <img class=\"d-block w-100\" src=\"images/1d4f0757fdb86d5f.jpg\" alt=\"slide\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-item\">\n");
      out.write("                <img class=\"d-block w-100\" src=\"images/46ebbb537aa9fb0a.jpg\" alt=\"slide\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-item\">\n");
      out.write("                <img class=\"d-block w-100\" src=\"images/eace7b9114fd6046.jpg\" alt=\"slide\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"carousel-control-prev\" href=\"#property-images\" role=\"button\" data-slide=\"prev\">\n");
      out.write("            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Previous</span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"carousel-control-next\" href=\"#property-images\" role=\"button\" data-slide=\"next\">\n");
      out.write("            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Next</span>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("    <div class=\"property-summary page-container\">\n");
      out.write("        <div class=\"row no-gutters justify-content-between\">\n");
      out.write("            \n");
      out.write("            <div class=\"interested-container\">\n");
      out.write("                <i class=\"is-interested-image far fa-heart\"></i>\n");
      out.write("                <div class=\"interested-text\">\n");
      out.write("                    <span class=\"interested-user-count\">6</span> interested\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"detail-container\">\n");
      out.write("            <div class=\"property-name\">");
      out.print( resultset.getString(4));
      out.write("</div>\n");
      out.write("            <div class=\"property-address\">");
      out.print( resultset.getString(6));
      out.write("</div>\n");
      out.write("            <div class=\"property-gender\">\n");
      out.write("                <img src=\"images/unisex.png\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row no-gutters\">\n");
      out.write("            <div class=\"rent-container col-6\">\n");
      out.write("                <div class=\"rent\">Rs ");
      out.print( resultset.getString(3));
      out.write("/-</div>\n");
      out.write("                <div class=\"rent-unit\">per month</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"button-container col-6\">\n");
      out.write("                <a href=\"../userbook.jsp?roomisis=");
      out.print( resultset.getString(1));
      out.write("\" class=\"btn btn-primary\">Book Now</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"property-about page-container\">\n");
      out.write("        <h1>About the Property</h1>\n");
      out.write("        <p>");
      out.print( resultset.getString(5));
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"signup-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"signup-heading\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"signup-heading\">Signup with PGLife</h5>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form id=\"signup-form\" class=\"form\" role=\"form\">\n");
      out.write("                        <div class=\"input-group form-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                                <span class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fas fa-user\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"full_name\" placeholder=\"Full Name\" maxlength=\"30\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-group form-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                                <span class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fas fa-phone-alt\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"phone\" placeholder=\"Phone Number\" maxlength=\"10\" minlength=\"10\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-group form-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                                <span class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fas fa-envelope\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-group form-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                                <span class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fas fa-lock\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" minlength=\"6\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-group form-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                                <span class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fas fa-university\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"college_name\" placeholder=\"College Name\" maxlength=\"150\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <span>I'm a</span>\n");
      out.write("                            <input type=\"radio\" class=\"ml-3\" id=\"gender-male\" name=\"gender\" value=\"male\" /> Male\n");
      out.write("                            <label for=\"gender-male\">\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"radio\" class=\"ml-3\" id=\"gender-female\" name=\"gender\" value=\"female\" />\n");
      out.write("                            <label for=\"gender-female\">\n");
      out.write("                                Female\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-block btn-primary\">Create Account</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <span>Already have an account?\n");
      out.write("                        <a href=\"#\" data-dismiss=\"modal\" data-toggle=\"modal\" data-target=\"#login-modal\">Login</a>\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
      out.write("                                <span class=\"input-group-text\">\n");
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
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <div class=\"page-container footer-container\">\n");
      out.write("            <div class=\"footer-cities\">\n");
      out.write("                <div class=\"footer-city\">\n");
      out.write("                    <a href=\"property_list.html\">PG in Bhubaneswar</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-city\">\n");
      out.write("                    <a href=\"property_list.html\">PG in Cuttack</a>\n");
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
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
