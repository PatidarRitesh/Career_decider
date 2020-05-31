package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.Connect_File;
import java.sql.*;

public final class viewcresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	if(session.getAttribute("name")==null){
		response.sendRedirect("user.jsp");
	}

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
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
      out.write("\n");
      out.write("<head>\n");
      out.write("<title>Marks Details</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".container{\n");
      out.write("\twidth:950px;\n");
      out.write("\theight:auto;\n");
      out.write("\tbackground-color:rgba(52, 73, 94, 0.7);\n");
      out.write("\tborder-radius:4px;\n");
      out.write("\tmargin:0 auto;\n");
      out.write("\tpadding-top:20px;\n");
      out.write("\tpadding-bottom:20px;\n");
      out.write("\t}\n");
      out.write(".text{\n");
      out.write("\tcolor:#ffff80;\n");
      out.write("\tfont-style:oblique;\n");
      out.write("\tfont-size:1.2em;\n");
      out.write("\tpadding-left:40px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write(".text1{\n");
      out.write("\tcolor:#ffffff;\n");
      out.write("\tfont-style:oblique;\n");
      out.write("\tfont-size:1.3em;\n");
      out.write("\tpadding-left:40px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<a href=\"choice.jsp\"><input type=\"button\" value=\"Home\" style=\"color:green;background:#F1F0D1;padding-top:5px;padding-right:5px;padding-bottom:5px;padding-left:5px;border-radius:4px;border:none;border-bottom:4px solid #27aE60;cursor:pointer;height:40px;width:100px;margin-right:30px; \"></a>\n");
      out.write("    <h2>Detailed result: </h2>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write(" ");

   String email=(String)session.getAttribute("email");
    Connection conn=Connect_File.getConnection();
    String query1="select * from c_questions";
    String query2="select * from c_answers where email=? order by sno";
    PreparedStatement ps1=conn.prepareStatement(query1);
    PreparedStatement ps2=conn.prepareStatement(query2);
    ps2.setString(1,email);
    ResultSet rs1=ps1.executeQuery();
    ResultSet rs2=ps2.executeQuery();
    int cnum=0;
    
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("    ");

    while (rs1.next()&& rs2.next()){
    String sno=rs1.getString("sno");
    String ques=rs1.getString("question");
    String a=rs1.getString("opt1");
    String b=rs1.getString("opt2");
    String c=rs1.getString("opt3");
    String d=rs1.getString("opt4");
    String correct=rs1.getString("correct_opt");
    String userans=rs2.getString("userans");
   
   if(correct.equals(userans)){
       cnum++;
 	 }
	
      out.write('\n');

   int res=5;
 //String result=request.getParameter("cnum");
  //int res=Integer.parseInt(result);
   String query3="insert into user_details (Result)"+" values(?)";
   PreparedStatement ps3=conn.prepareStatement(query3);
    ps3.setInt(1,res);
    ps3.executeUpdate();
   
  
      out.write("\n");
      out.write("       \n");
      out.write("   <b class=\"text\"> Question ");
      out.print(sno);
      out.write(':');
      out.write(' ');
      out.print(ques);
      out.write("</b><br>\n");
      out.write("   <b class=\"text\"> a) ");
      out.print(a);
      out.write("</b><br>\n");
      out.write("   <b class=\"text\"> b) ");
      out.print(b);
      out.write("</b><br>\n");
      out.write("   <b class=\"text\"> c) ");
      out.print(c);
      out.write("</b><br>\n");
      out.write("   <b class=\"text\"> d) ");
      out.print(d);
      out.write("</b><br>\n");
      out.write("   <b class=\"text\"> Correct Answer: ");
      out.print(correct);
      out.write("</b><br>\n");
      out.write("   <b class=\"text1\"> Your Answer: ");
      out.print(userans);
      out.write("</b><br><br>\n");
      out.write("    \n");
      out.write("    ");

    }
	out.println("<b class='text1'>Number of Correct Answers: "+cnum+"</b>");
	
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t");

    conn.close();  
   
      out.write("    \n");
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
