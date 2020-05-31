package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.Connect_File;
import java.sql.*;

public final class data_005fsave_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"book.jpg\">\r\n");
      out.write("    <img src=\"images/logos/nwlogo.jpg\" width=\"250\" height=\"150\" align=\"middle\" style=\"margin-left:530px;\"><br><br>\r\n");
      out.write("   \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<body background=\"im.jpg\">\n");
 
   String u=request.getParameter("user"); 
   String p=request.getParameter("pass");
   String p1=request.getParameter("pass1");
   String m=request.getParameter("mobile");
   String e=request.getParameter("email");
   String c=request.getParameter("Stream");
   Connection conn=Connect_File.getConnection();
   
    String strQuery = "SELECT COUNT(*) FROM user_details where email='"+e+"'";
    PreparedStatement ps=conn.prepareStatement(strQuery);
ResultSet rs = ps.executeQuery(strQuery);
rs.next();
String Countrow = rs.getString(1);
//out.println(Countrow);
if(Countrow.equals("0")){
int i=ps.executeUpdate("insert into user_details(username,pass,mobile,email,user_type)values('"+u+"','"+p+"','"+m+"','"+e+"','"+c+"')");
conn.close();
        }


else{
out.println("User name or Email already exists !");
response.sendRedirect("signup.jsp");
}

  /* String query="insert into user_details values(?,?,?,?,?)";
   PreparedStatement ps=conn.prepareStatement(query);
   if(p.equals(p1)){
   ps.setString(1,u);
   ps.setString(2,p);
   ps.setString(3,m);
   ps.setString(4,e);
   ps.setString(5,c);
   ps.executeUpdate();
   conn.close();
   }else{
	   session.setAttribute("reply","Something Wrong Please Signup Again");
	   response.sendRedirect("signup.jsp");
}*/


      out.write("\n");
      out.write("</body>\n");
      if (true) {
        _jspx_page_context.forward("user.jsp");
        return;
      }
      out.write('\n');
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
      out.write("    \n");
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
