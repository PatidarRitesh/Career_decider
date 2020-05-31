<%@page import="db.Connect_File"%>
<%@page import="java.sql.*"%>
<%@include file="head.jsp" %>
<html>
    <body background="im.jpg"><b>
             <a href="modifyjava.jsp">HOME</a><br>
			<a href="updatejavaques.jsp">add more COURSES</a><br>
			<a href="deletejavaques.jsp">delete COURSES</a><br>
			<a href="viewjavaquestions.jsp">VIEW COURSES</a><br><br>
<% 
   String cd=request.getParameter("Course_id");
   int Course_id=Integer.parseInt(cd);
   String Course_name=request.getParameter("Course_name");
   String Course_duration=request.getParameter("Course_duration");
   String Course_type=request.getParameter("Course_type");
   String Course_url=request.getParameter("Course_url");
   String Course_grade=request.getParameter("Course_grade");
   
   
   Connection conn=Connect_File.getConnection();
   String query="insert into courses values(?,?,?,?,?,?)";
   PreparedStatement ps=conn.prepareStatement(query);
   ps.setInt(1,Course_id);
   ps.setString(2,Course_name);
   ps.setString(3,Course_duration);
   ps.setString(4,Course_type);
   ps.setString(5,Course_url);
   ps.setString(6,Course_grade);
 
   ps.executeUpdate();
   
   out.println("Course Added!"); 
   conn.close();
%>              

<br><br><br><br><br><br><br><br><br><br><br><br><br>
<%@include file="foot.jsp" %>
        </b>
</body> 
</html>