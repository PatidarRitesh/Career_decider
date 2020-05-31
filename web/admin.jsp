
<%
	if (session.getAttribute("adminname") == null) {
		response.sendRedirect("admin2.jsp");
	}
%>


<!DOCTYPE html>
<html>
    <head>
        <title>Online Evaluation</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        
        <style type="text/css">
.container{
	width:800px;
	height:370px;
	text-align:center;
	background-color:rgba(52, 73, 94, 0.7);
	border-radius:4px;
	margin:0 auto;
	margin-top:-60px;	
	}
.signout{
color:green;
background:#F1F0D1;
padding-top:5px;
padding-right:5px;
padding-bottom:5px;
padding-left:5px;
border-radius:4px;
border:none;
border-bottom:4px solid #27aE60;
cursor:pointer;
height:40px;
width:100px;
margin-left:1100px;
}
.text{
	color:#ffff80;
	font-style:oblique;
	font-size:1.9em;
	padding-left:100px;
	}
</style>
          
    </head>
    <body background="book.jpg">
    <%@include file="head.jsp"%>
   
   <form action="userlogout">
	<input type="submit" class="signout" value="Sign Out"><br><br>
    </form>
    <DIV class="container">
    <h1 class="text" style="text-align: center;">modify Test and Courses</h1>
 
    <a href="modifyc.jsp"><input type="button" value="Test" class="sign out"></a>
    <a href="modifyjava.jsp"><input type="button" value="Courses" class="sign out"> </a>
    </DIV>
   
</body>
<%@include file="foot.jsp" %>
</html>