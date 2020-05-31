<%@page import="db.Connect_File"%>
<%@page import="java.sql.*"%>
<%@include file="head.jsp" %>
<html>
<body background="im.jpg">
<% 
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
if((Countrow.equals("0")) && (p.equals(p1))){
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

%>
</body>
<jsp:forward page="user.jsp"/>
<%@include file="foot.jsp" %>    
</html>