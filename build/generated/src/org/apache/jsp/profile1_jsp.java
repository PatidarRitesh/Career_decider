package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.Connect_File;
import java.sql.*;

public final class profile1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <!-- Basic -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">   \n");
      out.write("   \n");
      out.write("    <!-- Mobile Metas -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write(" \n");
      out.write("     <!-- Site Metas -->\n");
      out.write("    <title>result</title>  \n");
      out.write("    <meta name=\"keywords\" content=\"\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <!-- Site Icons -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <!-- Site CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <!-- Colors CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/colors.css\">\n");
      out.write("    <!-- ALL VERSION CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/versions.css\">\n");
      out.write("    <!-- Responsive CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"seo_version\">\n");
      out.write("   \n");
      out.write("%>\n");
      out.write("\n");
      out.write("    <!-- LOADER -->\n");
      out.write("\t<div id=\"preloader\">\n");
      out.write("\t\t<div id=\"cupcake\" class=\"box\">\n");
      out.write("\t\t\t<span class=\"letter\">L</span>\n");
      out.write("\t\t\t<div class=\"cupcakeCircle box\">\n");
      out.write("\t\t\t\t<div class=\"cupcakeInner box\">\n");
      out.write("\t\t\t\t\t<div class=\"cupcakeCore box\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<span class=\"letter box\">A</span>\n");
      out.write("\t\t\t<span class=\"letter box\">D</span>\n");
      out.write("\t\t\t<span class=\"letter box\">I</span>\n");
      out.write("\t\t\t<span class=\"letter box\">N</span>\n");
      out.write("\t\t\t<span class=\"letter box\">G</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END LOADER -->\n");
      out.write("\n");
      out.write("    <header class=\"header header_style_01\">\n");
      out.write("        <nav class=\"megamenu navbar navbar-default\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logos/nwlogo.jpg\" alt=\"image\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right menu-top\">\n");
      out.write("                        <li><a class=\"active\">Profile</a></li>\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"about.html\">About Us </a></li>\n");
      out.write("                        <li><a href=\"courses.html\">Courses</a></li>\n");
      out.write("                        <li><a href=\"choice.jsp\">Test</a></li>\n");
      out.write("                        <li><a  href=\"contact.html\">Contact</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("         ");

    String name=(String)session.getAttribute("name");    
    Connection conn=Connect_File.getConnection();
    String query="select * from user_details where username='"+name+"'";
    PreparedStatement ps=conn.prepareStatement(query);
    ResultSet rs=ps.executeQuery();
    
      out.write(" \n");
      out.write("      \n");
      out.write("     ");

    while (rs.next()){
    String username=rs.getString("username");
    String email=rs.getString("email");
   String mobile=rs.getString("mobile");
    String stream=rs.getString("user_type");
    
    
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"all-page-title\" style=\"background-image:url(images/pattern-4.png);\">\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("            <div class=\"pricing-table pricing-table-highlighted\">\n");
      out.write("                                        <div class=\"pricing-table-space\"></div>\n");
      out.write("                                        <div class=\"pricing-table-features\">\n");
      out.write("                                             <p><strong>Name: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp    ");
      out.print(username);
      out.write("</strong></p>\n");
      out.write("                                             <p><strong>Email: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp    ");
      out.print(email);
      out.write("</strong></p>\n");
      out.write("                                             <p><strong>Mobile: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  ");
      out.print(mobile);
      out.write("</strong></p>\n");
      out.write("                                             <p><strong>Branch: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  ");
      out.print(stream);
      out.write("</strong></p>\n");
      out.write("                                             </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("        </div>\n");
      out.write("                                             \n");
      out.write("    ");

    }
    conn.close();  
    
      out.write("\n");
      out.write("    </div><!-- end section -->\n");
      out.write("\n");
      out.write("    <svg id=\"clouds\" class=\"hidden-xs\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"100%\" height=\"100\" viewBox=\"0 0 \n");
      out.write("\t\t85 100\" preserveAspectRatio=\"none\">\n");
      out.write("        <path d=\"M-5 100 Q 0 20 5 100 Z\n");
      out.write("            M0 100 Q 5 0 10 100\n");
      out.write("            M5 100 Q 10 30 15 100\n");
      out.write("            M10 100 Q 15 10 20 100\n");
      out.write("            M15 100 Q 20 30 25 100\n");
      out.write("            M20 100 Q 25 -10 30 100\n");
      out.write("            M25 100 Q 30 10 35 100\n");
      out.write("            M30 100 Q 35 30 40 100\n");
      out.write("            M35 100 Q 40 10 45 100\n");
      out.write("            M40 100 Q 45 50 50 100\n");
      out.write("            M45 100 Q 50 20 55 100\n");
      out.write("            M50 100 Q 55 40 60 100\n");
      out.write("            M55 100 Q 60 60 65 100\n");
      out.write("            M60 100 Q 65 50 70 100\n");
      out.write("            M65 100 Q 70 20 75 100\n");
      out.write("            M70 100 Q 75 45 80 100\n");
      out.write("            M75 100 Q 80 30 85 100\n");
      out.write("            M80 100 Q 85 20 90 100\n");
      out.write("            M85 100 Q 90 50 95 100\n");
      out.write("            M90 100 Q 95 25 100 100\n");
      out.write("            M95 100 Q 100 15 105 100 Z\">        </path>\n");
      out.write("    </svg>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!--<div id=\"pricing\" class=\"section wb\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"section-title text-center\">\n");
      out.write("                <p class=\"lead\">\n");
      out.write("\t\t\t\t<ul><br>\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">-->\n");
      out.write("                                   \n");
      out.write("    \n");
      out.write("    <svg id=\"clouds1\" class=\"hidden-xs\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"100%\" height=\"100\" viewBox=\"0 0 85 100\" \n");
      out.write("\t\tpreserveAspectRatio=\"none\">\n");
      out.write("        <path d=\"M-5 100 Q 0 20 5 100 Z\n");
      out.write("            M0 100 Q 5 0 10 100\n");
      out.write("            M5 100 Q 10 30 15 100\n");
      out.write("            M10 100 Q 15 10 20 100\n");
      out.write("            M15 100 Q 20 30 25 100\n");
      out.write("            M20 100 Q 25 -10 30 100\n");
      out.write("            M25 100 Q 30 10 35 100\n");
      out.write("            M30 100 Q 35 30 40 100\n");
      out.write("            M35 100 Q 40 10 45 100\n");
      out.write("            M40 100 Q 45 50 50 100\n");
      out.write("            M45 100 Q 50 20 55 100\n");
      out.write("            M50 100 Q 55 40 60 100\n");
      out.write("            M55 100 Q 60 60 65 100\n");
      out.write("            M60 100 Q 65 50 70 100\n");
      out.write("            M65 100 Q 70 20 75 100\n");
      out.write("            M70 100 Q 75 45 80 100\n");
      out.write("            M75 100 Q 80 30 85 100\n");
      out.write("            M80 100 Q 85 20 90 100\n");
      out.write("            M85 100 Q 90 50 95 100\n");
      out.write("            M90 100 Q 95 25 100 100\n");
      out.write("            M95 100 Q 100 15 105 100 Z\">        </path>\n");
      out.write("    </svg>\n");
      out.write("\n");
      out.write("\t<footer class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"widget clearfix\">\n");
      out.write("                        <div class=\"widget-title\">\n");
      out.write("                            <img src=\"images/logos/nwlogo.jpg\" alt=\"\">                        </div>\n");
      out.write("                        <p> Career counselling sessions helps the students to know the pros and cons of the different streams, \n");
      out.write("\t\t\t\t\t\t    courses and educational options and the career path it offers, thus the students can make an informed choice,\n");
      out.write("     \t\t\t\t\t\tand get a career assessment that helps avoid the risk of change in career path later in life.</p>\n");
      out.write("                    </div><!-- end clearfix -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-3 col-xs-12\">\n");
      out.write("                    <div class=\"widget clearfix\">\n");
      out.write("                        <div class=\"widget-title\">\n");
      out.write("                            <h3>Contact Details</h3>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <ul class=\"footer-links\">\n");
      out.write("                            <li><a href=\"mailto:#\">career.decider@.com</a></li>\n");
      out.write("                            <li><a href=\"#\">www.knowledgeultimate.com</a></li>\n");
      out.write("                            <li>Vaishali nagar Gate No.2,Gopur Square,Indore</li>\n");
      out.write("                            <li>+91 9174937425</li>\n");
      out.write("                        </ul><!-- end links -->\n");
      out.write("                    </div><!-- end clearfix -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("\n");
      out.write("                <div class=\"col-md-2 col-sm-2 col-xs-12\">\n");
      out.write("                    <div class=\"widget clearfix\">\n");
      out.write("                        <div class=\"widget-title\">\n");
      out.write("                            <h3>Social</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <ul class=\"footer-links social-md\">\n");
      out.write("                            <li><a class=\"fb\" href=\"#\"><i class=\"fa fa-facebook\"></i> Facebook</a></li>\n");
      out.write("                            <li><a class=\"gi\" href=\"#\"><i class=\"fa fa-github\"></i> Github</a></li>\n");
      out.write("                            <li><a class=\"tw\" href=\"#\"><i class=\"fa fa-twitter\"></i> Twitter</a></li>\n");
      out.write("                            <li><a class=\"ir\" href=\"#\"><i class=\"fa fa-dribbble\"></i> Instagram</a></li>\n");
      out.write("                        </ul><!-- end links -->\n");
      out.write("                    </div><!-- end clearfix -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("            </div><!-- end row -->\n");
      out.write("        </div><!-- end container -->\n");
      out.write("    </footer><!-- end footer -->\n");
      out.write("\t\n");
      out.write("    <div class=\"copyrights\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"footer-distributed\">\n");
      out.write("                <div class=\"footer-left\">\n");
      out.write("                    <p class=\"footer-company-name\">All Rights Reserved. &copy; 2020  \n");
      out.write("\t\t\t\t\tDesign By : Career Decider.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div><!-- end container -->\n");
      out.write("    </div><!-- end copyrights -->\n");
      out.write("\n");
      out.write("    <a href=\"#\" id=\"scroll-to-top\" class=\"dmtop global-radius\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("\n");
      out.write("    <!-- ALL JS FILES -->\n");
      out.write("    <script src=\"js/all.js\"></script>\n");
      out.write("    <!-- ALL PLUGINS -->\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
