<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Dead Doctors beyond the obituary</title>

    <!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/freelancer.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

</head>

<body id="page-top" class="index">

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#page-top">Dead Doctors <br/>beyond the obituary</a>               
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li class="page-scroll">
                        <a href="/search#about">About</a>
                    </li>
                    <li class="page-scroll">
                        <a href="/search#contact">Contact Us</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- About Section -->
    <section>
        <div class="container content ">

            <div class="row">
                <div class="col-lg-7 col-lg-offset-1">
                    <h2>Search Results</h2>
                    <p>You have searched for <i>${searchTerm}</i> as ${searchType}</p>
                    <br/>                 
                    <c:choose>
                    	<c:when test="${empty doctors}">
                    		<p>No results found </p>
                    	</c:when> 
                    	<c:otherwise>
							<c:forEach var="doctor" items="${doctors}">
								<blockquote>
		
		                    	<a href="/doctor">
		                      	<p>${doctor.deadName}</p>
		                      	</a>
							  <footer>${doctor.notes}</footer>
							  
							</blockquote>
							</c:forEach>
                    	</c:otherwise>
                    </c:choose>
															
                </div>
                <div class="col-lg-4">
                <div class="famous-drs">
             
                    <h2>Dead Doctor's Society</h2>
                    <p>Dr's of interest and a bit about them</p>
                    <div id="bio-pic"><img class="img-responsive" src="img/doctor-bio.png" alt=""></div>
                    <h3><span class="name">Graham Neale</span></h3>
                    <p><a href="http://www.bmj.com/content/347/bmj.f6712" target="_blank">Find out more...</a></p>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sit amet nunc a ante gravida molestie. Duis quis pellentesque eros. Aliquam sed nulla et arcu molestie auctor. Sed pulvinar tempor dolor sed euismod. Donec quis commodo lacus.<p>
                    <p> Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum commodo nibh eu orci tincidunt, id facilisis lorem accumsan. Nulla finibus ornare nulla, a sagittis massa convallis id. Proin lacus orci, laoreet nec rutrum a, pretium nec dui. </p>
                </div>
                </div>
                
            </div>
        </div>
    </section>



    <!-- Footer -->
    <footer class="text-center">
        <div class="footer-above">
            <div class="container">
                <div class="row">
                    <div class="footer-col col-md-3">
                      
                    </div>
                    <div class="footer-col col-md-6">
                        <h3>Keep up to date with who just popped their cloggs</h3>
                        <ul class="list-inline">
                            <li>
                    
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-facebook"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-google-plus"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-twitter"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-linkedin"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-dribbble"></i></a>
                            </li>
                        </ul>
                    </div>
                    <div class="footer-col col-md-3">
                        
                        <p></p>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer-below">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                   &copy; 2015 The Dead Drs Team and BMJ Publishing Group Ltd
                    </div>
                </div>
            </div>
        </div>
    </footer>

    <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
    <div class="scroll-top page-scroll visible-xs visible-sm">
        <a class="btn btn-primary" href="#page-top">
            <i class="fa fa-chevron-up"></i>
        </a>
    </div>


    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="js/classie.js"></script>
    <script src="js/cbpAnimatedHeader.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/freelancer.js"></script>

</body>

</html>
