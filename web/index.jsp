<%-- 
    Document   : index
    Created on : Oct 3, 2019, 8:18:48 AM
    Author     : Ritesh Patidar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <!-- Basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
   
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
 
     <!-- Site Metas -->
    <title>Career decider</title>  
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Site Icons -->
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />
    <link rel="apple-touch-icon" href="images/apple-touch-icon.png">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Site CSS -->
    <link rel="stylesheet" href="style.css">
    <!-- Colors CSS -->
    <link rel="stylesheet" href="css/colors.css">
    <!-- ALL VERSION CSS -->
    <link rel="stylesheet" href="css/versions.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/custom.css">

    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body class="seo_version">
<%
    String name=(String)session.getAttribute("name");
    
    if(name==null || name.equals(""))
    {
        response.sendRedirect("index.html");
    }
%>
	<!-- LOADER -->
	<div id="preloader">
		<div id="cupcake" class="box">
			<span class="letter">L</span>
			<div class="cupcakeCircle box">
				<div class="cupcakeInner box">
					<div class="cupcakeCore box"></div>
				</div>
			</div>
			<span class="letter box">A</span>
			<span class="letter box">D</span>
			<span class="letter box">I</span>
			<span class="letter box">N</span>
			<span class="letter box">G</span>
		</div>
	</div>
	<!-- END LOADER -->
	
    <header class="header header_style_01">
        <nav class="megamenu navbar navbar-default">
            <div class="container">
                <div class="navbar-header"> 
                  <a class="navbar-brand" href="index.html"><img src="images/logos/nwlogo.jpg" alt="Career Decider"></a>
				  <!--  <h1> <b> Carrer decider </b></h1> -->
                </div>
                <div id="navbar" class="navbar-collapse collapse">
					<!--<ul class="nav navbar-nav navbar-right hidden-md hidden-sm hidden-xs">
                        <li><a class="btn-light btn-radius btn-brd top-btn" href="#"><i class="fa fa-angle-double-right"></i>SEO Analysis</a></li> -->
                    </ul>
                    <ul class="nav navbar-nav navbar-right menu-top">

                        <li><a href="profile1.jsp">Welcome <%=name%> </a></li>

                        <li><a class="active" href="index.html">Home</a></li>
                        <li><a href="courses.html">Courses</a></li>
                      <!-- <li><a href="logout.jsp">logout</a></li -->        
                       
                        <li><a href="choice.jsp">Test</a></li>
                      <!--  <li><a href="pricing.html">Pricing</a></li> -->
                        <li><a href="contact.html">Contact</a></li>
                        
                        <li><a><form action="userlogout">
                            
	               <input type="submit"  value="logout">
                         </form> </a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <div id="home" class="parallax first-section" data-stellar-background-ratio="0.4" style="background-image:url('uploads/parallax_12.jpg');">
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-sm-12">
                    <div class="big-tagline">
                        <h2>When life gets harder<br> challenge your self to be stronger</h2>
                       <!-- <p class="lead">With FLaxSEO responsive landing page template, you can showcase your awesome seo services!</p>
                        <a href="#support" class="btn btn-light btn-radius btn-brd ban-btn">Free SEO Analysis</a> -->
                    </div>
                </div>

                <div class="app_iphone_02 wow slideInUp hidden-xs hidden-sm" data-wow-duration="1s" data-wow-delay="0.5s">
                    <img src="uploads/rocket.png" alt="" class="img-responsive">
                </div>
            </div><!-- end row -->
        </div><!-- end container -->
    </div><!-- end section -->
    
   <div id="about" class="section wb nopadtop">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <div class="post-media wow fadeIn">
                        <img src="uploads/about_01.jpg" alt="" class="img-responsive img-rounded">
                                <a href="http://www.youtube.com/watch?v=nrJtHemSPW4" data-rel="prettyPhoto[gal]" class="playbutton">
                                    <i class="flaticon-play-button"></i></a>
                    </div><!-- end media -->
                </div><!-- end col -->

                <div class="col-md-6 m40">
                    <div class="message-box">
                        <h2>We Are career decider</h2>
                        <div class="skills">
                            <div class="skills-wrapper">
                                <h3>Set your own goal.</h3>
                                <div class="progress">
                                    <div class="progress-bar progress-bar-success color6 wow slideInLeft" role="progressbar" aria-valuenow="78" aria-valuemin="0" aria-valuemax="100" style="width: 78%">
                                    </div>
                                </div>
                            </div><!-- end skills-wrapper -->

                            <div class="skills-wrapper">
                                <h3>Decide your best career</h3>
                                <div class="progress">
                                    <div class="progress-bar progress-bar-success color2 wow slideInLeft" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%">
                                    </div>
                                </div>
                            </div><!-- end skills-wrapper -->

                            <div class="skills-wrapper">
                                <h3>check your ability</h3>
                                <div class="progress">
                                    <div class="progress-bar progress-bar-success color3 wow slideInLeft" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                    </div>
                                </div>
                            </div><!-- end skills-wrapper -->
                                    </div>
                                </div> 
                            </div> --> <!-- end skills-wrapper -->
                        </div><!-- end skills -->
                    </div><!-- end messagebox -->
                </div><!-- end col -->
            </div><!-- end row -->
            
            <hr class="hr1">
			
            <div class="section-title text-center">
                <small>The career Decider</small>
                <h3>Who We Are</h3>
                <p class="lead">We are career counselor, we offer to choose your best future.</p>
            </div><!-- end title -->
	
        <div class="first">
            <div class="seo-services row clearfix">
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <div class="who">
                        <a href="maths.jsp"> <img  src="images/seo-icons/growth.svg" alt="icon" class="wow fadeInUp"S> </a>
                        <h4><a href="maths.jsp">Mathematics</a></h4>
                    <p class="lead">Mathematics is the science that deals with the logic of shape,<br> quantity and arrangement..
                        </p>
                    </div>
                </div><!-- end col -->

                <div class="col-md-3 col-sm-6 col-xs-12">
					<div class="who">
						<a href="bio.jsp"> <img src="images/seo-icons/research.svg" alt="icon" class="wow fadeInUp"> </a>
                                                <h4><a href="bio.jsp">Biology</a></h4>
						<p class="lead">Biology is the science of life. Its name is derived from the Greek words "bios" (life) and 
                                                    "logos" (study)..</p>
					</div>
                </div><!-- end col -->

                <div class="col-md-3 col-sm-6 col-xs-12">
					<div class="who">
                                            <a href="ag.jsp"> <img src="images/seo-icons/stopwatch.svg" alt="icon" class="wow fadeInUp"></a>
                                                <h4> <a href="ag.jsp">Agriculture </a></h4>
                                                <p class="lead">Agriculture is the science and <br>art of cultivating plants <br>and livestock..</p>
					</div>
                </div><!-- end col -->  

                <div class="col-md-3 col-sm-6 col-xs-12">
					<div class="who">
                                            <a href="com.jsp"> <img src="images/seo-icons/development.svg" alt="icon" class="wow fadeInUp"> </a>
                                                <h4><a href="com.jsp"> Commerce </a></h4>
						<p class="lead">Commerce as a stream of education can be defined as a study of trade and business 
                                                    activities.</p>
					</div>
                </div><!-- end col -->
             </div><!-- end how-its-work -->
        </div><!-- end container -->
    </div><!-- end section -->
