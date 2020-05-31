<%@include file="head.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modify Course Module</title>
        <style type="text/css">
.container {
	width: 950px;
	height: 440px;
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
	
}
.text{
	color:#ffff80;
	font-style:oblique;
	font-size:1.2em;
	
}
</style>

        
    </head>
    <body > 
        
            <div class="container">
     <form action="ujq.jsp" method="post">
    <b class="text">Course_id</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="text" name="Course_id"><br>
	<br> 
    <b class="text">Course_name</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="text" size="100" style="height: 100px"  name="Course_name"><br>
	<br>    
	<b class="text">Course_duration</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="text" size="50" name="Course_duration"><br>   
	<br>
  <b class="text">Course_type</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="text" size="50" name="Course_type"><br>   
	<br>
  <b class="text">Course_url</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="text" size="50" name="Course_url"><br>  
   <b class="text">Course_grade</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="text" size="50" name="Course_grade"><br>   
	    
	
        <input type="submit" value="Update" class="signout"  style="margin-left:200px;"> <a href="viewjavaquestions.jsp"><input type="button" value="View COURSES" class="signout"></a>
	<a href="deletejavaques.jsp"><input type="button" value="DELETE COURSES" class="signout"></a>
	<br> 
	</form>          
           </div>
    </body>
</html>
<%@include file="foot.jsp" %>