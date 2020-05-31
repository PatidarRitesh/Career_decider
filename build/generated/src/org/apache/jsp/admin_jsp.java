package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/head.jsp");
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
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

	if (session.getAttribute("adminname") == null) {
		response.sendRedirect("admin2.jsp");
	}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Online Evaluation</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write(".container{\n");
      out.write("\twidth:800px;\n");
      out.write("\theight:370px;\n");
      out.write("\ttext-align:center;\n");
      out.write("\tbackground-color:rgba(52, 73, 94, 0.7);\n");
      out.write("\tborder-radius:4px;\n");
      out.write("\tmargin:0 auto;\n");
      out.write("\tmargin-top:-60px;\t\n");
      out.write("\t}\n");
      out.write(".signout{\n");
      out.write("color:green;\n");
      out.write("background:#F1F0D1;\n");
      out.write("padding-top:5px;\n");
      out.write("padding-right:5px;\n");
      out.write("padding-bottom:5px;\n");
      out.write("padding-left:5px;\n");
      out.write("border-radius:4px;\n");
      out.write("border:none;\n");
      out.write("border-bottom:4px solid #27aE60;\n");
      out.write("cursor:pointer;\n");
      out.write("height:40px;\n");
      out.write("width:100px;\n");
      out.write("margin-left:1100px;\n");
      out.write("}\n");
      out.write(".text{\n");
      out.write("\tcolor:#ffff80;\n");
      out.write("\tfont-style:oblique;\n");
      out.write("\tfont-size:1.9em;\n");
      out.write("\tpadding-left:100px;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("          \n");
      out.write("    </head>\n");
      out.write("    <body background=\"book.jpg\">\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"book.jpg\">\r\n");
      out.write("    <img src=\"logo.jpg\" width=\"500\" height=\"150\" align=\"middle\" style=\"margin-left:430px;\"><br><br>\r\n");
      out.write("   \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("   \n");
      out.write("   <form action=\"userlogout\">\n");
      out.write("\t<input type=\"submit\" class=\"signout\" value=\"Sign Out\"><br><br>\n");
      out.write("    </form>\n");
      out.write("    <DIV class=\"container\">\n");
      out.write("    <h1 class=\"text\" style=\"text-align: center;\">modify Test and Courses</h1>\n");
      out.write("  \n");
      out.write("    <a href=\"modifyc.jsp\"><!--<img src=\"test.jpg\" width=\"300\" height=\"300\"> --><h1> Test</h1></a>\n");
      out.write("    <a href=\"modifyjava.jsp\"><!--<img src=\"2.jpg\" width=\"400\" height=\"300\"> --><strong> Course</strong> </a>\n");
      out.write("    </DIV>\n");
      out.write("   \n");
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
