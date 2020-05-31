<%@page import="db.Connect_File"%>
<%@page import="java.sql.*"%>
<%@include file="head.jsp" %>
<html>
    <body background="im.jpg">
        <b>
            <a href="modifyjava.jsp">HOME</a>
             <a href="deletejavaques.jsp">Delete more Courses</a>
<% 
   int course=Integer.parseInt(request.getParameter("delete"));
   
   Connection conn=Connect_File.getConnection();
   String query="delete from courses where Course_id=?";
   PreparedStatement ps=conn.prepareStatement(query);
   ps.setInt(1,course);
   ps.executeUpdate();
   conn.close();
   
%>   

<br><br>
"Courses deleted!!"<br><br><br><br><br><br><br><br><br>
<%@include file="foot.jsp" %>
</b>
</body> 
</html>