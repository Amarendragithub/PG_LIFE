package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class pgownerbooking_002dlog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String email=(String)session.getAttribute("email"); 

//out.print(email);
if(email != null){
    out.print(email);
}
else{
    out.print("email not found");

      out.write("\n");
      out.write("<!--<script>\n");
      out.write("    alert(\"Please login first\");\n");
      out.write("</script>-->\n");
      out.write("\n");

//    response.sendRedirect("index.html");
}


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("  <title>Dashboard -pglife</title>\n");
      out.write("  <meta content=\"\" name=\"description\">\n");
      out.write("  <meta content=\"\" name=\"keywords\">\n");
      out.write("\n");
      out.write("  <!-- Favicons -->\n");
      out.write("  <link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"icon\" href=\"/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("  <!-- Google Fonts -->\n");
      out.write("  <link href=\"https://fonts.gstatic.com\" rel=\"preconnect\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Vendor CSS Files -->\n");
      out.write("  <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/quill/quill.snow.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/quill/quill.bubble.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/simple-datatables/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Template Main CSS File -->\n");
      out.write("  <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- ======= Header ======= -->\n");
      out.write("  <header id=\"header\" class=\"header fixed-top d-flex align-items-center\">\n");
      out.write("\n");
      out.write("    <div class=\"d-flex align-items-center justify-content-between\">\n");
      out.write("      <a href=\"index.html\" class=\"logo d-flex align-items-center\">\n");
      out.write("        <img src=\"images/logo.png\" alt=\"pg\" >\n");
      out.write("        <span class=\"d-none d-lg-block\"></span>\n");
      out.write("      </a>\n");
      out.write("      <i class=\"bi bi-list toggle-sidebar-btn\"></i>\n");
      out.write("    </div><!-- End Logo -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <nav class=\"header-nav ms-auto\">\n");
      out.write("      <ul class=\"d-flex align-items-center\">\n");
      out.write("          \n");
      out.write("          \n");
      out.write("\n");
      out.write("         <li>\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"signout.jsp\">\n");
      out.write("                <i class=\"bi bi-box-arrow-right\"></i>\n");
      out.write("                <span>Sign Out</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <!-- ======= Sidebar ======= -->\n");
      out.write("  <aside id=\"sidebar\" class=\"sidebar\">\n");
      out.write("\n");
      out.write("    <ul class=\"sidebar-nav\" id=\"sidebar-nav\">\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link \" href=\"index.html\">\n");
      out.write("          <i class=\"bi bi-grid\"></i>\n");
      out.write("          <span>Dashboard</span>\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link \" href=\"./pgownerbooking-log.jsp\">\n");
      out.write("          <i class=\"bi bi-journal-text\"></i>\n");
      out.write("          <span>Booking-log</span>\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link \" href=\"./pgownerpglist.jsp\">\n");
      out.write("          <i class=\"bi bi-journal-text\"></i>\n");
      out.write("          <span>Pg list</span>\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link \" href=\"./pgownerdashboard.jsp\">\n");
      out.write("          <i class=\"bi bi-journal-text\"></i>\n");
      out.write("          <span>Add pg</span>\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write(" \n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("  </aside><!-- End Sidebar-->\n");
      out.write("\n");
      out.write("  <main id=\"main\" class=\"main\">\n");
      out.write("\n");
      out.write("    <div class=\"pagetitle\">\n");
      out.write("      <h1>Dashboard</h1>\n");
      out.write("      <nav>\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("          <li class=\"breadcrumb-item\"><a href=\"index.html\">Home</a></li>\n");
      out.write("          <li class=\"breadcrumb-item active\">Dashboard</li>\n");
      out.write("        </ol>\n");
      out.write("      </nav>\n");
      out.write("    </div><!-- End Page Title -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"section\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("<!--           \n");
      out.write("               Table with stripped rows -->\n");
      out.write("            ");

                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pglife?useSSL=false", "root", "Sanu@123");
                Statement st=conn.createStatement();
                ResultSet resultset = st.executeQuery("select * from `booking-log` WHERE uemail='"+email+"'") ;
            
      out.write("\n");
      out.write("       \n");
      out.write("              <table class=\"table datatable\">\n");
      out.write("                <thead>\n");
      out.write("                  <tr>\n");
      out.write("                    <th scope=\"col\">Id</th>\n");
      out.write("                    <th scope=\"col\">City</th>\n");
      out.write("                    <th scope=\"col\">Price</th>\n");
      out.write("                    <th scope=\"col\">uname</th>\n");
      out.write("                    <th scope=\"col\">uemail</th>\n");
      out.write("                    <th scope=\"col\">umobileno</th>\n");
      out.write("                    <th scope=\"col\">Payment</th>\n");
      out.write("                  </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
 while(resultset.next()){ 
      out.write("\n");
      out.write("                      <tr>\n");
      out.write("                        \n");
      out.write("                        <td>");
      out.print( resultset.getString(1) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( resultset.getString(3) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( resultset.getString(4) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( resultset.getString(5) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( resultset.getString(6) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( resultset.getString(7) );
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                        <td>");
      out.print( resultset.getString(10) );
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                      </tr>\n");
      out.write("                      ");
}
      out.write("\n");
      out.write("                       \n");
      out.write("                                     \n");
      out.write("                  \n");
      out.write("         \n");
      out.write("                </tbody>\n");
      out.write("              </table>\n");
      out.write("               \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("  </main> End #main \n");
      out.write("\n");
      out.write("  <!-- ======= Footer ======= -->\n");
      out.write("  <footer id=\"footer\" class=\"footer\">\n");
      out.write("    <div class=\"copyright\">\n");
      out.write("      &copy; Copyright <strong><span>PG Life</span></strong>. All Rights Reserved\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </footer><!-- End Footer -->\n");
      out.write("\n");
      out.write("  <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\n");
      out.write("\n");
      out.write("  <!-- Vendor JS Files -->\n");
      out.write("  <script src=\"assets/vendor/apexcharts/apexcharts.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/chart.js/chart.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/echarts/echarts.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/quill/quill.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/simple-datatables/simple-datatables.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/tinymce/tinymce.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/php-email-form/validate.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Template Main JS File -->\n");
      out.write("  <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
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
