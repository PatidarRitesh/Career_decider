package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.Connect_File;
import java.sql.*;

public final class bio_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Basic -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">   \r\n");
      out.write("   \r\n");
      out.write("    <!-- Mobile Metas -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write(" \r\n");
      out.write("     <!-- Site Metas -->\r\n");
      out.write("    <title>Bio</title>  \r\n");
      out.write("    <meta name=\"keywords\" content=\"\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Site Icons -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <!-- Site CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("    <!-- Colors CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/colors.css\">\r\n");
      out.write("    <!-- ALL VERSION CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/versions.css\">\r\n");
      out.write("    <!-- Responsive CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\r\n");
      out.write("\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"seo_version\">\r\n");
      out.write("\r\n");
      out.write("    <!-- LOADER -->\r\n");
      out.write("\t<div id=\"preloader\">\r\n");
      out.write("\t\t<div id=\"cupcake\" class=\"box\">\r\n");
      out.write("\t\t\t<span class=\"letter\">L</span>\r\n");
      out.write("\t\t\t<div class=\"cupcakeCircle box\">\r\n");
      out.write("\t\t\t\t<div class=\"cupcakeInner box\">\r\n");
      out.write("\t\t\t\t\t<div class=\"cupcakeCore box\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<span class=\"letter box\">A</span>\r\n");
      out.write("\t\t\t<span class=\"letter box\">D</span>\r\n");
      out.write("\t\t\t<span class=\"letter box\">I</span>\r\n");
      out.write("\t\t\t<span class=\"letter box\">N</span>\r\n");
      out.write("\t\t\t<span class=\"letter box\">G</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- END LOADER -->\r\n");
      out.write("\r\n");
      out.write("    <header class=\"header header_style_01\">\r\n");
      out.write("        <nav class=\"megamenu navbar navbar-default\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logos/nwlogo.jpg\" alt=\"image\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t<!--<ul class=\"nav navbar-nav navbar-right hidden-md hidden-sm hidden-xs\">\r\n");
      out.write("                        <li><a class=\"btn-light btn-radius btn-brd top-btn\" href=\"#\"><i class=\"fa fa-angle-double-right\"></i>SEO Analysis</a></li>\r\n");
      out.write("                    </ul> -->\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right menu-top\">\r\n");
      out.write("                        <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"courses.html\">Courses</a></li>\r\n");
      out.write("                        <li><a class=\"active\"> Biology </a></li>\r\n");
      out.write("                        <li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("                        <li><a href=\"about.html\">About Us </a></li>\t\t\t\t\t\t\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"all-page-title\" style=\"background-image:url(images/pattern-4.png);\">\r\n");
      out.write("        <div class=\"container text-center\">\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("\t\t<!--Page -->\r\n");
      out.write("         ");
 
    Connection conn=Connect_File.getConnection();
   
    String query="select * from courses where Course_type='pcb'";
    PreparedStatement ps=conn.prepareStatement(query);
    ResultSet rs=ps.executeQuery();
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\t\r\n");
      out.write("    \r\n");
      out.write("     ");

    
    while (rs.next()){
  
    String Course_name=rs.getString("Course_name");
    String Course_duration=rs.getString("Course_duration");
    String Course_url=rs.getString("Course_url");
 

      out.write("\r\n");
      out.write("\t   \r\n");
      out.write("\t   \r\n");
      out.write("        <!--End Page-->\r\n");
      out.write("    </div><!-- end section -->\r\n");
      out.write("\r\n");
      out.write("    <svg id=\"clouds\" class=\"hidden-xs\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"100%\" height=\"100\" viewBox=\"0 0 \r\n");
      out.write("\t\t85 100\" preserveAspectRatio=\"none\">\r\n");
      out.write("        <path d=\"M-5 100 Q 0 20 5 100 Z\r\n");
      out.write("            M0 100 Q 5 0 10 100\r\n");
      out.write("            M5 100 Q 10 30 15 100\r\n");
      out.write("            M10 100 Q 15 10 20 100\r\n");
      out.write("            M15 100 Q 20 30 25 100\r\n");
      out.write("            M20 100 Q 25 -10 30 100\r\n");
      out.write("            M25 100 Q 30 10 35 100\r\n");
      out.write("            M30 100 Q 35 30 40 100\r\n");
      out.write("            M35 100 Q 40 10 45 100\r\n");
      out.write("            M40 100 Q 45 50 50 100\r\n");
      out.write("            M45 100 Q 50 20 55 100\r\n");
      out.write("            M50 100 Q 55 40 60 100\r\n");
      out.write("            M55 100 Q 60 60 65 100\r\n");
      out.write("            M60 100 Q 65 50 70 100\r\n");
      out.write("            M65 100 Q 70 20 75 100\r\n");
      out.write("            M70 100 Q 75 45 80 100\r\n");
      out.write("            M75 100 Q 80 30 85 100\r\n");
      out.write("            M80 100 Q 85 20 90 100\r\n");
      out.write("            M85 100 Q 90 50 95 100\r\n");
      out.write("            M90 100 Q 95 25 100 100\r\n");
      out.write("            M95 100 Q 100 15 105 100 Z\">        </path>\r\n");
      out.write("    </svg>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"pricing\" class=\"section wb\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"section-title text-center\">\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"tab-content\">\r\n");
      out.write("                        <div class=\"tab-pane active fade in\" id=\"tab1\">\r\n");
      out.write("                            <div class=\"row text-center\">\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <div class=\"pricing-table pricing-table-highlighted\">\r\n");
      out.write("                                     \r\n");
      out.write("                                        <div class=\"pricing-table-space\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--<div class=\"pricing-table-text\">\r\n");
      out.write("                                            <p>This is a perfect choice for small businesses and startups.</p>\r\n");
      out.write("                                        </div> -->\r\n");
      out.write("                                        <div class=\"pricing-table-features\">\r\n");
      out.write("                                            <p><strong>Course Name ");
      out.print(Course_name);
      out.write("</strong>Duration");
      out.print(Course_duration);
      out.write("</p>\r\n");
      out.write("                                            <p><strong>");
      out.print(Course_url);
      out.write("</strong></p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div><!-- end row -->\r\n");
      out.write("                        </div><!-- end pane -->\r\n");
      out.write("                    </div><!-- end content -->\r\n");
      out.write("                </div><!-- end col -->\r\n");
      out.write("            </div><!-- end row -->\r\n");
      out.write("        </div><!-- end container -->\r\n");
      out.write("    </div><!-- end section -->\r\n");
      out.write("    ");

    }
    conn.close();  
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <svg id=\"clouds1\" class=\"hidden-xs\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"100%\" height=\"100\" viewBox=\"0 0 85 100\" \r\n");
      out.write("\t\tpreserveAspectRatio=\"none\">\r\n");
      out.write("        <path d=\"M-5 100 Q 0 20 5 100 Z\r\n");
      out.write("            M0 100 Q 5 0 10 100\r\n");
      out.write("            M5 100 Q 10 30 15 100\r\n");
      out.write("            M10 100 Q 15 10 20 100\r\n");
      out.write("            M15 100 Q 20 30 25 100\r\n");
      out.write("            M20 100 Q 25 -10 30 100\r\n");
      out.write("            M25 100 Q 30 10 35 100\r\n");
      out.write("            M30 100 Q 35 30 40 100\r\n");
      out.write("            M35 100 Q 40 10 45 100\r\n");
      out.write("            M40 100 Q 45 50 50 100\r\n");
      out.write("            M45 100 Q 50 20 55 100\r\n");
      out.write("            M50 100 Q 55 40 60 100\r\n");
      out.write("            M55 100 Q 60 60 65 100\r\n");
      out.write("            M60 100 Q 65 50 70 100\r\n");
      out.write("            M65 100 Q 70 20 75 100\r\n");
      out.write("            M70 100 Q 75 45 80 100\r\n");
      out.write("            M75 100 Q 80 30 85 100\r\n");
      out.write("            M80 100 Q 85 20 90 100\r\n");
      out.write("            M85 100 Q 90 50 95 100\r\n");
      out.write("            M90 100 Q 95 25 100 100\r\n");
      out.write("            M95 100 Q 100 15 105 100 Z\">        </path>\r\n");
      out.write("    </svg>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<footer class=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 col-sm-4 col-xs-12\">\r\n");
      out.write("                    <div class=\"widget clearfix\">\r\n");
      out.write("                        <div class=\"widget-title\">\r\n");
      out.write("                            <img src=\"images/logos/nwlogo.jpg\" alt=\"\">                        </div>\r\n");
      out.write("                        <p> Career counselling sessions helps the students to know the pros and cons of the different streams, \r\n");
      out.write("\t\t\t\t\t\t    courses and educational options and the career path it offers, thus the students can make an informed choice,\r\n");
      out.write("     \t\t\t\t\t\tand get a career assessment that helps avoid the risk of change in career path later in life.</p>\r\n");
      out.write("                    </div><!-- end clearfix -->\r\n");
      out.write("                </div><!-- end col -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3 col-sm-3 col-xs-12\">\r\n");
      out.write("                    <div class=\"widget clearfix\">\r\n");
      out.write("                        <div class=\"widget-title\">\r\n");
      out.write("                            <h3>Contact Details</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"footer-links\">\r\n");
      out.write("                            <li><a href=\"mailto:#\">career.decider@.com</a></li>\r\n");
      out.write("                            <li><a href=\"#\">www.knowledgeultimate.com</a></li>\r\n");
      out.write("                            <li>Vaishali nagar Gate No.2,Gopur Square,Indore</li>\r\n");
      out.write("                            <li>+91 9174937425</li>\r\n");
      out.write("                        </ul><!-- end links -->\r\n");
      out.write("                    </div><!-- end clearfix -->\r\n");
      out.write("                </div><!-- end col -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3 col-sm-3 col-xs-12\">\r\n");
      out.write("                    <div class=\"widget clearfix\">\r\n");
      out.write("                        <div class=\"widget-title\">\r\n");
      out.write("                            <h3>Information</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"footer-links\">\r\n");
      out.write("                            <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Blog</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Pricing</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">About</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Faq</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                        </ul><!-- end links -->\r\n");
      out.write("                    </div><!-- end clearfix -->\r\n");
      out.write("                </div><!-- end col -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-2 col-sm-2 col-xs-12\">\r\n");
      out.write("                    <div class=\"widget clearfix\">\r\n");
      out.write("                        <div class=\"widget-title\">\r\n");
      out.write("                            <h3>Social</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <ul class=\"footer-links social-md\">\r\n");
      out.write("                            <li><a class=\"fb\" href=\"#\"><i class=\"fa fa-facebook\"></i> Facebook</a></li>\r\n");
      out.write("                            <li><a class=\"gi\" href=\"#\"><i class=\"fa fa-github\"></i> Github</a></li>\r\n");
      out.write("                            <li><a class=\"tw\" href=\"#\"><i class=\"fa fa-twitter\"></i> Twitter</a></li>\r\n");
      out.write("                            <li><a class=\"ir\" href=\"#\"><i class=\"fa fa-dribbble\"></i> Instagram</a></li>\r\n");
      out.write("                        </ul><!-- end links -->\r\n");
      out.write("                    </div><!-- end clearfix -->\r\n");
      out.write("                </div><!-- end col -->\r\n");
      out.write("            </div><!-- end row -->\r\n");
      out.write("        </div><!-- end container -->\r\n");
      out.write("    </footer><!-- end footer -->\r\n");
      out.write("\t\r\n");
      out.write("    <div class=\"copyrights\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"footer-distributed\">\r\n");
      out.write("                <div class=\"footer-left\">\r\n");
      out.write("                    <p class=\"footer-company-name\">All Rights Reserved. &copy; 2020  \r\n");
      out.write("\t\t\t\t\tDesign By : Career Decider.\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"footer-right\">\r\n");
      out.write("                    <form method=\"get\" action=\"#\">\r\n");
      out.write("                        <input placeholder=\"Subscribe our newsletter..\" name=\"search\">\r\n");
      out.write("                        <i class=\"fa fa-envelope-o\"></i>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!-- end container -->\r\n");
      out.write("    </div><!-- end copyrights -->\r\n");
      out.write("\r\n");
      out.write("    <a href=\"#\" id=\"scroll-to-top\" class=\"dmtop global-radius\"><i class=\"fa fa-angle-up\"></i></a>\r\n");
      out.write("\r\n");
      out.write("    <!-- ALL JS FILES -->\r\n");
      out.write("    <script src=\"js/all.js\"></script>\r\n");
      out.write("    <!-- ALL PLUGINS -->\r\n");
      out.write("    <script src=\"js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
