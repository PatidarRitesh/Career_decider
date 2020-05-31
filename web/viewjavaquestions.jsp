
<%@page import="db.Connect_File"%>
<%@page import="java.sql.*"%>
<%@include file="head.jsp" %>

<!DOCTYPE html>
<html>
<head>
<title>path </title>
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
    String Course_id=rs.getString("Course_id");
    String Course_name=rs.getString("Course_name");
    String Course_duration=rs.getString("Course_duration");
    String Course_type=rs.getString("Course_type");
    String Course_url=rs.getString("Course_url");
    String Course_grade=rs.getString("Course_grade");


%>
    
    <b class="text">Course_id <%=Course_id%></b><br>
        
    <b class="text">Course Name <%=Course_name%></b><br>
    <b class="text">Course Duration <%=Course_duration%></b><br>
    <b class="text">Course Type <%=Course_type%></b><br>
    <b class="text">Course Url <%=Course_url%></b><br>
     <b class="text">Course Grade <%=Course_grade%></b><br>
    
 
    <%
    }
    conn.close();  
    %>
    <a href="updatejavaques.jsp"><input type="button" value="Add Couses" class="signout"></a><a href="deletejavaques.jsp"><input type="button" value="Delete Courses" class="signout"></a>
</div>
<%@include file="foot.jsp" %>
</body>
</html>