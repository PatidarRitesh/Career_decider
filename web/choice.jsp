
<%
	if(session.getAttribute("name")==null){
		response.sendRedirect("user.jsp");
	}
%>
<%@include file="head.jsp" %>
<!DOCTYPE Html >
<html>
<head>
<style type="text/css">
.container{
	width:800px;
	height:350px;
	text-align:center;
	background-color:rgba(52, 73, 94, 0.7);
	border-radius:4px;
	margin:0 auto;
	margin-top:-18px;	
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
margin-left:900px;
margin-top:-30px;

}
.aligncenter{
    text-align:center;
}
</style>

</head>
<body>
	
    <form action="userlogout">
	<b style="text-transform: capitalize; margin-top:-10px; font-size: 2em; color:#ffff80;margin-left:50px;">welcome ${name}</b>
	<input type="submit" class="signout" value="Sign Out"><br><br>
    </form>
 
    <a href="beginc.jsp">
        <p class="aligncenter"><img src="test.jpg" width="300" height="300" align="middle"  style="padding-top:20px;"> </a>
  

</body>
</html>
<%@include file="foot.jsp" %>