</div><br>
<div class="second">
            <div class="seo-services row clearfix">
                <div class="col-md-3 col-sm-6 col-xs-12">
					<div class="who">
                                            <a href="arts.jsp"> <img src="images/seo-icons/development.svg" alt="icon" class="wow fadeInUp"> </a>
                                                <h4><a href="arts.jsp"> Arts </a></h4>
						<p class="lead">Art is a diverse range of human activities in creating visual, auditory or performing 
                                                    artifacts</p>
					</div>
                </div><!-- end col -->		
            </div><!-- end how-its-work -->
        </div><!-- end container -->
    </div><!-- end section -->
</div>
</div><br><br>

    <svg id="clouds1" class="hidden-xs" xmlns="http://www.w3.org/2000/svg" version="1.1" width="100%" height="100" viewBox="0 0 85 100" 
	     preserveAspectRatio="none">
        <path d="M-5 100 Q 0 20 5 100 Z
            M0 100 Q 5 0 10 100
            M5 100 Q 10 30 15 100
            M10 100 Q 15 10 20 100
            M15 100 Q 20 30 25 100
            M20 100 Q 25 -10 30 100
            M25 100 Q 30 10 35 100
            M30 100 Q 35 30 40 100
            M35 100 Q 40 10 45 100
            M40 100 Q 45 50 50 100
            M45 100 Q 50 20 55 100
            M50 100 Q 55 40 60 100
            M55 100 Q 60 60 65 100
            M60 100 Q 65 50 70 100
            M65 100 Q 70 20 75 100
            M70 100 Q 75 45 80 100
            M75 100 Q 80 30 85 100
            M80 100 Q 85 20 90 100
            M85 100 Q 90 50 95 100
            M90 100 Q 95 25 100 100
            M95 100 Q 100 15 105 100 Z">
        </path>
    </svg>

	<footer class="footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <div class="widget clearfix">
                        <div class="widget-title">
                           <img src="images/logos/nwlogo.jpg" alt=""> 
                        </div>
                        <p> Career counselling sessions helps the students to know the pros and cons of the different streams, 
						    courses and educational options and the career path it offers, thus the students can make an informed choice,
     						and get a career assessment that helps avoid the risk of change in career path later in life..</p>
                        <p>  </p>
                    </div><!-- end clearfix -->
                </div><!-- end col -->

                <div class="col-md-3 col-sm-3 col-xs-12">
                    <div class="widget clearfix">
                        <div class="widget-title">
                            <h3>Contact Details</h3>
                        </div>

                        <ul class="footer-links">
                            <li><a href="mailto:#">career.decider@.com</a></li>
                            <li><a href="#">www.knowledgeultimate.com</a></li>
                            <li>Vaishali nagar Gate No.2,Gopur Square,Indore</li>
                            <li>+91 9174937425</li>
                        </ul><!-- end links -->
                    </div><!-- end clearfix -->
                </div><!-- end col -->

                <div class="col-md-2 col-sm-2 col-xs-12">
                    <div class="widget clearfix">
                        <div class="widget-title">
                            <h3>Social</h3>
                        </div>
                        <ul class="footer-links social-md">
                            <li><a class="fb" href="#"><i class="fa fa-facebook"></i> Facebook</a></li>
                            <li><a class="gi" href="#"><i class="fa fa-github"></i> Github</a></li>
                            <li><a class="tw" href="#"><i class="fa fa-twitter"></i> Twitter</a></li>
                            <li><a class="dr" href="#"><i class="fa fa-dribbble"></i> Instagram</a></li>
                        </ul><!-- end links -->
                    </div><!-- end clearfix -->
                </div><!-- end col -->
            </div><!-- end row -->
        </div><!-- end container -->
    </footer><!-- end footer -->
	
    <div class="copyrights">
        <div class="container">
            <div class="footer-distributed">
                <div class="footer-left">
                    <p class="footer-company-name">All Rights Reserved. &copy; 2020  
					Design By : Career Decider.
                </div>

                
            </div>
        </div><!-- end container -->
    </div><!-- end copyrights -->

    <a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>

    <!-- ALL JS FILES -->
    <script src="js/all.js"></script>
    <!-- ALL PLUGINS -->
    <script src="js/custom.js"></script>

</body>
</html>