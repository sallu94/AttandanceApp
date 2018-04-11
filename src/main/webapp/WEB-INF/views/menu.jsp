<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Attendence Management System</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
		<script src="js/menu.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>     
		<link rel="stylesheet" href="css/style.css">	
    </head>
    <body>
        <div class="wrapper">
            <nav id="sidebar">
                <div class="sidebar-header">
                	<div class="col-sm-12">
                	<div class="col-sm-10"><img id="ymcaLogo" alt="" src="icons/ymca.png" class="closeIcon" height="100" width="100" style="margin-left: 20px"/></div>
                	<div class="col-sm-2"><img  id="closeMenu" alt="" src="icons/left.png" class="closeIcon" height="20" width="20" /></div>
                	</div>
                	<br/><br/><br/><br/><br/>
                    <h5><p  id="ymcaText" style="color: white;font-weight: bold; text-align: center;">YMCA University<br>Attandence Management System</p></h3>
                </div>

                <ul class="list-unstyled components">
                    <li class="active">
                        <a href="#homeSubmenu"><i class="glyphicon glyphicon-home"></i>Home</a>
                    </li>
                    <li>
                        <a href="#"><i class="glyphicon glyphicon-briefcase"></i>About
                        </a>
                        <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false">
                            <i class="glyphicon glyphicon-duplicate"></i>
                            Pages
                        </a>
                        <ul class="collapse list-unstyled" id="pageSubmenu">
                            <li><a href="#">Page 1</a></li>
                            <li><a href="#">Page 2</a></li>
                            <li><a href="#">Page 3</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>

            <!-- Page Content Holder -->
	            <div id="content">
	
	                
	            </div>
        </div>
    </body>
</html>



