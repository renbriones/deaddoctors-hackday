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
                <a href="/"><img src="img/bmj-logo.png" class="img-responsive"></a><a class="navbar-brand" href="#page-top">Dead Doctors <br/><span class="sml">beyond the obituary</span></a>               
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden"> </li>
                    <li class="page-scroll">
                        <a href="#about">About</a>
                    </li>
                    <li class="page-scroll">
                        <a href="#contact">Contact Us</a>
                    </li>                    
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- Header -->
    <header>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <img class="img-responsive" src="img/profile2.png" alt="">
		            
                    <div id="main-search" class="intro-text">
                   <form> 
                    <div class="input-group">
               
               	<input type="hidden" id="searchType" value="all" name="searchType">
                <input type="hidden" id="search_param" value="all" name="search_param">         

                <input id="searchTerm" type="text" placeholder="Search for a specific obituary e.g. by name, cause of death" name="x" class="form-control input-lg">


               
                <div class="input-group-btn">
                 <div class="btn-group search-panel">
                    <button data-toggle="dropdown" class="btn btn-default dropdown-toggle" type="button">
                    	<span id="search_concept">Filter by</span> <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                          <li><a name="deadName" href="#">Name</a></li>
                          <li><a name="causeOfDeath" href="#">Cause of death</a></li>
                          <li><a name="age" href="#">Age at death</a></li>
                          <li><a name="role" href="#">Specialty</a></li>                  
                          <li><a name="qualifiedPlace" href="#">Medical school</a></li>
                        </ul>
                </div>

                    <button type="button" id="searchButton" class="btn btn-default"><span class="fa fa-search fa-2x"></span></button>

                </div>
            </div>
                    
                    </form>
                       
                    </div>
                </div>
            </div>
        </div>
    </header>

    <!-- About Section -->
    <section id="about" class="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>About</h2>
                    <hr class="star-light">
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4 col-lg-offset-2">
                    <p>Dead Doctors is a BMJ Hackday 2015 project. Created by Irene Briones, Olivier Renard, Chris Standing, Sean Harrop and Helen Morant. Design by Amy Asante. Consulting help from Helen King, Andy Townsend, Birte Twisselman and Simon Devitt.</p>

<p>The idea behind this project is based on user research - BMJ readers rate the obituaries as one of their favourite parts of the journal. But we make it relatively difficult for users to find obituaries online, and we don’t highlight the interesting facts that obituaries reveal. The 1996 christmas edition published Which doctors die first? Analysis of <a href="http://www.bmj.com/content/313/7072/1581.full">BMJ obituary columns</a> and we decided that it was time to open up this data to anyone who wanted to dig up more information from our corpsus.</p>
<p>The idea is to satisfy doctors’ morbid fascination in their colleagues’ deaths - what they died of, how old they were, and which specialities and medical schools were most likely to lead to what type of death.
</p>
                </div>
                <div class="col-lg-4">
                    <p> It’s a search based on the data in the obituary, which we’ve extracting using XXXX and made available on elasticsearch.</p>

<p>Future developments would be based on feedback from users, but we think they want to save and export searches, and filter their search by various factors.  We would also look to using more sophisticated text mining techniques to extract searchable information from the body of the obituary text, as well as the footnote.This would enable us to find more information about our dead doctors - number and profession of spouses and children, for example.</p>

<p>We also might look to expanding the obituaries searched to be more comprehensive than just ones published in The BMJ, and include other health professionals.  </p>
                </div>
                
            </div>
        </div>
    </section>



    <!-- Footer -->
    <footer class="text-center" id="contact">
        <div class="footer-above">
            <div class="container">
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
                    <div class="footer-col col-md-3"> </div>
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

	<script src="js/deaddoctor.js"></script>
	
</body>

</html>
