package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/foot.jsp");
  }

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Online Evaluation</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <LINK rel=\"stylesheet\" type=\"text/css\" href=\"login.css\"></LINK>  \n");
      out.write("    </head>\n");
      out.write("    <body  background=\"book.jpg\">\n");
      out.write("    <img src=\"images/logos/nwlogo.jpg\" width=\"250\" height=\"160\" align=\"middle\" style=\"margin-left:580px;\">\n");
      out.write("    <marquee>  <h1 text-align:center>WELCOME TO CAREER DECIDER</h1> </marquee>\n");
      out.write("    \n");
      out.write("    <DIV class=\"container\">\n");
      out.write("\t\t<img alt=\"ulogin\" src=\"admin-login.png\">\n");
      out.write("\t\t<form action=\"adminlogin\" method=\"post\">\n");
      out.write("\t\t<DIV class=\"form-input\">\n");
      out.write("\t\t\t<INPUT type=\"text\" name=\"user_admin\" placeholder=\"Enter Username\" class=\"get\"/>\n");
      out.write("\t\t</DIV>\n");
      out.write("\t\t<DIV class=\"form-input1\">\n");
      out.write("\t\t\t<INPUT type=\"password\" name=\"pass_admin\" placeholder=\"Enter Password\" class=\"get\"/>\n");
      out.write("\t\t</DIV>\n");
      out.write("\t\t<DIV>\n");
      out.write("\t\t\t<INPUT type=\"submit\" name=\"submit\" value=\"LOGIN\" class=\"btn-login\" /><br />\n");
      out.write("\t\t</DIV>\n");
      out.write("\t\t</form>\n");
      out.write("\t</DIV>\n");
      out.write("    \t\t\n");
      out.write("        \n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>TODO supply a title</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<p style=\"text-align: center; font-size: 20px; margin-top:45px;background-color:silver;\">\n");
      out.write("\t\t<b><i> -------- </i></b>\n");
      out.write("\t</p>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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