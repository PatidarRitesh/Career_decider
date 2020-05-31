
<%@page import="db.Connect_File"%>
<%@page import="java.sql.*"%>
<%@include file="head.jsp"%>
<!DOCTYPE html>
<html>

<head>
<title>Modify  database</title>
<style type="text/css">
.container {
	width: 950px;
	height: 1800px;
	padding-left:80px;
	padding-top:40px;
	background-color: rgba(52, 73, 94, 0.7);
	border-radius: 4px;
	margin: 0 auto;
	margin-top: 18px;
}

.signout {
	color: green;
	background: #F1F0D1;
	padding-top: 5px;
	padding-right: 5px;
	padding-bottom: 5px;
	padding-left: 5px;
	border-radius: 4px;
	border: none;
	border-bottom: 4px solid #27aE60;
	cursor: pointer;
	height: 40px;
	width: 150px;
	margin-left: 210px;
	
}
.text{
	color:#ffff80;
	font-style:oblique;
	font-size:1.2em;
	
}
</style>

</head>
<body>
   
    

<% 
    Connection conn=Connect_File.getConnection();
    String query="select * from courses";
    PreparedStatement ps=conn.prepareStatement(query);
    ResultSet rs=ps.executeQuery();
    %>
    <div class="container">
    <h2 style="color:#ffff80;text-align: center;">Courses Database:</h2>
    <%
    while (rs.next()){
    String cs=rs.getString("Course_id");
    int Course_id=Integer.parseInt(cs);
    String Course_name=rs.getString("Course_name");
    String Course_duration=rs.getString("Course_duration");
    String Course_type=rs.getString("Course_type");
    String Course_url=rs.getString("Course_url");
    String Course_grade=rs.getString("Course_grade");
  
%>
    
    <b class="text">Course <%=Course_id%>: <%=Course_name%></b><br>
    <b class="text">Duration <%=Course_duration%></b><br>
    <b class="text">Type <%=Course_type%></b><br>
    <b class="text">Url <%=Course_url%></b><br>
    <b class="text">grade <%=Course_grade%></b><br>
    
 
    <%
    }
    conn.close();  
    %>
     <fieldset style="width: 600px; margin-left: 150px;">
   
    <form action="djq.jsp" method="post"><br>
    <b class="text">Enter the Course_id you wish to delete:</b>              
	 &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="delete"><br>   
	<br>			
	<input type="submit" value="Delete" class="signout">
        <br><br>
     </form>
            </fieldset>
	 </div>
<%@include file="foot.jsp" %>
</body>
</html>