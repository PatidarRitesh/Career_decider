
<%@include file="head.jsp" %>
<!DOCTYPE HTML>
<HEAD>
<TITLE>Signup_page</TITLE>
<LINK rel="stylesheet" type="text/css" href="signup.css"></LINK>
</HEAD>
<BODY>
	<DIV class="container">
		<!---->
		<form action="data_save.jsp" method="post">
			<TABLE>
				<TR>
					<TD><h2 class="pera">Username :</h2></TD>
					<TD>
						<DIV class="form-input">
							<INPUT type="text" name="user" placeholder="Enter Username" class="get">
						</DIV>
					</TD>
				</TR>
				<TR><TD><h2 class="pera">Password :</h2></TD>
					<TD>
						<DIV class="form-input">
							<INPUT type="password" name="pass" placeholder="Enter Password">
						</DIV>
					</TD>
				</TR>
				<TR><TD><h2 class="pera">Confirm Password :</h2></TD>
					<TD>
						<DIV class="form-input">
							<INPUT type="password" name="pass1" placeholder="Conform Password">
						</DIV>
					</TD>
				</TR>
                                <TR><TD><h2 class="pera">Mobile:<br>(format: xxxxxxxxxx)</h2></TD>
					<TD>
						<DIV class="form-input">
                                                     <INPUT type="tel" pattern="^\d{10}$" required placeholder="Enter Mobile Number">
						</DIV>
					</TD>
				</TR>
				<TR><TD><h2 class="pera">Email :</h2</TD>
					<TD>
						<DIV class="form-input">
							<INPUT type="email" name="email" placeholder="Enter Email Account">
						</DIV>
					</TD>
				</TR>
		<!--		<TR><TD><p class="pera">City Name :</p></TD>
					<TD>
						<DIV class="form-input">
							<INPUT type="text" name="city" placeholder="Enter Your City">
						</DIV>
					</TD>
		
             		</TR> 
   -->
                                <TR><TD><h2 class="pera">What is your Stream?</h2></TD>
                                        <TD>
                                            <DIV class="form-input">
                                                <p> <input type="radio" name="Stream" value="pcm">PCM
                                                <input type="radio" name="Stream" value="pcb">PCB
                                                <input type="radio" name="Stream" value="ag"> Agriculture
                                                <input type="radio" name="Stream" value="com">Commarce
                                                <input type="radio" name="Stream" value="art">Arts</P>
                                         </DIV> 
                                         </TD>
      	
                                </TR>    
                                        
                                      
                        
                        
                                
                                
                                
				<TR><TD colspan="2">
						<INPUT type="submit" name="submit" value="Signup" class="btn-signup">
						<INPUT type="reset" name="clear" value="Clear" class="btn-clear">
                                               
					</TD>
				</TR>
			</TABLE>
                    <a href="user.jsp"><input type="button" value="Already Register ?"></a>
		</form>
	</DIV>	
<%@ include file="foot.jsp"%>