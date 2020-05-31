package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<HEAD>\n");
      out.write("<TITLE>Signup_page</TITLE>\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\" href=\"signup.css\"></LINK>\n");
      out.write("</HEAD>\n");
      out.write("<BODY >\n");
      out.write("\t<DIV class=\"container\">\n");
      out.write("\t\t<!---->\n");
      out.write("\t\t<form action=\"data_save.jsp\" method=\"post\">\n");
      out.write("\t\t\t<TABLE>\n");
      out.write("\t\t\t\t<TR>\n");
      out.write("\t\t\t\t\t<TD><h2 class=\"pera\">Username :</h2></TD>\n");
      out.write("\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t<DIV class=\"form-input\">\n");
      out.write("\t\t\t\t\t\t\t<INPUT type=\"text\" name=\"user\" placeholder=\"Enter Username\" class=\"get\">\n");
      out.write("\t\t\t\t\t\t</DIV>\n");
      out.write("\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t\t<TR><TD><h2 class=\"pera\">Password :</h2></TD>\n");
      out.write("\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t<DIV class=\"form-input\">\n");
      out.write("\t\t\t\t\t\t\t<INPUT type=\"password\" name=\"pass\" placeholder=\"Enter Password\">\n");
      out.write("\t\t\t\t\t\t</DIV>\n");
      out.write("\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t\t<TR><TD><h2 class=\"pera\">Confirm Password :</h2></TD>\n");
      out.write("\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t<DIV class=\"form-input\">\n");
      out.write("\t\t\t\t\t\t\t<INPUT type=\"password\" name=\"pass1\" placeholder=\"Conform Password\">\n");
      out.write("\t\t\t\t\t\t</DIV>\n");
      out.write("\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("                                <TR><TD><h2 class=\"pera\">Mobile:<br>(format: xxxxxxxxxx)</h2></TD>\n");
      out.write("\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t<DIV class=\"form-input\">\n");
      out.write("                                                     <INPUT type=\"tel\" pattern=\"^\\d{10}$\" required placeholder=\"Enter Mobile Number\">\n");
      out.write("\t\t\t\t\t\t</DIV>\n");
      out.write("\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t\t<TR><TD><h2 class=\"pera\">Email :</h2</TD>\n");
      out.write("\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t<DIV class=\"form-input\">\n");
      out.write("\t\t\t\t\t\t\t<INPUT type=\"email\" name=\"email\" placeholder=\"Enter Email Account\">\n");
      out.write("\t\t\t\t\t\t</DIV>\n");
      out.write("\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t<!--\t\t<TR><TD><p class=\"pera\">City Name :</p></TD>\n");
      out.write("\t\t\t\t\t<TD>\n");
      out.write("\t\t\t\t\t\t<DIV class=\"form-input\">\n");
      out.write("\t\t\t\t\t\t\t<INPUT type=\"text\" name=\"city\" placeholder=\"Enter Your City\">\n");
      out.write("\t\t\t\t\t\t</DIV>\n");
      out.write("\t\t\t\t\t</TD>\n");
      out.write("\t\t\n");
      out.write("             \t\t</TR> \n");
      out.write("   -->\n");
      out.write("                                <TR><TD><h2 class=\"pera\">What is your Stream?</h2></TD>\n");
      out.write("                                        <TD>\n");
      out.write("                                            <DIV class=\"form-input\">\n");
      out.write("                                                <p> <input type=\"radio\" name=\"Stream\" value=\"pcm\">PCM\n");
      out.write("                                                <input type=\"radio\" name=\"Stream\" value=\"pcb\">PCB\n");
      out.write("                                                <input type=\"radio\" name=\"Stream\" value=\"ag\"> Agriculture\n");
      out.write("                                                <input type=\"radio\" name=\"Stream\" value=\"com\">Commarce\n");
      out.write("                                                <input type=\"radio\" name=\"Stream\" value=\"art\">Arts</P>\n");
      out.write("                                         </DIV> \n");
      out.write("                                         </TD>\n");
      out.write("      \t\n");
      out.write("                                </TR>    \n");
      out.write("                                        \n");
      out.write("                                      \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("\t\t\t\t<TR><TD colspan=\"2\">\n");
      out.write("\t\t\t\t\t\t<INPUT type=\"submit\" name=\"submit\" value=\"Signup\" class=\"btn-signup\">\n");
      out.write("\t\t\t\t\t\t<INPUT type=\"reset\" name=\"clear\" value=\"Clear\" class=\"btn-clear\">\n");
      out.write("                                               \n");
      out.write("\t\t\t\t\t</TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t</TABLE>\n");
      out.write("                    <a href=\"user.jsp\"><input type=\"button\" value=\"Already Register ?\"></a>\n");
      out.write("\t\t</form>\n");
      out.write("\t</DIV>\t\n");
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
